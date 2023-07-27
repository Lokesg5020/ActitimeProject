package com.Lokesh.TestNG.Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.Lokesh.TestNG.Testscripts.ListenersImplimentation.class)
public class UsageOfTakesScreenShot {
	public static WebDriver driver;
	@Test
public void screenShot() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("987")).click(); 
	driver.manage().window().minimize();
	driver.quit();
	
}
}
 