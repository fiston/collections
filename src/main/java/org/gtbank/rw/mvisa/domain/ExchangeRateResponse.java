package org.gtbank.rw.mvisa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helps to unmarshal XML response received from calling #getExchangeRate method
 * of GTBTECHAPPDEV web service
 * 
 * @author Bailly RURANGIRWA
 *
 */

@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangeRateResponse {

	@XmlElement(name = "CODE")
	private String code;
	@XmlElement(name = "EXCHANGERATE")
	private String exchangeRate;

	public ExchangeRateResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExchangeRateResponse(String code, String exchangeRate) {
		super();
		this.code = code;
		this.exchangeRate = exchangeRate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
