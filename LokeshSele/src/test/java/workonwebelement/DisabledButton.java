package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// Enter the Main URl of the Application
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		// Identify the Submit button
		WebElement submitButton = driver.findElement(By.name("submit"));
		// Check the Submit button is Disabled OR not
		// If the submit button is disabled then it should print Pass
		// If the submit button is enabled then it should print Fail.
		if (submitButton.isEnabled()) {
			System.out.println("Boolean: True - negetive - fail");
			System.out.println("Fail: The submit button is enabled and it is verified");
		} else {
			System.out.println("Boolean: False - positive - Pass");
			System.out.println("Pass: The submit button is disabled and it is verified");
		}
		// minimize the browser
		driver.manage().window().minimize();
		// Terminate all windows
		driver.quit();
	}
}
