package com.aircanada.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aircanada.TestBase.TestBase;
import com.aircanada.Utils.Utility;
import com.aircanada.Utils.WaitUtils;

public class AirCanada_Homepage extends TestBase {

	public AirCanada_Homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "acUserMenu-acoContent")
	WebElement userMenu;

	@FindBy(id = "acUserMenu-signInContent")
	WebElement signInBtn;
	
	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement cookiesBanner;
	
	@FindBy(id = "acUserMenu-acoContent")
	WebElement profileMenu;
	
	@FindBy(id = "profile-heading")
	WebElement profileName;
	
	
	public void clickCookiesBanner() {
		WaitUtils.clickOnElement(cookiesBanner);
	}

	private void clickUserMenu() {
		Utility.mouseClick(userMenu);
	}

	private void clickSignInBtn() {
		Utility.mouseClick(signInBtn);
	}

	public SignInPage clickToSignIn() {
		clickUserMenu();
		clickSignInBtn();
		return new SignInPage();
	}
	
	private void clickProfileMenu() {
		Utility.mouseClick(profileMenu);
	}
	
	public String getProfileText() {
		clickProfileMenu();
		return WaitUtils.getTextFromElement(profileName);
	}

}
