package com.latestAssignments.testscrripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllAutoSuggesionsQspiders {
	@Test
public void suggesions() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("Qspiders");
	List<WebElement> suggesions = driver.findElements(By.xpath("//span[contains(.,'QSpiders')]"));
	for (WebElement suggesion : suggesions) {
		Reporter.log(suggesion.getText(),true);
	}
	driver.findElement(By.xpath("(//span[contains(.,'QSpiders')])[last()]")).click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
