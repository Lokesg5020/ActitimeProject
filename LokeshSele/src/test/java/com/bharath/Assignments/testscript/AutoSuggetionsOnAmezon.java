package com.bharath.Assignments.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutoSuggetionsOnAmezon extends BaseClass {
	
	@Test
public void allSuggestions() {
	driver.get("https://www.amezon.com/");
	driver.findElement(By.name("field-keywords")).sendKeys("iphone");
	List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[text()='iphone']"));
	for (WebElement suggetion : allSuggestions) {
		Reporter.log(suggetion.getText(),true);
	} 
}
}
