package com.TakesScreenshot.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZomatoImagesScreenShots {
@Test
public void screenShot() throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.swiggy.com/");
	driver.findElement(By.xpath("//span[text()='Locate Me']/ancestor::button")).click();
	Thread.sleep(3000);
	List<WebElement> images = driver.findElements(By.tagName("img"));
	for (WebElement image : images) {
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File src = image.getScreenshotAs(OutputType.FILE);
		File dest = new File("./swiggy/"+timeStamp+"img.png");
		FileUtils.copyFile(src, dest);
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
