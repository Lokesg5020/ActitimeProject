package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRelatedException {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Enter the Main URL Of the Application
		driver.get("https://www.myntra.com/");
		// Identify the T-Shirt Button
		// T-Shirt button is present in the Application. But it is not visible.
		// So compiler throw the ElementNotInteractableException
		driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/descendant::a[text()='T-Shirts'])[2]")).click();
		//minimize the browser 
		driver.manage().window().minimize();
		//Terminate all the windows
		driver.quit();
	}
}
