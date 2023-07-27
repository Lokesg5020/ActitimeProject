package usageofwebdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UsageOfGetStringUrlEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		RemoteWebDriver rdriver = (RemoteWebDriver) driver;
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("actualUrl :" + actualUrl);
		String expectedUrl = "https://demo.actitime.com/login.do";
		System.out.println("expectedUrl :" + expectedUrl);
		if (actualUrl.contains("login.do")) {
			System.out.println("pass:url");
		} else {
			System.out.println("Fail:url");
		}
		String expectedTitle = "actiTIME - Login";
		System.out.println("expectedTitle is: " + expectedTitle);
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle is : " + actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("pass:title");
		} else {
			System.out.println("fail:title");
		}
//	Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
//	Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
//	Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com/");
		Set<String> wids = driver.getWindowHandles();
		for (String wid : wids) {
			System.out.println(wid);
			String title = driver.switchTo().window(wid).getTitle();
			System.out.println(title);
		}
		driver.navigate().refresh();
		driver.quit();
	}
}
