package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindow {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Maximize the browser of the application.
		driver.manage().window().maximize();
		// Entering the main URL of the Application.
		driver.get("https://www.nationalgeographic.com/");
		Thread.sleep(5000);
		// Create new window upon the same object reference.
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		Thread.sleep(5000);
		//Close the instagram window.
		//post condition.
		//driver.close();
		//This will terminate the session completely.
		//This method will all the windows irrespective of which window is under control.
        driver.quit();
		
	}
}
