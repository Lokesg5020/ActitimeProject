package usageofwebdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {
	public static void main(String[] args) {
		// Instantiating the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// Enter the main URL of the application
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		// Creating the new window up on the same object.
		// Enter the sub window main URL of the application.
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		// print the count of WindowsId.
		Set<String> allWindowsId = driver.getWindowHandles();
		int windowsIdCount = allWindowsId.size();

		System.out.println("windowsIdCount = " + windowsIdCount);
		// iterate the set of WindowsId
		for (String wid : allWindowsId) {
			System.out.println(wid);
		}
		// terminating all the windows.
		driver.quit();

	}
}
