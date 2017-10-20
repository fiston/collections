package org.gtbank.rw.mvisa.utils;

import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.tempuri.AppDevService;
import org.tempuri.AppDevServiceSoap;

public class MVisaUtils {

	public static MVisaUser getCustomerFromBanks(String accountNumber) {
		AppDevService appDevsevice = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevsevice.getAppDevServiceSoap();
		MVisaUser c = TransactionUtils.getCustomer(appDevServiceSoap.getCustomerByAccount(accountNumber));
		return c;
	}

	public static String generateAgentId(String proposedPAN) {
		return proposedPAN;
	}
	
	public static String generateMerchantId(String proposedPAN) {
		return proposedPAN;
	}

	public static String generateNewPAN(String bin) {		
		return RandomCreditCardNumberGenerator.completed_number(bin, 16);
	}
	
	public static String generatePANFromMvisaId(String mvisaId) {		
		return mvisaId;
	}

}
