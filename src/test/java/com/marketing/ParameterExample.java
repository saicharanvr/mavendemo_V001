package com.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser, String app) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.firefox.marionette", "C://Users//91829//eclipse//geckodriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette", "C://Users//91829//eclipse//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(app);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
	}
	@Test(priority=2)
	void homePageTitle() {
		String title = driver.getTitle();
		String s2;
		Assert.assertEquals(title,"OrangeHRM", "title is not matched");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	
}
