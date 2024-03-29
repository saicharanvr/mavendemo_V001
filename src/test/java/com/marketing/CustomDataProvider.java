package com.marketing;

import org.testng.annotations.DataProvider;

 public class CustomDataProvider {
	 
	@DataProvider(name="LoginData")
	public Object[][] getData(){
		
		Object[][] data = {{"abc@gmail.com", "abc"},{"bbc@live.com", "bbc"},{"cbc@gmail.com", "cbc"}};
		return data;
	}
}
