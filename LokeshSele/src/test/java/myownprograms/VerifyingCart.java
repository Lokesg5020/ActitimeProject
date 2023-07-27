package myownprograms;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyingCart {
	@Test
	public void addToCartVerify() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']"))
				.sendKeys("iphone 14 pro max");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		WebElement more = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
		Select select =new Select(more);
		List<WebElement> text = select.getOptions();
		for (WebElement webElement : text) {
			System.out.println((webElement.getText()));
		}
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		Set<String> tabs = driver.getWindowHandles();
		String expectedProductTitle = "APPLE iPhone 14 Pro Max ( 128 GB Storage ) Online at Best Price On Flipkart.com";
		for (String tab : tabs) {
			String actualProductTitle = driver.switchTo().window(tab).getTitle();
			if (actualProductTitle.equals(expectedProductTitle)) {
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				WebElement product = driver.findElement(
						By.xpath("//span[@class='_2-ut7f _1WpvJ7']/preceding-sibling::div[@class='_2-uG6-']/child::a"));
				if (product.isDisplayed()) {
					System.out.println("Pass: The product has displayed and it is verified");
				String productPrice = driver.findElement(By.xpath("//a[text()='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']/parent::div[@class='_2-uG6-']/following-sibling::span[@class='_2-ut7f _1WpvJ7']")).getText();
				System.out.println("Product price is "+productPrice);
				}
				else{
					System.out.println("fail: The product has not displayed and it is verified");
				}
			}
		}
		driver.navigate().back();
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
