package org.gtbank.rw.mvisa.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agent")
public class Agent {

	@Id
	@Column(name="agent_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int agentId;
	@OneToOne(cascade = CascadeType.ALL)
	private MVisaUser mVisaUser;
	@Column(name="mvisa_agent_id")
	private String mVisaAgentId;

	public Agent() {
		super();
	}

	public Agent(MVisaUser mVisaUser, String mVisaAgentId) {
		super();
		this.mVisaUser = mVisaUser;
		this.mVisaAgentId = mVisaAgentId;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public MVisaUser getmVisaUser() {
		return mVisaUser;
	}

	public void setmVisaUser(MVisaUser mVisaUser) {
		this.mVisaUser = mVisaUser;
	}

	public String getmVisaAgentId() {
		return mVisaAgentId;
	}

	public void setmVisaAgentId(String mVisaAgentId) {
		this.mVisaAgentId = mVisaAgentId;
	}

	@Override
	public String toString() {
		return "Agent{" +
				"mVisaAgentId='" + mVisaAgentId + '\'' +
				'}';
	}
}
