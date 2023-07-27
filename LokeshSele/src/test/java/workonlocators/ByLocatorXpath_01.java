package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ByLocatorXpath_01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	Thread.sleep(4000);
	//finding register button
	WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
	registerButton.click();
	Thread.sleep(3000);
	WebElement firstname = driver.findElement(By.name("firstName"));
	firstname.sendKeys("Lokesh");
	Thread.sleep(3000);
	WebElement lastname = driver.findElement(By.name("lastName"));
	lastname.sendKeys("Eligaram");
	Thread.sleep(3000);
	WebElement emailfield = driver.findElement(By.name("email"));
	emailfield.sendKeys("lokesh2000918@gmail.com");
	Thread.sleep(3000);
	WebElement countryfield = driver.findElement(By.name("option"));
//	Actions(driver).scrollToElement(countryfield).perform();
	countryfield.click();
	Thread.sleep(3000);
	
}


}
