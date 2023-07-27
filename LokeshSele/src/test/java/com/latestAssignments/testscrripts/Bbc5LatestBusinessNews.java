package com.latestAssignments.testscrripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bbc5LatestBusinessNews {
	@Test
	public void news() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.bbc.com");
		List<WebElement> businesnews = driver
				.findElements(By.xpath("//h2[text()='Latest Business News']/parent::div/descendant::h3"));
		int i=1;
		Reporter.log("BBC latest Business News:");
		for (WebElement news : businesnews) {
			Reporter.log((i++)+". "+news.getText(),true);
		}
		driver.manage().window().minimize();
		driver.quit();
	} 
}
