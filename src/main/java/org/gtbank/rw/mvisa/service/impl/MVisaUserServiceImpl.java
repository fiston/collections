package org.gtbank.rw.mvisa.service.impl;

import java.util.List;

import org.gtbank.rw.mvisa.db.MVisaUserDAO;
import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.gtbank.rw.mvisa.service.MVisaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MVisaUserServiceImpl implements MVisaUserService {
	
	@Autowired
	private MVisaUserDAO dao;
	
	public void setDao(MVisaUserDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void saveMVisaUser(MVisaUser mVisaUser) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public MVisaUser getMVisaUser(int mVisaUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateMVisaUser() {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<MVisaUser> listMVisaUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void deleteMVisaUser(int mVisaUserId) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public MVisaUser getMVisaUserByAccountNumber(String consumerAccountNumber) {
		return dao.findOneByAccountNumber(consumerAccountNumber);
	}

}
