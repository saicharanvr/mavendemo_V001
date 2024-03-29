package com.marketing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {
	
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
	
	@Test
	void test3() {
		System.out.println("This is Test3....");
	}
	
	@Test
	void test4() {
		System.out.println("This is Test4....");
	}
	
	
	
}
