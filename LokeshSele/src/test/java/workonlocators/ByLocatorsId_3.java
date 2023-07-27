package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsId_3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("9705304369");
		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("karthik");
		WebElement logInButton = driver.findElement(By.name("login"));
		logInButton.click();
	}
}
