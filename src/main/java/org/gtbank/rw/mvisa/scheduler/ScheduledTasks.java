package org.gtbank.rw.mvisa.scheduler;

import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.gtbank.rw.mvisa.utils.TransactionUtils;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.tempuri.AppDevService;
import org.tempuri.AppDevServiceSoap;


@Service
@EnableScheduling
public class ScheduledTasks {

	//@Scheduled(cron="*/30 * * * * *")
	public void executeDailyCharges(){
		AppDevService appDevsevice = new AppDevService();
		AppDevServiceSoap appDevServiceSoap = appDevsevice.getAppDevServiceSoap();

		MVisaUser c = TransactionUtils.getCustomer(appDevServiceSoap.getCustomerByAccount("211/157858/1/5106/0"));	
		System.out.println("========="+c.getAccountNumber());
	}

}
