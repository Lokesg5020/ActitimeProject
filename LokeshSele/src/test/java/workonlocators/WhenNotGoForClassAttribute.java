package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhenNotGoForClassAttribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//if class attribute having any space then we don't go for it.
		//InvavidSelectorException - Selenium - run - Unchecked
		driver.findElement(By.className("fb_logo _8ilh img"));
		driver.manage().window().minimize();
		driver.quit();
	}
}
