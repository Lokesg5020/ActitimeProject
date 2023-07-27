package com.Lokesh.Actions.testscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import vtigerPreAndPost.VtigerPreAndPostConditions;

public class UsageOfVtigerDoubleClick extends VtigerPreAndPostConditions {
	@Test
	public void doubleClickTest() { 
		Actions action = new Actions(driver);
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		action.moveToElement(resource).build().perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement loginButton = driver.findElement(By.id("loginspan"));
		action.doubleClick(loginButton).build().perform();
		String expectedTitle = "Login - Vtiger";
		System.out.println("expectedTitle is:"+expectedTitle);
		String actualTitle = driver.getTitle(); 
		System.out.println("Actual title is :"+actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Fail: Login page is not diaplayed and it is verified");
		Reporter.log("Pass: Login page is displayed and it ia verified");
		
//		if(actualTitle.equals(expectedTitle))
//			System.out.println("Pass: Login page is displayed and it ia verified");
//		else
//			System.out.println("Fail: Login page is not diaplayed and it is verified");
	}
}
