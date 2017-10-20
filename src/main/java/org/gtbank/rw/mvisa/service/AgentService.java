package org.gtbank.rw.mvisa.service;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Agent;

public interface AgentService {

	public void saveAgent(Agent agent);

	public Agent getAgent(int agentId);

	public void updateAgent();

	public List<Agent> listAgents();

	public void deleteAgent(int agentId);

}
