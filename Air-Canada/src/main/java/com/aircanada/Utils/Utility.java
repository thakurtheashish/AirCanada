package com.aircanada.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aircanada.TestBase.TestBase;

public class Utility extends TestBase{
	
	static Actions action = new Actions(driver);
	
	public static void mouseClick(WebElement element) {
		
		action.moveToElement(element).click().perform();
		
	}

}
