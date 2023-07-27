package com.bharath.Assignments.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAlllinksFromGoogle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("wipro jobs"+Keys.ENTER);
	List<WebElement> text = driver.findElements(By.cssSelector("h3[class='LC20lb MBeuO DKV0Md']"));
	for (WebElement links : text) {
		System.out.println(links.getText());
		
	}
}
}
