package com.Lokesh.Own.Testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsageOfDataProviderAnnotation {
	@Test(dataProvider="dsm")
	public void login(String username,String password) {
		System.out.println("username : "+username + " Password : "+password);
	}
	@DataProvider(name="dsm")
	public Object[][] dataSuplierMethod() {
		Object[][] data = {{"Lokesh","123"},{"Karthik","456"},{"susheela","789"}};
		return data;
	}
}
