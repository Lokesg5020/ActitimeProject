package com.TakesScreenshot.generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebelementsScreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> allImages = driver.findElements(By.tagName("img"));
	
	for (WebElement image : allImages) {
		File temp = image.getScreenshotAs(OutputType.FILE);
		String random = LocalDateTime.now().toString().replace(':', '-');
		File pemt = new File("./scrshot/"+random+"amazon.png");
		FileUtils.moveFile(temp, pemt);
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
