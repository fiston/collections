package org.gtbank.rw.mvisa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "transaction")
@Proxy(lazy = false)
public class Transaction {

	@Id
	@Column(name = "transaction_id")
	@GeneratedValue
	private int transactionId;
	@ManyToOne
	@JoinColumn(name = "mvisa_user_id", nullable = false)
	private MVisaUser user;
	@Column(name = "transaction_date")
	private Date transactioDate;
	@Column(name = "request")
	private String request;
	@Column(name = "response")
	private String response;

	public Transaction() {
		super();
	}

	public Transaction(MVisaUser user, Date transactioDate, String request, String response) {
		super();
		this.user = user;
		this.transactioDate = transactioDate;
		this.request = request;
		this.response = response;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public MVisaUser getUser() {
		return user;
	}

	public void setUser(MVisaUser user) {
		this.user = user;
	}

	public Date getTransactioDate() {
		return transactioDate;
	}

	public void setTransactioDate(Date transactioDate) {
		this.transactioDate = transactioDate;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}