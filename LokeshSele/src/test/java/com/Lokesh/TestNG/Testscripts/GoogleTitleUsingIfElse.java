package com.Lokesh.TestNG.Testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleTitleUsingIfElse {
	@Test
public void title() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	String expectedTitle = "Google";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle,"fail");
	Reporter.log("pass",true);
	driver.quit();
}
}
