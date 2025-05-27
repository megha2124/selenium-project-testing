package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BaiscValidation {

	
	// Instantiate the ChromeDriver class
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void beforeTest() {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.setExperimentalOption("useAutomationExtension", false);
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void urlValidation() {
		String expectedResult = "https://www.facebook.com/";
		String actualResult = driver.getCurrentUrl();

		Reporter.log("Expected Result = " + expectedResult, true); // true makes it print in console
		Reporter.log("Actual Result = " + actualResult, true);
		assertTrue(actualResult.equals(expectedResult), "Mismatch in URL");

	}
	

}

