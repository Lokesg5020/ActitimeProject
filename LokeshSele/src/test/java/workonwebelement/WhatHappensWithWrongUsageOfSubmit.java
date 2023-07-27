package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatHappensWithWrongUsageOfSubmit {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window.
		driver.manage().window().maximize();
		//Enter the main URl of the Application.
		driver.get("https://demo.actitime.com/");
		//Identify the login Button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//We are using the submit() for wrong Element
		//UnsupportedOperationEception - java -Run time - Unchecked
		//Note: submit() called upon the <form> nested element.
		loginButton.submit();
	}
}
