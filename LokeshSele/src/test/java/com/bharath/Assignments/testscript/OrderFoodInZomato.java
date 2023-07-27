package com.bharath.Assignments.testscript;

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

public class OrderFoodInZomato {
	@Test
	public void orderFood() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.zomato.com/");
		WebElement search = driver
				.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		search.sendKeys("meghana food");
		search.click();
		
		driver.findElement(By.xpath("//p[text()='Meghana Foods']/following::span[text()='View all outlets']")).click();
		driver.findElement(
				By.xpath("(//p[text()='Koramangala 5th Block, Bangalore']/preceding::h4[text()='Meghana Foods'])[3]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> MeghanaFoodImages = driver.findElements(By.xpath("//img"));
		for (WebElement image : MeghanaFoodImages) {
			String time = LocalDateTime.now().toString().replace(":", "-");
			File src = image.getScreenshotAs(OutputType.FILE);
			File dest = new File("./meghanaFoods/" + time + "food.png");
			FileUtils.copyFile(src, dest);
		}
		driver.manage().window().minimize();
		driver.quit();

	}
}
