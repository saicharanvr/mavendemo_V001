package com.marketing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	@BeforeClass
	void beforeClass() {
		System.out.println("This executes before Class....");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("This executes after Class....");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("This executes before every method....");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("This executes after every method....");
	}
	
	@Test(priority=2)
	void test1() {
		System.out.println("This is Test1....");
	}
	
	@Test(priority=2)
	void test2() {
		System.out.println("This is Test2....");
	}
	
	
	@BeforeTest
	void beforeTest() {
		System.out.println("This executes before test....");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("This executes after test....");
	}
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("This executes before Suite....");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("This executes after Suite....");
	}
}
