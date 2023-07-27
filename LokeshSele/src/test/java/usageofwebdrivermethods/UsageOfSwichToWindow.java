package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwichToWindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.nationalgeographic.com/");
		// capture all the windows ID
		for (String wid : driver.getWindowHandles()) {
			String url = driver.switchTo().window(wid).getCurrentUrl();
			if (url.equals("https://www.facebook.com/")) {
				driver.close();
			} else if (url.equals("https://www.nationalgeographic.com/")) {
				driver.close();
			}

		}
		driver.quit();
	}
}
