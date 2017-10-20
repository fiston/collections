package org.gtbank.rw.mvisa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helps to unmarshal XML response received from calling #getAccountBalance
 * method of GTBTECHAPPDEV web service
 * 
 * @author Bailly RURANGIRWA
 *
 */

@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class BalanceResponse {

	@XmlElement(name = "CODE")
	private String code;
	@XmlElement(name = "BOOKBALANCE")
	private String bookBalance;
	@XmlElement(name = "AVAILABLEBALANCE")
	private String availableBalance;

	public BalanceResponse() {
		super();
	}

	public BalanceResponse(String code, String bookBalance, String availableBalance) {
		super();
		this.code = code;
		this.bookBalance = bookBalance;
		this.availableBalance = availableBalance;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBookBalance() {
		return bookBalance;
	}

	public void setBookBalance(String bookBalance) {
		this.bookBalance = bookBalance;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

}
