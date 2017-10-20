package org.gtbank.rw.mvisa.service;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Transaction;

public interface TransactionService {
	public void saveTransaction(Transaction transaction);

	public Transaction getTransaction(int transactionId);

	public void updateTransaction();

	public List<Transaction> listTransactions();

	public void deleteTransaction(int transactionId);
}
