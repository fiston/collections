package org.gtbank.rw.mvisa.controller;

import org.gtbank.rw.mvisa.handler.CashInPushPaymentsHandler;
import org.gtbank.rw.mvisa.handler.CashOutPushPaymentsHandler;
import org.gtbank.rw.mvisa.handler.MerchantPushPaymentsHandler;
import org.gtbank.rw.mvisa.handler.MultiPushFundsTransactionHandler;
import org.gtbank.rw.mvisa.handler.PushFundsTransactionHandler;
import org.gtbank.rw.mvisa.handler.ReceiveCashInAdviceHandler;
import org.gtbank.rw.mvisa.handler.ReceiveCashInPaymentHandler;
import org.gtbank.rw.mvisa.handler.ReceiveCashOutAdviceHandler;
import org.gtbank.rw.mvisa.handler.ReceiveCashoutPaymentHandler;
import org.gtbank.rw.mvisa.handler.ReceiveMerchantPaymentAdviceHandler;
import org.gtbank.rw.mvisa.handler.ReceiveMerchantPaymentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MVisaController {

	@Autowired
	MerchantPushPaymentsHandler merchantPushPaymentsHandler;

	@Autowired
	CashInPushPaymentsHandler cashInPushPaymentsHandler;

	@Autowired
	CashOutPushPaymentsHandler cashOutPushPaymentsHandler;

	@Autowired
	PushFundsTransactionHandler pushFundsTransactionHandler;

	@Autowired
	MultiPushFundsTransactionHandler multiPushFundsTransactionHandler;

	@Autowired
	ReceiveMerchantPaymentHandler receiveMerchantPaymentHandler;

	@Autowired
	ReceiveCashInPaymentHandler receiveCashInPaymentHandler;

	@Autowired
	ReceiveCashoutPaymentHandler receiveCashoutPaymentHandler;

	@Autowired
	ReceiveMerchantPaymentAdviceHandler receiveMerchantPaymentAdviceHandler;

	@Autowired
	ReceiveCashInAdviceHandler receiveCashInAdviceHandler;

	@Autowired
	ReceiveCashOutAdviceHandler receiveCashOutAdviceHandler;

	/**
	 * Handles a merchant push payment request
	 */
	@RequestMapping(value = "/MerchantPushPayments", method = RequestMethod.GET, headers = "Accept=application/json")
	public void executeMerchantPushPayments() {
		merchantPushPaymentsHandler.executeMerchantPushPayments(null, null, 0);
	}

	/**
	 * Handles a cash-in push payment request
	 */
	@RequestMapping(value = "/CashInPushPayments", method = RequestMethod.GET, headers = "Accept=application/json")
	public void executeCashInPushPayments() {
		cashInPushPaymentsHandler.executeCashInPushPayments(null, null, 0);
	}

	/**
	 * Handles a cash-out push payment request
	 */
	@RequestMapping(value = "/CashOutPushPayments", method = RequestMethod.GET, headers = "Accept=application/json")
	public void executeCashOutPushPayments() {
		cashOutPushPaymentsHandler.executeCashOutPushPayments(null, null, 0);
	}

	/*
	 * The following methods are probably going to be implemented in version 2
	 * of GTBank mvisa application. They are from the Visa Direct Funds Transfer
	 * API v1 and we are only implementing Visa Direct mVisa API v1 currently
	 */
	@RequestMapping(value = "/PushFundsTransaction", method = RequestMethod.GET, headers = "Accept=application/json")
	public void executePushFundsTransaction(){
		pushFundsTransactionHandler.executePushFundsTransaction();
	}

	@RequestMapping(value = "/MultiPushFundsTransaction", method = RequestMethod.GET, headers = "Accept=application/json")
	public void executeMultiPushFundsTransaction(){
		multiPushFundsTransactionHandler.executeMultiPushFundsTransaction();
	}
	
	@RequestMapping(value = "/pushpayment/transactions/receive/p2m", method = RequestMethod.GET, headers = "Accept=application/json")
	public String receiveMerchantPayment(String request){
		return receiveMerchantPaymentHandler.executeReceiveMerchantPaymentTransaction(request);
	}

	@RequestMapping(value = "/pushpayment/transactions/receive/ci", method = RequestMethod.GET, headers = "Accept=application/json")
	public String receiveCashIn(String request){
		return receiveCashInPaymentHandler.executeReceiveCashInPaymentTransaction(request);
	}

	@RequestMapping(value = "/pushpayment/transactions/receive/co", method = RequestMethod.GET, headers = "Accept=application/json")
	public String receiveCashOut(String request){
		return receiveCashoutPaymentHandler.executeReceiveCashOutPaymentTransaction(request);
	}
	
	@RequestMapping(value = "/pushpayment/advice/receive/p2m", method = RequestMethod.GET, headers = "Accept=application/json")
	public String receiveMerchantPaymentAdvice(String request){
		return receiveMerchantPaymentAdviceHandler.executeReceiveMerchantPaymentAdvice(request);
	}

	@RequestMapping(value = "/pushpayment/advice/receive/ci", method = RequestMethod.GET, headers = "Accept=application/json")
	public String receiveCashInAdvice(String request){
		return receiveCashInAdviceHandler.executeReceiveCashInPaymentAdvice(request);
	}

	@RequestMapping(value = "/pushpayment/advice/receive/co", method = RequestMethod.GET, headers = "Accept=application/json")
	public String receiveCashOutAdvice(String request){
		return receiveCashOutAdviceHandler.executeReceiveCashOutPaymentAdvice(request);
	}


}
