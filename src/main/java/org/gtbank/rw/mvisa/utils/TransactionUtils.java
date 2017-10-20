package org.gtbank.rw.mvisa.utils;

import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gtbank.rw.mvisa.domain.AccountStatusResponse;
import org.gtbank.rw.mvisa.domain.BalanceResponse;
import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.gtbank.rw.mvisa.domain.ExchangeRateResponse;
import org.springframework.stereotype.Service;
import org.tempuri.AppDevService;
import org.tempuri.AppDevServiceSoap;
/**
 * A utility class for {@link AtmCardChargeTransaction}
 * @author Bailly RURANGIRWA
 */
@Service
public class TransactionUtils {
	/** Logger for this class */
	protected final static Log log = LogFactory.getLog(TransactionUtils.class);
	/**
	 * Retrieves the account balance by calling {@link #getAccountBalance(String)} web service method
	 * @param customerAccount The account to get the balance for
	 * @return An integer value of the balance on the account
	 */
	public static double getAccountBalance(String customerAccount){
		String[] tokens = customerAccount.split("/");
		AppDevService appDevsevice = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevsevice.getAppDevServiceSoap();
		String unicode = appDevServiceSoap.getAccountBalance(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
		String balanceResponse = StringEscapeUtils.unescapeJava(unicode);
		return getAvailableBalance(balanceResponse);
	}

	public static int getAccountStatus(String customerAccount){
		String[] tokens = customerAccount.split("/");
		AppDevService appDevsevice = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevsevice.getAppDevServiceSoap();
		String statusResponse = appDevServiceSoap.getAccountStatus(tokens[0], tokens[1], Integer.valueOf(tokens[2]), tokens[3], Integer.valueOf(tokens[4]));
		return getAccountStatusCode(statusResponse);
	}

	/**
	 * Parse the XML response from GTBTECHAPPDEV #getAccountBalance method
	 * @param responseBody A string XML representation of the response received from calling #getAccountBalance
	 * @return Integer value of the AVAILABLEBALANCE XML node
	 */
	public static double getAvailableBalance(String responseBody){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(BalanceResponse.class);
			Unmarshaller  jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(responseBody);

			BalanceResponse result = (BalanceResponse) jaxbUnmarshaller.unmarshal(reader);
			if (result != null && result.getAvailableBalance() !=""){
				return Double.parseDouble(result.getAvailableBalance());
			}
		} catch (JAXBException e) {
			log.error("There was an error parsing the get account balance XML response"+e.getStackTrace());
		}
		return 0;
	}

	public static int getAccountStatusCode(String responseBody){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(AccountStatusResponse.class);
			Unmarshaller  jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(responseBody);

			AccountStatusResponse result = (AccountStatusResponse) jaxbUnmarshaller.unmarshal(reader);
			if (result != null && result.getAccountStatus() !=""){
				return Integer.valueOf(result.getAccountStatus());
			}
		} catch (JAXBException e) {
			log.error("There was an error parsing the get account status XML response"+e.getStackTrace());
		}
		return 0;
	}
	
	public static MVisaUser getCustomer(String responseBody){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(MVisaUser.class);
			Unmarshaller  jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(responseBody);

			MVisaUser result = (MVisaUser) jaxbUnmarshaller.unmarshal(reader);
			if (result != null && result.getCode().equalsIgnoreCase("1000")){
				return result;
			}
		} catch (JAXBException e) {
			log.error("There was an error parsing the get customer XML response"+e.getStackTrace());
		}
		return null;
	}

	/**
	 * Retrieves the exchange rate by calling {@link #getExchangeRate(String,String)} web service method
	 * @param currencyCode The currency we want the exchange rate for
	 * @param columnName The column to read from core banking system
	 * @return The value of of the EXCHANGERATE XML node
	 */
	public static double getExchangeRate(String currencyCode, String columnName){

		AppDevService appDevsevice = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevsevice.getAppDevServiceSoap();
		String exchangeRateResponse = appDevServiceSoap.getExchangeRate(currencyCode, columnName);
		return getExchangeRate(exchangeRateResponse);
	}

	/**
	 * Parse the XML response from GTBTECHAPPDEV #getExchangeRate method
	 * @param responseBody A string XML representation of the response received from calling #getExchangeRate
	 * @return Float value of the Exchange Rage node
	 */
	public static double getExchangeRate(String responseBody){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ExchangeRateResponse.class);
			Unmarshaller  jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(responseBody);

			ExchangeRateResponse result = (ExchangeRateResponse) jaxbUnmarshaller.unmarshal(reader);
			return Double.parseDouble(result.getExchangeRate());
		} catch (JAXBException e) {
			log.error("There was an error parsing the get exchange rate XML response"+e.getStackTrace());
		}
		return 0;
	}

	public static Date getDate(String date){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		Date parsedDate = null;
		try {
			if(date != null && date.length() > 0)
				parsedDate = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parsedDate;
	}

}
