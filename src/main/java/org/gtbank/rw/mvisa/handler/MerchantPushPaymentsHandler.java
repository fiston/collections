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
import org.gtbank.rw.mvisa.utils.MVisaUtils;
import org.gtbank.rw.mvisa.utils.MethodTypes;
import org.gtbank.rw.mvisa.utils.TransactionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.AppDevService;
import org.tempuri.AppDevServiceSoap;
@Service("merchantPushPaymentsHandler")
public class MerchantPushPaymentsHandler {

	String merchantPushPayments;

	VisaAPIClient visaAPIClient;
	
	@Autowired
	TransactionService ts;

	@Autowired
	MVisaUserService ms;

	public void setupMerchantPushPaymentsRequest(String consumerAccountNumber, String merchantAccountNumber, double amount) {
		this.visaAPIClient = new VisaAPIClient();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		TimeZone utc = TimeZone.getTimeZone("UTC");
		sdfDate.setTimeZone(utc);
		Date now = new Date();
		String strDate = sdfDate.format(now);
		this.merchantPushPayments = 
				"{"
						+ "\"acquirerCountryCode\": \"356\","
						+ "\"acquiringBin\": \"408972\","
						+ "\"amount\": \""+amount+"\","
						+ "\"businessApplicationId\": \"MP\","
						+ "\"cardAcceptor\": {"
						+ "\"address\": {"
						+ "\"city\": \"KOLKATA\","
						+ "\"country\": \"IND\""
						+ "},"
						+ "\"idCode\": \"CA-IDCode-77765\","
						+ "\"name\": \"Visa Inc. USA-Foster City\""
						+ "},"
						+ "\"feeProgramIndicator\": \"123\","
						+ "\"localTransactionDateTime\": \""+strDate+"\","
						+ "\"purchaseIdentifier\": {"
						+ "\"referenceNumber\": \"REF_123456789123456789123\","
						+ "\"type\": \"1\""
						+ "},"
						+ "\"recipientName\": \"Jasper\","
						+ "\"recipientPrimaryAccountNumber\": \""+merchantAccountNumber+"\","
						+ "\"retrievalReferenceNumber\": \"412770451035\","
						+ "\"secondaryId\": \"123TEST\","
						+ "\"senderAccountNumber\": \""+consumerAccountNumber+"\","
						+ "\"senderName\": \"Jasper\","
						+ "\"senderReference\": \"\","
						+ "\"systemsTraceAuditNumber\": \"451035\","
						+ "\"transactionCurrencyCode\": \"FRW\","
						+ "\"transactionIdentifier\": \"381228649430015\""
						+ "}";
	}


	public void executeMerchantPushPayments(String consumerAccountNumber, String merchantID, double amount){

		MVisaUser u = ms.getMVisaUserByAccountNumber(consumerAccountNumber);

		if(u == null){
			return;
		}

		//Check if the consumer's account has enough balance to do the payment
		double consumerAccountBalance = TransactionUtils.getAccountBalance(consumerAccountNumber);
		if ( consumerAccountBalance < amount){
			return;
		}
		//Check validity of the merchan's account number
		if(TransactionUtils.getAccountStatus(consumerAccountNumber) != 1){
			return;
		}

		AppDevService appDevService  = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevService.getAppDevServiceSoap();

		try {
			//We first transfer the money from the client's account to the transit account
			appDevServiceSoap.transferFund(consumerAccountNumber, "211/184636/1/5107/0", amount, "OWN", "mVisa", "mVisa Transaction to Transit Account");


			//We now proceed to preparing a request to visa API
			setupMerchantPushPaymentsRequest(consumerAccountNumber, MVisaUtils.generatePANFromMvisaId(merchantID), amount);

			//And we do the post to Visa Net
			String baseUri = "visadirect/";
			String resourcePath = "mvisa/v1/merchantpushpayments";
			CloseableHttpResponse response = this.visaAPIClient.doMutualAuthRequest(baseUri + resourcePath, "M Visa Transaction Test", this.merchantPushPayments, MethodTypes.POST, new HashMap<String, String>());

			/*
			 * If the response code is 200, it means the transaction was
			 * successful. We transfer the money from mvisa transit account to
			 * Visa's account
			 */
			if (response.getStatusLine().getStatusCode() == 200) {
				appDevServiceSoap.transferFund("211/184636/1/5107/0", "211/184636/1/5002/0", amount, "OWN", "mVisa", "mVisa Transaction from Transit Account to Merchant Account");
			} 

			Transaction t = new Transaction(u, new Date(), merchantPushPayments, response.toString());
            ts.saveTransaction(t);
            
			response.close();
		} catch (Exception e) {
			//TODO: Add logic to retry before marking the transaction as failed

			//Transfer the money back from the mvisa transit account to the consumer's account
			appDevServiceSoap.transferFund("211/184636/1/5107/0", consumerAccountNumber, amount, "OWN", "mVisa", "Failed mVisa transaction. Transfer back the money from mvisa transit account to the consumer's account");
		}

	}

}
