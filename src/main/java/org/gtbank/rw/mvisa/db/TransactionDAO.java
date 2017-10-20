package org.gtbank.rw.mvisa.db;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDAO  extends JpaRepository<Transaction,Integer> {

}
