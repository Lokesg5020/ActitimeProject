package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorName_01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// enter the main URL of the application
		driver.get("https://www.facebook.com/");
		// find the element login
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		driver.manage().window().minimize();
		driver.quit();
	}
}
