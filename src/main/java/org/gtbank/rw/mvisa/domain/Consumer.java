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
@Table(name = "consumer")
public class Consumer {

	@Id
	@Column(name="merchant_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int consumerId;
	@OneToOne(cascade = CascadeType.ALL)
	private MVisaUser mVisaUser;

	public Consumer() {
		super();
	}

	public Consumer(MVisaUser mVisaUser) {
		super();
		this.mVisaUser = mVisaUser;
	}

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}

	public MVisaUser getmVisaUser() {
		return mVisaUser;
	}

	public void setmVisaUser(MVisaUser mVisaUser) {
		this.mVisaUser = mVisaUser;
	}

}
