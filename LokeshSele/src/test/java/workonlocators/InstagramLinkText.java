package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLinkText {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(5000);
	WebElement forgotpassword = driver.findElement(By.linkText("Forgot password?"));
	forgotpassword.click();
	Thread.sleep(5000);
	WebElement createaccount = driver.findElement(By.linkText("Create new account"));
	createaccount.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
