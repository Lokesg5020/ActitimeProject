package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//Go and capture the current URL in the browser
		//We can capture the triggered URL in the browser
		String actualloginpageurl=driver.getCurrentUrl();
		System.out.println("Actual Login Page URL= "+actualloginpageurl);
		String expectedloginpageurl="https://demo.actitime.com/login.do";
		System.out.println("Expected Login Page URL = "+expectedloginpageurl);
		if(actualloginpageurl.contains("login.do")) {
			System.out.println("Pass: The login page URL is found correct and it is verified");
		}
		else {
			System.out.println("fail: The login page URL is found incorrect and it is verified");
		}
		Thread.sleep(5000);
		driver.close();
	}
}
