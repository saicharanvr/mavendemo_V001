package com.marketing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=0)
	void testOne() {
		System.out.println("Test One");
	}
	
	@Test(priority=1)
	void testTwo() {
		System.out.println("Test Two");
	}
	@Test(priority=2)
	void testThree() {
		System.out.println("Test Three");
	}
	@Test(priority=3, enabled=false)
	void testFour() {
		System.out.println("Test Four");
	}
}
