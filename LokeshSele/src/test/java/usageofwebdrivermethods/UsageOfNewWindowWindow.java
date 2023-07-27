package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindowWindow {
	public static void main(String[] args) throws Throwable {
		// instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Pass the main URL of the Application.
		driver.get("https://www.google.com/maps/@12.9107931,77.5963159,15z");
		Thread.sleep(5000);
		//Launching new window by using the same Object reference.
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(5000);
		driver.quit();
	}
}
