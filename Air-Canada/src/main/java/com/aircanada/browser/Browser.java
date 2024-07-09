package com.aircanada.browser;

public enum Browser {
	
	CHROME("Google Chrome"),
	EDGE("Microsoft Edge");
	
	private String companies;

	Browser(String string) {
		this.companies = string;
	}
	
	public String getCompanies() {
		return companies;
	}
	
	
	
	

}
