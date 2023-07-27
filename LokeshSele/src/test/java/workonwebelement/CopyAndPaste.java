package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPaste {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the browser window
		driver.manage().window().maximize();
		//Enter the main URL of the application
		driver.get("https://www.facebook.com/");
		//Identify the email text field
		WebElement emailTextField = driver.findElement(By.id("email"));
		//
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		emailTextField.sendKeys("Lokesh Eligaram");
		emailTextField.sendKeys(Keys.CONTROL + "a");
		emailTextField.sendKeys(Keys.CONTROL + "x");
		passwordTextField.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
