package com.latestAssignments.testscrripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flipkartIphoneTitlesPrint {
	@Test
public void allTitles() {  
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone 11");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
    for(int i= 0;i<iphone.size();i++) {
    Reporter.log(iphone.get(i).getText()+"  --->  "+price.get(i).getText(),true);
    }
    driver.manage().window().minimize();
    driver.quit();
}
}
