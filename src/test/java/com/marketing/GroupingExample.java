package com.marketing;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = {"sanity"})
	void test1() {
		System.out.println("this is test1");
	}
	
	@Test(groups = {"regresion"})
	void test2() {
		System.out.println("this is test2");
	}
	
	@Test(groups = {"smoke"})
	void test3() {
		System.out.println("this is test3");
	}
	
	@Test(groups = {"sanity","regressiion"})
	void test4() {
		System.out.println("this is test4");
	}
}
