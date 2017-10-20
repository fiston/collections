package org.gtbank.rw.mvisa.service.impl;

import java.util.List;

import org.gtbank.rw.mvisa.db.MerchantDAO;
import org.gtbank.rw.mvisa.domain.Merchant;
import org.gtbank.rw.mvisa.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class MerchantServiceImpl implements MerchantService{

	@Autowired
	private MerchantDAO dao;
	
	public void setDao(MerchantDAO dao) {
		this.dao = dao;
	}
	
	@Transactional
	public void saveMerchant(Merchant merchant) {
		dao.save(merchant);
		
	}

	@Transactional
	public Merchant getMerchant(int merchantId) {
		return dao.getOne(merchantId);
	}

	@Transactional
	public void updateMerchant() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Merchant> listMerchants() {
		return dao.findAll();
	}

	@Transactional
	public void deleteMerchant(int merchantId) {
		dao.delete(merchantId);
	}

}
