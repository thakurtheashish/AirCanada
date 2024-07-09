package com.aircanada.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aircanada.TestBase.TestBase;
import com.aircanada.Utils.WaitUtils;

public class SignInPage extends TestBase{
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[contains(@data-display-name,'Aeroplan Number or Email')]")
	WebElement loginEmail;
	
	@FindBy (xpath = "//input[contains(@data-display-name,'Password')]")
	WebElement password;
	
	@FindBy (xpath = "//input[normalize-space(@value)='Sign in']")
	WebElement signInBtn;
	
	private void enterLoginEmail(String email) {
		WaitUtils.sendTextToElement(loginEmail, email);
	}
	
	private void enterPassword(String pwsd) {
		WaitUtils.sendTextToElement(password, pwsd);
	}
	
	private void clickSignInBtn() {
	//	WaitUtils.clickOnElement(signInBtn);
		WaitUtils.submit(signInBtn);
	}
	
	public AirCanada_Homepage enterLoginInfo(String email, String pwsd) {
		enterLoginEmail(email);
		enterPassword(pwsd);
		clickSignInBtn();		
		return new AirCanada_Homepage();
	}
	


}
