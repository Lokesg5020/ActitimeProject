package com.bharath.Assignments.testscript;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SortedOrderListBox {
	@Test
public void SortingTest() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/pc/Desktop/Dropdown.html");
	WebElement dropdown = driver.findElement(By.id("t1"));
	Select select = new Select(dropdown);
	List<WebElement> options = select.getOptions();
	ArrayList<String> set= new ArrayList<String>();
	for(int i=0;i<options.size();i++) {
	  String option = options.get(i).getText();
	  set.add(option);
	  Collections.sort(set);
	}
	for(int i=0;i<set.size();i++) {
		System.out.println(set.get(i));
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
