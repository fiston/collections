package org.gtbank.rw.mvisa.handler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pushFundsTransactionHandler")
public class PushFundsTransactionHandler {

	String pushFundsTransaction;
	@Autowired
	VisaAPIClient visaAPIClient;

	public void setupPushFundsTransactionRequest() {
		this.visaAPIClient = new VisaAPIClient();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		TimeZone utc = TimeZone.getTimeZone("UTC");
		sdfDate.setTimeZone(utc);
		Date now = new Date();
		String strDate = sdfDate.format(now);
		this.pushFundsTransaction = "{" 
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
				+ "\"localTransactionDateTime\": \""+ strDate + "\"," 
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

	public void executePushFundsTransaction(){

	}

}
