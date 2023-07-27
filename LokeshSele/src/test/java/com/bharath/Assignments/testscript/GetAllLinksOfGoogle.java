package com.bharath.Assignments.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetAllLinksOfGoogle extends BaseClass {
	@Test
public void allLinks() {
	driver.get("https://www.google.com/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	for (WebElement links : allLinks) {
		Reporter.log(links.getText(),true); 
	}
}
}
