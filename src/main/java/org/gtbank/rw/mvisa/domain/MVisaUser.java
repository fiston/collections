package org.gtbank.rw.mvisa.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helps to unmarshal XML response received from calling #getCustomerByAccount
 * method of GTBTECHAPPDEV web service
 * 
 * @author Bailly RURANGIRWA
 *
 */
@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "mvisa_user")
public class MVisaUser {

	@Id
	@Column(name = "mvisa_user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mVisaUserId;
	
	@Column(name = "code")
	@XmlElement(name = "CODE")
	private String code;
	@XmlElement(name = "CusFullName")
	@Column(name = "customer_full_name")
	private String customerFullName;
	@Column(name = "customer_gender")
	@XmlElement(name = "Sex")
	private String customerGender;
	@Column(name = "customer_title")
	@XmlElement(name = "Title")
	private String customerTitle;
	@Column(name = "id_doc_num")
	@XmlElement(name = "IDdocNum")
	private String idDocNum;
	@Column(name = "resident")
	@XmlElement(name = "Resident")
	private String resident;
	@Column(name = "account_number")
	@XmlElement(name = "AcctNumber")
	private String accountNumber;
	@Column(name = "acct_bban")
	@XmlElement(name = "AcctBBAN")
	private String acctBBAN;
	@Column(name = "mobile_phone")
	@XmlElement(name = "MobilePhone")
	private String mobilePhone;
	@Column(name = "email")
	@XmlElement(name = "Email")
	private String email;
	@Column(name = "home_phone")
	@XmlElement(name = "HomePhone")
	private String homePhone;
	@Column(name = "job_phone")
	@XmlElement(name = "JobPhone")
	private String jobPhone;
	@Column(name = "residential_address")
	@XmlElement(name = "ResAdd")
	private String residentialAddress;
	@Column(name = "contact_address")
	@XmlElement(name = "ContactAddress")
	private String contactAddress;
	@Column(name = "branch")
	@XmlElement(name = "Branch")
	private String branch;
	@Column(name = "language")
	@XmlElement(name = "Language")
	private String language;
	@Column(name = "live_country")
	@XmlElement(name = "LiveCountry")
	private String liveCountry;
	@Column(name = "live_region")
	@XmlElement(name = "LiveRegion")
	private String liveRegion;
	@Column(name = "live_city")
	@XmlElement(name = "LiveCity")
	private String liveCity;
	
	@Column(name = "primary_account_number")
	private String primaryAccountNumber;	
	@OneToMany(mappedBy = "user")
	private List<Transaction> transactions;

	public MVisaUser() {
		super();
	}

	public MVisaUser(String code, String customerFullName, String customerGender, String customerTitle, String idDocNum,
			String resident, String accountNumber, String acctBBAN, String mobilePhone, String email, String homePhone,
			String jobPhone, String residentialAddress, String contactAddress, String branch, String language,
			String liveCountry, String liveRegion, String liveCity,String primaryAccountNumber, List<Transaction> transactions) {
		super();
		this.code = code;
		this.customerFullName = customerFullName;
		this.customerGender = customerGender;
		this.customerTitle = customerTitle;
		this.idDocNum = idDocNum;
		this.resident = resident;
		this.accountNumber = accountNumber;
		this.acctBBAN = acctBBAN;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.homePhone = homePhone;
		this.jobPhone = jobPhone;
		this.residentialAddress = residentialAddress;
		this.contactAddress = contactAddress;
		this.branch = branch;
		this.language = language;
		this.liveCountry = liveCountry;
		this.liveRegion = liveRegion;
		this.liveCity = liveCity;
		this.primaryAccountNumber = primaryAccountNumber;
		this.transactions = transactions;
	}

	public int getmVisaUserId() {
		return mVisaUserId;
	}

	public void setmVisaUserId(int mVisaUserId) {
		this.mVisaUserId = mVisaUserId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCustomerFullName() {
		return customerFullName;
	}

	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerTitle() {
		return customerTitle;
	}

	public void setCustomerTitle(String customerTitle) {
		this.customerTitle = customerTitle;
	}

	public String getIdDocNum() {
		return idDocNum;
	}

	public void setIdDocNum(String idDocNum) {
		this.idDocNum = idDocNum;
	}

	public String getResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAcctBBAN() {
		return acctBBAN;
	}

	public void setAcctBBAN(String acctBBAN) {
		this.acctBBAN = acctBBAN;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getJobPhone() {
		return jobPhone;
	}

	public void setJobPhone(String jobPhone) {
		this.jobPhone = jobPhone;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLiveCountry() {
		return liveCountry;
	}

	public void setLiveCountry(String liveCountry) {
		this.liveCountry = liveCountry;
	}

	public String getLiveRegion() {
		return liveRegion;
	}

	public void setLiveRegion(String liveRegion) {
		this.liveRegion = liveRegion;
	}

	public String getLiveCity() {
		return liveCity;
	}

	public void setLiveCity(String liveCity) {
		this.liveCity = liveCity;
	}

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "MVisaUser{" +
				", code='" + code + '\'' +
				", customerFullName='" + customerFullName + '\'' +
				", customerGender='" + customerGender + '\'' +
				", customerTitle='" + customerTitle + '\'' +
				", idDocNum='" + idDocNum + '\'' +
				", resident='" + resident + '\'' +
				", accountNumber='" + accountNumber + '\'' +
				", acctBBAN='" + acctBBAN + '\'' +
				", mobilePhone='" + mobilePhone + '\'' +
				", email='" + email + '\'' +
				", homePhone='" + homePhone + '\'' +
				", jobPhone='" + jobPhone + '\'' +
				", residentialAddress='" + residentialAddress + '\'' +
				", contactAddress='" + contactAddress + '\'' +
				", branch='" + branch + '\'' +
				", language='" + language + '\'' +
				", liveCountry='" + liveCountry + '\'' +
				", liveRegion='" + liveRegion + '\'' +
				", liveCity='" + liveCity + '\'' +
				", primaryAccountNumber='" + primaryAccountNumber + '\'' +
				", transactions=" + transactions +
				'}';
	}
}
