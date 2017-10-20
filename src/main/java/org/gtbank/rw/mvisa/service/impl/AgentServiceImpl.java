package org.gtbank.rw.mvisa.service.impl;

import java.util.List;

import org.gtbank.rw.mvisa.db.AgentDAO;
import org.gtbank.rw.mvisa.domain.Agent;
import org.gtbank.rw.mvisa.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class AgentServiceImpl implements AgentService{
	
	@Autowired
	private AgentDAO dao;
	
	public void setDao(AgentDAO dao) {
		this.dao = dao;
	}

	@Transactional
	public void saveAgent(Agent agent) {
		dao.save(agent);
		
	}

	@Transactional
	public Agent getAgent(int agentId) {
		return dao.getOne(agentId);
	}

	@Transactional
	public void updateAgent() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Agent> listAgents() {
		return dao.findAll();
	}

	@Transactional
	public void deleteAgent(int agentId) {
		dao.delete(agentId);
	}

}
