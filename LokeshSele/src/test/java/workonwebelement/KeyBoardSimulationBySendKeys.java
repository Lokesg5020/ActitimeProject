package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulationBySendKeys {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Enter the Main URL of the Application
		driver.get("https://demo.actitime.com/");
		// Find the User Name Text field
		WebElement userNameTextField = driver.findElement(By.id("username"));
		// Clear the User name text field
		userNameTextField.clear();
		Thread.sleep(3000);
		// Enter the User name of the application
		userNameTextField.sendKeys("admin");
		Thread.sleep(3000);
		// Enter the next text field (Password) with same reference.
		userNameTextField.sendKeys(Keys.TAB, "manager");
		Thread.sleep(3000);
		// copy the User name Using sendKeys()
		userNameTextField.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(3000);
		// click the log in button using same reference
		userNameTextField.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(6000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
