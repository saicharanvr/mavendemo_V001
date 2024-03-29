package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTest1 {
	WebDriver driver;
	
	@Test
	void logoTest() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette", "C://Users//91829//eclipse//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
		
		Thread.sleep(5000);
	}
	@Test
	void homePageTitle() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette", "C://Users//91829//eclipse//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		String s2;
		Assert.assertEquals(title,"OrangeHRM", "title is not matched");
		Thread.sleep(5000);
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
}
