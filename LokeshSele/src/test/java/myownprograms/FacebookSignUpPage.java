package myownprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignUpPage {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Lokesh");
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Eligaram");
		WebElement phonenumber = driver
				.findElement(By.xpath("//div[text()='Mobile number or email address']/../input[@type='text']"));
		phonenumber.sendKeys("7997607408");
		WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
		newPassword.sendKeys("7997607408");
		WebElement dayfield = driver.findElement(By.id("day"));
		dayfield.click();
		WebElement dayfield1 = driver.findElement(By.xpath("//option[text()='18']"));
		dayfield1.click();
		WebElement monthfield = driver.findElement(By.id("month"));
		monthfield.click();
		WebElement monthfield1 = driver.findElement(By.xpath("//option[text()='Sep']"));
		monthfield1.click();
		WebElement yearfield = driver.findElement(By.id("year"));
		yearfield.click();
		WebElement yearfield1 = driver.findElement(By.xpath("//option[text()='2000']"));
		yearfield1.click();
		WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
		maleradiobutton.click();
		WebElement sighinbutton = driver.findElement(By.name("websubmit"));
		sighinbutton.click();
		driver.manage().window().minimize();
		driver.quit();
	}
}
