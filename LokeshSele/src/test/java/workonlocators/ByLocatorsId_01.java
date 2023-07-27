package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsId_01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//Identify the login button.
	WebElement loginbutton = driver.findElement(By.id("loginButton"));
	loginbutton.click();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
