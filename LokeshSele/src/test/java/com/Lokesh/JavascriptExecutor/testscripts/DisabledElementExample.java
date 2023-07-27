package com.Lokesh.JavascriptExecutor.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementExample {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/pc/Desktop/Login.html");
	driver.findElement(By.id("t1")).sendKeys("Lokesh Eligaram");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getElementById(\"t2\").value='Karthik'");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
