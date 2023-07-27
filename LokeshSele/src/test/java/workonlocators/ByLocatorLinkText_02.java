package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText_02 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	Thread.sleep(3000);
//	WebElement forgotpassword1 = driver.findElement(By.id("toPasswordRecoveryPageLink"));
//	forgotpassword1.click();
	Thread.sleep(3000);
	WebElement forgotpassword2 = driver.findElement(By.partialLinkText("your password?"));
	forgotpassword2.click();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
