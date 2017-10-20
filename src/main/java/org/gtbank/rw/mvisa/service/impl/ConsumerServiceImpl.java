package org.gtbank.rw.mvisa.service.impl;

import java.util.List;

import org.gtbank.rw.mvisa.db.ConsumerDAO;
import org.gtbank.rw.mvisa.domain.Consumer;
import org.gtbank.rw.mvisa.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ConsumerServiceImpl implements ConsumerService{

	@Autowired
	private ConsumerDAO dao;
	
	public void setDao(ConsumerDAO dao) {
		this.dao = dao;
	}
	
	@Transactional
	public void saveConsumer(Consumer consumer) {
		dao.save(consumer);
		
	}

	@Transactional
	public Consumer getConsumer(int consumerId) {
		return dao.getOne(consumerId);
	}

	@Transactional
	public void updateConsumer() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Consumer> listConsumers() {
		return dao.findAll();
	}

	@Transactional
	public void deleteConsumer(int consumerId) {
		dao.delete(consumerId);
		
	}

}
