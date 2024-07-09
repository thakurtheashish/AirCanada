package com.aircanada.TestBase;

import java.time.Duration;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.aircanada.browser.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	private final static Browser webBrowser = Browser.CHROME;
	private final String url = "https://www.aircanada.com/ca/en/aco/home.html";
	
	public void initialise() {
		initialiseWebDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}
	
	private void initialiseWebDriver() {
		switch (webBrowser) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			throw new InvalidArgumentException("Invalid Browser");	
		}
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	

	

}
