package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWeEnterWrongAddress {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(5000);
	WebElement emailfield = driver.findElement(By.id("email"));
	emailfield.sendKeys("9705304369");
	Thread.sleep(5000);
	WebElement passwordfield = driver.findElement(By.id("pass"));
	passwordfield.sendKeys("karthik");
	Thread.sleep(5000);
	WebElement loginbutton = driver.findElement(By.name("login"));
	loginbutton.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
