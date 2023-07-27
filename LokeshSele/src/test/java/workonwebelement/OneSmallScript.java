package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneSmallScript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.clear();
		userNameTextField.sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButtonContainer"));
		Thread.sleep(5000);
		loginButton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
