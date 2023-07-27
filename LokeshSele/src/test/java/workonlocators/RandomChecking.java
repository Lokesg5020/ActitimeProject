package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomChecking {
public static void main(String[] args) {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://shop-global.malaicha.com/");
			// find the login | Register button
			// By ID
//		driver.findElement(By.id("my-acc-btn")).click();
			// By ClassName
//		driver.findElement(By.className("transparent")).click();
			//By TagName
			//Note: here there are 7 duplicates out of that first <button> is the one which we want to identify.
			//Since we know that findElement() will always identify the first availible elemennt.
			//here address is working by chance - It should not be the reality.
//			driver.findElement(By.tagName("button")).click();
			//By Css
//			driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();
//			driver.findElement(By.cssSelector("button[class='transparent']")).click();
			//By Xpath 
//			driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();
//			driver.findElement(By.xpath("//button[@class='transparent']")).click();
//			driver.findElement(By.xpath("//button[contains(@id,'my-acc')]")).click();
//			driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
//			driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
			driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();

}
}
