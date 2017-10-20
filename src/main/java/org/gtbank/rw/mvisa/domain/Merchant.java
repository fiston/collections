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
@Table(name = "merchant")
public class Merchant {
	@Id
	@Column(name="merchant_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int merchantId;
	@OneToOne(cascade = CascadeType.ALL)
	private MVisaUser mVisaUser;
	@Column(name="mvisa_merchant_id")
	private String mVisaMerchantId;

	public Merchant() {
		super();
	}

	public Merchant(MVisaUser mVisaUser, String mVisaMerchantId) {
		super();
		this.mVisaUser = mVisaUser;
		this.mVisaMerchantId = mVisaMerchantId;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public MVisaUser getmVisaUser() {
		return mVisaUser;
	}

	public void setmVisaUser(MVisaUser mVisaUser) {
		this.mVisaUser = mVisaUser;
	}

	public String getmVisaMerchantId() {
		return mVisaMerchantId;
	}

	public void setmVisaMerchantId(String mVisaMerchantId) {
		this.mVisaMerchantId = mVisaMerchantId;
	}

}
