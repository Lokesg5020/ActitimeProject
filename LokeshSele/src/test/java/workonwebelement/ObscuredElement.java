package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObscuredElement {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		//// Enter the Mail URL of the Application.
		driver.get("https://www.amazon.com/");
		//To avoid that first we click on some constant element.
		driver.findElement(By.xpath("//span[contains(.,\"Don't Change\")]/preceding-sibling::input")).click();
		Thread.sleep(4000);
		/*
		 * If any element is intercepted in middle of the our element then the compiler
		 * throws ElementClickInterceptedException
		 */
		// Here location is the Intercepted element of customer services
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]/following-sibling::a[text()='Customer Service']"))
				.click();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
