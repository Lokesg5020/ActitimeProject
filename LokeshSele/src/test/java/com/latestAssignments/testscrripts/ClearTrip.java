package com.latestAssignments.testscrripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClearTrip {
	@Test
public void makeTrip() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	JavascriptExecutor je=(JavascriptExecutor) driver;
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("(//input[@placeholder='Where from?'])")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where from?']/..//p[contains(.,'Kempegowda')]")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Goa");
	driver.findElement(By.xpath("//div[text()='GOI']")).click();
	driver.findElement(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500']")).click();
	driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
	je.executeScript("window.scrollTo(0,300)");
	WebElement date = driver.findElement(By.xpath("//div[text()='July 2023']/../..//div[text()='25']"));
	wait.until(ExpectedConditions.visibilityOf(date));
	date.click();
	driver.findElement(By.xpath("//span[@class='fw-600 fs-4 lh-2 flex flex-middle']")).click();
	Thread.sleep(5000);
	je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	List<WebElement> flightName = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']"));
	List<WebElement> departureTime = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']/following::p[@class='m-0 fs-5 fw-400 c-neutral-900']"));
	for (int i=0;i<flightName.size();i++) {
		Reporter.log("flight Name : "+flightName.get(i).getText()+" ----->  deprture time : "+departureTime.get(i).getText(),true);
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
