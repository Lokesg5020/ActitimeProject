package com.latestAssignments.testscrripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DropDownSelectAllOptions {
	@Test
	public void selectAllOptions() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/pc/Desktop/monthdropdown.html");
		WebElement dropdown = driver.findElement(By.id("t1"));
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			Reporter.log(option.getText(),true);
			select.selectByVisibleText(option.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
