package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfMinimize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		Thread.sleep(5000);
		//Minimizing the window before terminate is the post condition.
		//It is also one of the standard practice in Automation.
		//Window get surrendered to the task bar after the desired operation has got completed.
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
	}
}
