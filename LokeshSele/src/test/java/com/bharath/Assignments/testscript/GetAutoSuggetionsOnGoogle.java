package com.bharath.Assignments.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAutoSuggetionsOnGoogle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	List<WebElement> allSuggesions = driver.findElements(By.xpath("//span[text()='selenium']"));
	for (WebElement suggestions : allSuggesions) {
		System.out.println(suggestions.getText());
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
