package com.Lokesh.Popups.Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupEx {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/pc/Desktop/FileUpload.html");
	driver.findElement(By.id("abc")).sendKeys("C:\\Users\\pc\\Desktop\\Lokesh Resume\\Lokesh Resume New(1).pdf");
	driver.manage().window().minimize();
	driver.quit();
}
}
