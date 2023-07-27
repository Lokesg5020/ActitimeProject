package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsId_02 {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//Identify the user name text field.
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("admin");
	WebElement passwordfield = driver.findElement(By.name("pwd"));
	passwordfield.sendKeys("manager");
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	checkbox.click();
	Thread.sleep(5000);
	WebElement loginbutton = driver.findElement(By.id("loginButton"));
	loginbutton.click();
	Thread.sleep(15000);
	driver.quit();
}
}
