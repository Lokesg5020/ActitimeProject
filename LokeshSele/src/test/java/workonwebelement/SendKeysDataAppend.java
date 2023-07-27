package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDataAppend {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		Thread.sleep(4000);
		userNameTextField.clear();
		userNameTextField.sendKeys("Selenium");
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
