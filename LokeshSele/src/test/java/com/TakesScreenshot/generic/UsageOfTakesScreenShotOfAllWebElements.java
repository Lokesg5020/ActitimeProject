package com.TakesScreenshot.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class UsageOfTakesScreenShotOfAllWebElements {
	@Test
	public void screenShots() throws IOException, InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		for (WebElement image : images) {
			String time = LocalDateTime.now().toString().replace(":", "-");
			File src = image.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/amazon"+time+".png");
			FileUtils.copyFile(src, dest);
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
