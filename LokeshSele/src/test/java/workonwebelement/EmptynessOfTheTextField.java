package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptynessOfTheTextField {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter the main URL of the Application
		driver.get("https://demo.actitime.com/");
		//Identify the User name Text field
		WebElement userNameTextField = driver.findElement(By.id("username"));
		//Identyfy the Value Attribute
		String valueAttribute = userNameTextField.getAttribute("value");
		System.out.println("valueAttribute ="+valueAttribute);
		//Check the value Attribute is empty or not.
		if(valueAttribute.isEmpty()) {
			System.out.println("Boolean True");
			System.out.println("The username text field is empty");
		}else {
			System.out.println("Boolean False");
			System.out.println("The username text field is not empty");
		}
		//Minimize the browser
		driver.manage().window().minimize();
		//Terminate all the windows
		driver.quit();
	}
}
