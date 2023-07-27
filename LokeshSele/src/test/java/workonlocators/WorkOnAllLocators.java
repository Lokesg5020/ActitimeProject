package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOnAllLocators {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		// By ID
		// YES it is working.
//	driver.findElement(By.id("my-acc-btn")).click();
		// By ClassName
		// YES It is also working
//	driver.findElement(By.className("transparent")).click();
		// By tagName
		// YES Here,It is working because of findElement will consider Only first tag
		// Here Login|Register Button is the first one to identify. So it is working
		// But All the time it won't work like this.
//		driver.findElement(By.tagName("button")).click();
		// By cssSelector using class attribute
//		driver.findElement(By.cssSelector("button[class='transparent']")).click();
		// By cssSelector using ID attribute
//		driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();
		// By Xpath Complete Attribute value
//		driver.findElement(By.xpath(" //button[@class='transparent']")).click();
//		driver.findElement(By.xpath(" //button[@id='my-acc-btn']")).click();
		// By Xpath partial Attribute value.
//		driver.findElement(By.xpath("//button[contains(@id,'my-acc')]")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'transparent')]")).click();
//		driver.findElement(By.xpath(
//				"//button[contains(@style,'z-index: 999999; background: rgb(255, 255, 255); padding: 0px 10px;')]"))
//				.click();
//		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
//		driver.findElement(By.xpath(" //button[contains(.,'Register')]")).click();
		// By Xpath Independent and Dependent
//		driver.findElement(By.xpath("//span[@class='loginRegister']/..")).click();
		// By Xpath using axis
		driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
