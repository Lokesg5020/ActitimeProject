package com.TakesScreenshot.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ParticularWebElementScreenShot {
	@Test
	public void screenShotTest() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		File src = driver.findElement(By.xpath("//img[@alt='For your Fitness Needs']")).getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(":", "-");
		File dest = new File("./screenshot/"+time+".png");
		FileUtils.copyFile(src, dest);
		driver.manage().window().minimize();
		driver.quit();
	}
}
