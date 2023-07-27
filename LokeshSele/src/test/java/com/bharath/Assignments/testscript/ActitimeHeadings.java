package com.bharath.Assignments.testscript;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHeadings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		String ExpectedTitle = "actiTIME Online Terms of Service";
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			String actualTitle = driver.switchTo().window(window).getTitle();
			if (actualTitle.equals(ExpectedTitle)) {
				List<WebElement> allHeadings = driver.findElements(By.tagName("h2"));
				for (WebElement heading : allHeadings) {
					System.out.println(heading.getText());
				}
			}

		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
