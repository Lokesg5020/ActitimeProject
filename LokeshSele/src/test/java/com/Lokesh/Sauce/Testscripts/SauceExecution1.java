package com.Lokesh.Sauce.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import saucePropertyData.SaucePreAndPostConditions;
import saucePropertyData.SauceProperties;

public class SauceExecution1 extends SaucePreAndPostConditions {

	@Test
	public void executionSauceTest() throws EncryptedDocumentException, IOException {
		SauceProperties util = new SauceProperties();
		driver.findElement(By.id("user-name")).sendKeys(util.properties("Functionality", 8, 2));
		driver.findElement(By.id("password")).sendKeys(util.properties("Functionality", 9, 2));
		driver.findElement(By.id("login-button")).click();
	}
}
