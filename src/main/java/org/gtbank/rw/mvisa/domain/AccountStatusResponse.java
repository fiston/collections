package org.gtbank.rw.mvisa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helps to unmarshal XML response received from calling #getAccountStatus
 * method of GTBTECHAPPDEV web service
 * 
 * @author Bailly RURANGIRWA
 *
 */

@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountStatusResponse {

	@XmlElement(name = "CODE")
	private String code;
	@XmlElement(name = "ACCOUNTSTATUS")
	private String accountStatus;

	public AccountStatusResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountStatusResponse(String code, String accountStatus) {
		super();
		this.code = code;
		this.accountStatus = accountStatus;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

}
