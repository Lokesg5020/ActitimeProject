package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindowTab {
	public static void main(String[] args) throws Throwable {
		// Instantiating the browser specific class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		// creating the new Tab by using the same object reference.
		driver.switchTo().newWindow(WindowType.TAB).get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(4000);
		// terminating all the windows.
		driver.quit();

	}
}
