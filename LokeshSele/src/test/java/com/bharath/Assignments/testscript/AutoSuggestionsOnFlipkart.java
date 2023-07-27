package com.bharath.Assignments.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutoSuggestionsOnFlipkart extends BaseClass{
	@Test
public void allSuggetions() {
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.className("_3704LK")).sendKeys("iphone 14 pro max");
	List<WebElement> allSuggetions = driver.findElements(By.xpath("//span[text()='iphone 14 pro max']"));
	for (WebElement suggestion : allSuggetions) {
		Reporter.log(suggestion.getText(),true);
	}
}
}
