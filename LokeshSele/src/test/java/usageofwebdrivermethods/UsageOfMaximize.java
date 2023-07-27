package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfMaximize {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	//Pre-condition
	//Maximize the browser
	//we will get the better view of the application.
	//we are utilizing the browser with its fullest capacity.
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	Thread.sleep(5000);
	driver.close();
}
}
