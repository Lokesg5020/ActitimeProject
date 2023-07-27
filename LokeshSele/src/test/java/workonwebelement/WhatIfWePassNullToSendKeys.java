package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWePassNullToSendKeys {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement userNameTExtField = driver.findElement(By.id("username"));
		userNameTExtField.clear();
		// By using sendKeys We can't pass the null value
		// If we pass null Value through sendKeys it will Throw IllegalArgumentException
		userNameTExtField.sendKeys(null);
		driver.manage().window().minimize();
		driver.quit();
	}
}
