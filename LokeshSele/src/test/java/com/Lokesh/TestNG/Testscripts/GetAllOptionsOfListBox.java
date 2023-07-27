package com.Lokesh.TestNG.Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GetAllOptionsOfListBox {
@Test
public void allOptions() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("file:///C:/Users/pc/Desktop/Dropdown.html");
	WebElement listBox = driver.findElement(By.id("t1"));
	Select select = new Select(listBox);
	WebElement option = select.getWrappedElement();
	System.out.println(option.getText());
}
}
