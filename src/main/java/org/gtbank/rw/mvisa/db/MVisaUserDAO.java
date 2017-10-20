package org.gtbank.rw.mvisa.db;

import java.util.List;

import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MVisaUserDAO  extends JpaRepository<MVisaUser,Integer> {

	MVisaUser findOneByAccountNumber(String accountNumber);
}
