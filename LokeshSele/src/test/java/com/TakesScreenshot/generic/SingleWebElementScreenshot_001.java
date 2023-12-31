package com.TakesScreenshot.generic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWebElementScreenshot_001 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	File temp = logo.getScreenshotAs(OutputType.FILE);
	File permt = new File("./demoscr/logo.png");
	FileUtils.moveFile(temp, permt);
	driver.quit();
}
}
