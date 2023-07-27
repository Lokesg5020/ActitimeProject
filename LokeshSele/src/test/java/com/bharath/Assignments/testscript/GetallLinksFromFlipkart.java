package com.bharath.Assignments.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetallLinksFromFlipkart extends BaseClass {
	@Test
	public void allLinks() {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement links : allLinks) {
			Reporter.log(links.getText(),true);
		}
	}
}
