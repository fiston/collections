package org.gtbank.rw.mvisa.service.impl;

import java.util.List;

import org.gtbank.rw.mvisa.db.TransactionDAO;
import org.gtbank.rw.mvisa.domain.Transaction;
import org.gtbank.rw.mvisa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionDAO dao;
	
	public void setDao(TransactionDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void saveTransaction(Transaction transaction) {
		dao.save(transaction);
	}

	@Transactional
	public Transaction getTransaction(int transactionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Transaction> listTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void deleteTransaction(int transactionId) {
		// TODO Auto-generated method stub
		
	}

}
