package com.bharath.Assignments.testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
public void preConditions() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	@AfterMethod
	public void postConditions() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
