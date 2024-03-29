package com.marketing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider="LoginData",dataProviderClass=CustomDataProvider.class)
	void loginTest(String email, String name) {
		System.out.println(email+"  "+name);
	}
	
}
