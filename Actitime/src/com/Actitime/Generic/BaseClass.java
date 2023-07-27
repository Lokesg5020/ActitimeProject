package com.Actitime.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	FileLib f = new FileLib();
	@BeforeClass
public void openBrowser() {
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	@AfterClass
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}
	@BeforeMethod
	public void loginTest() throws IOException {
		driver.get(f.getPropertyData("url"));
		LoginPage l = new LoginPage(driver);
		l.loginPage(f.getPropertyData("username"), f.getPropertyData("password"));
		
	}
	@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.setLogout();
	}

	
}
