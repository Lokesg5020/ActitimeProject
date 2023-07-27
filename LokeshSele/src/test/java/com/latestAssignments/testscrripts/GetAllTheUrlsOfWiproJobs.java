package com.latestAssignments.testscrripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetAllTheUrlsOfWiproJobs {
	@Test
public void allUrls() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs",Keys.ENTER);
	List<WebElement> urls = driver.findElements(By.xpath("//h3"));
	for (WebElement url : urls) 
		Reporter.log(url.getText(),true);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
