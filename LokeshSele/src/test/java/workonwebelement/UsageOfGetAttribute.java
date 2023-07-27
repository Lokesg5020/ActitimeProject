package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the main URL of the application
		driver.get("https://demo.actitime.com/");
		//Identify the keepLoggedInCheckBox 
		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//get the title attribute value 
		String keepLoggedInCheckBoxToolTip = keepLoggedInCheckBox.getAttribute("title");
		System.out.println("keepLoggedInCheckBoxToolTip = "+keepLoggedInCheckBoxToolTip);
		//Get the value attribute
		System.out.println("value Attribute value = "+keepLoggedInCheckBox.getAttribute("value"));
		//Get the type Attribute
		System.out.println("type Attribute Value = "+keepLoggedInCheckBox.getAttribute("type"));
		//Get the Href Attribute
		//href is not present in the HTML program.if I'm trying to get not presented Attribute
		//It will print null
		System.out.println("href attribute value = "+keepLoggedInCheckBox.getAttribute("href"));
		//minimize the browser
		driver.manage().window().minimize();
		//terminate all the windows
		driver.quit();
	}
}
