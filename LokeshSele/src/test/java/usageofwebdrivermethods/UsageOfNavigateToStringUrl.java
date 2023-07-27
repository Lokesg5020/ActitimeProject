package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateToStringUrl {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	Thread.sleep(5000);
	//go to passion page pass the sub URL
	driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.quit();
	
}
}
