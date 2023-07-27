package com.bharath.Assignments.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	for(WebElement link : allLinks) {
		System.out.println(link.getText());
	}
	driver.manage().window().maximize();
	driver.quit();
}
}
