package com.aircanada.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aircanada.Pages.AirCanada_Homepage;
import com.aircanada.Pages.SignInPage;
import com.aircanada.TestBase.TestBase;


public class AirCanada_HomepagePageTest extends TestBase{
	
	SignInPage signIn;
	AirCanada_Homepage homepage;
	
	@BeforeMethod
	public void setup() {
		initialise();
		homepage = new AirCanada_Homepage();
	}

	@Test
	public void validateLoginFunctionality() {
		homepage.clickCookiesBanner();
		signIn = homepage.clickToSignIn();
		homepage = signIn.enterLoginInfo("itskabir93@gmail.com", "Password@1");
		String profileName = homepage.getProfileText();
		Assert.assertEquals("Hi Ashish", profileName);
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}


}
