package org.gtbank.rw.mvisa.handler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.gtbank.rw.mvisa.domain.Transaction;
import org.gtbank.rw.mvisa.service.MVisaUserService;
import org.gtbank.rw.mvisa.service.TransactionService;
import org.gtbank.rw.mvisa.utils.MethodTypes;
import org.gtbank.rw.mvisa.utils.TransactionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.AppDevService;
import org.tempuri.AppDevServiceSoap;
@Service("cashInPushPaymentsHandler")
public class CashInPushPaymentsHandler {

	String cashInPushPayments;
	
	@Autowired
	MVisaUserService ms;
	
	@Autowired
	TransactionService ts;
	
    @Autowired
	VisaAPIClient visaAPIClient;


	public void setupCashInPushPaymentsRequest(String consumerAccountNumber, String agentAccountNumber, double amount) {
		this.visaAPIClient = new VisaAPIClient();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		TimeZone utc = TimeZone.getTimeZone("UTC");
		sdfDate.setTimeZone(utc);
		Date now = new Date();
		String strDate = sdfDate.format(now);
		this.cashInPushPayments = 
				"{"
						+ "\"acquirerCountryCode\": \"643\","
						+ "\"acquiringBin\": \"400171\","
						+ "\"amount\": \"124.05\","
						+ "\"businessApplicationId\": \"CI\","
						+ "\"cardAcceptor\": {"
						+ "\"address\": {"
						+ "\"city\": \"Bangalore\","
						+ "\"country\": \"IND\""
						+ "},"
						+ "\"idCode\": \"ID-Code123\","
						+ "\"name\": \"Card Accpector ABC\""
						+ "},"
						+ "\"localTransactionDateTime\": \""+ strDate +"\","
						+ "\"merchantCategoryCode\": \"4829\","
						+ "\"recipientPrimaryAccountNumber\": \"4123640062698797\","
						+ "\"retrievalReferenceNumber\": \"430000367618\","
						+ "\"senderAccountNumber\": \"4541237895236\","
						+ "\"senderName\": \"Mohammed Qasim\","
						+ "\"senderReference\": \"1234\","
						+ "\"systemsTraceAuditNumber\": \"313042\","
						+ "\"transactionCurrencyCode\": \"USD\","
						+ "\"transactionIdentifier\": \"381228649430015\""
						+ "}";
	}


	public void executeCashInPushPayments(String agentAccountNumber, String consumerAccountNumber, double amount){
		MVisaUser u = ms.getMVisaUserByAccountNumber(consumerAccountNumber);

		if(u == null){
			return;
		}
		
		//Check if the angent's account has enough balance
		double agentAccountBalance = TransactionUtils.getAccountBalance(agentAccountNumber);
		if ( agentAccountBalance < amount){
			return;
		}
		//Check validity of the consumer's account number
		if(TransactionUtils.getAccountStatus(consumerAccountNumber) != 1){
			return;
		}

		AppDevService appDevService  = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevService.getAppDevServiceSoap();

		try {
			//We first transfer the money from the client's account to the transit account
			appDevServiceSoap.transferFund("211/104140/1/5100/0", "211/184636/1/5107/0", 100, "OWN", "mVisa", "mVisa Transaction to Transit Account");


			//We now proceed to preparing a request to visa API
			setupCashInPushPaymentsRequest(consumerAccountNumber, agentAccountNumber, amount);
			
			//And we do the post to Visa Net
			String baseUri = "visadirect/";
			String resourcePath = "mvisa/v1/merchantpushpayments";
			CloseableHttpResponse response = this.visaAPIClient.doMutualAuthRequest(baseUri + resourcePath, "M Visa Transaction Test", this.cashInPushPayments, MethodTypes.POST, new HashMap<String, String>());

			/*
			 * If the response code is 200, it means the transaction was
			 * successful. We transfer the money from mvisa transit account to
			 * Visa's account
			 */
			if (response.getStatusLine().getStatusCode() == 200) {
				appDevServiceSoap.transferFund("211/184636/1/5107/0", "211/184636/1/5002/0", 100, "OWN", "mVisa", "mVisa Transaction from Transit Account to Merchant Account");
			} 
			
			Transaction t = new Transaction(u, new Date(), cashInPushPayments, response.toString());
            ts.saveTransaction(t);
			
			response.close();
		} catch (Exception e) {
			//TODO: Add logic to retry before marking the transaction as failed
			
			//Transfer the money back from the mvisa transit account to the consumer's account
			appDevServiceSoap.transferFund("211/184636/1/5107/0", "211/184636/1/5002/0", 100, "OWN", "mVisa", "Failed mVisa transaction. Transfer back the money from mvisa transit account to the consumer's account");
		}
	}

}
