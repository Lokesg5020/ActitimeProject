package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechTheLocationAndSize {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class.
		WebDriver driver = new ChromeDriver();
		// maximize the browser window.
		driver.manage().window().maximize();
		//// Enter the main URl of the Application.
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		// Identify the Email Text Field.
		WebElement email = driver.findElement(By.id("email"));
		// Get the Location of Email TExt Field.
		Point emailLocation = email.getLocation();
		// print the Email Text field Location.
		System.out.println("emailLocation = " + emailLocation);
		// Get the size of the Email Text field.
		Dimension emailSize = email.getSize();
		// Print the size of the Email Text field.
		System.out.println("EmailSize = " + emailSize);
		// Identify the Password Text field.
		WebElement password = driver.findElement(By.id("passContainer"));
		// Get the Location of the password Text field.
		Point passwordLocation = password.getLocation();
		// Print the Location of the Password Text field.
		System.out.println("passwordLocation = " + passwordLocation);
		// Get the Size of the Password text field.
		Dimension passwordSize = password.getSize();
		// Print the Size of the Password Text Field.
		System.out.println("passwordSize = " + passwordSize);
		// Minimize the browser.
		driver.manage().window().minimize();
		// Terminate all the windows.
		driver.quit();
	}
}
