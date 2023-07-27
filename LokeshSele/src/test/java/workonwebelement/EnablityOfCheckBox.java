package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnablityOfCheckBox {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// Enter the main URl of the application
		driver.get("https://demo.actitime.com/");
		// Identify the keepLoggedInCheckBox
		WebElement keepLoggedInCheckBox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		// check the keepLoggedInCheckBox is enable or not
		// if it is enabled then it should print pass
		// if it is disabled then it should print fail
		if (keepLoggedInCheckBox.isEnabled()) {
			System.out.println("Boolean: True - Positive");
			System.out.println("Pass: The keepLoggedInCheckBox is enabled and it is verfied.");
		} else {
			System.out.println("Boolean: False - Negetive");
			System.out.println("Fail: The keepLoggedInCheckBox is disabled and it is verfied.");
		}
		// Minimize the browser
		driver.manage().window().minimize();
		// Terminate all windows
		driver.quit();
	}
}
