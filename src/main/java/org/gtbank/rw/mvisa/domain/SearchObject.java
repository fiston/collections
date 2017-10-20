package org.gtbank.rw.mvisa.domain;

public class SearchObject {
	private String searchString;
	private String accountType;

	public SearchObject() {
		super();
	}

	public SearchObject(String searchString, String accountType) {
		super();
		this.searchString = searchString;
		this.accountType=accountType;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
