package com.bharath.Assignments.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DuplicatesOfListBox {
	@Test
	public void duplicatesTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/pc/Desktop/listbox.html");
		WebElement listBox = driver.findElement(By.id("t1"));
		Select select = new Select(listBox);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			int count = 0;
			for (int j = 0; j < options.size(); j++) {
				String text1 = options.get(j).getText();
				if (text1.equals(text)) {
					count++;
				}
			}
			if (count >1) {
				System.out.println(text);
				Reporter.log(text);
			}
		}

		driver.manage().window().minimize();
		driver.quit();
	}
}
