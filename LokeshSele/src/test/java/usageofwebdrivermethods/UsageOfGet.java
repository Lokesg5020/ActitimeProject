package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
public static void main(String[] args) {
	//instantiate the specific browser class
	WebDriver driver=new ChromeDriver();
	//Enter the URL in a String format
	driver.get("https://www.shoppersstack.com/");
	
	}
}
