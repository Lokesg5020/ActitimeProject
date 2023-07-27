package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUpPage {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Lokesh");
		Thread.sleep(3000);
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Eligaram");
		Thread.sleep(3000);
		WebElement phonenumber = driver
				.findElement(By.xpath("//div[text()='Mobile number or email address']/../input[@type='text']"));
		phonenumber.sendKeys("7997607408");
		Thread.sleep(3000);
		WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
		newPassword.sendKeys("7997607408");
		Thread.sleep(3000);
		WebElement dayfield = driver.findElement(By.id("day"));
		dayfield.click();
		Thread.sleep(3000);
		WebElement dayfield1 = driver.findElement(By.xpath("//option[text()='18']"));
		dayfield1.click();
		Thread.sleep(3000);
		WebElement monthfield = driver.findElement(By.id("month"));
		monthfield.click();
		Thread.sleep(3000);
		WebElement monthfield1 = driver.findElement(By.xpath("//option[text()='Sep']"));
		monthfield1.click();
		Thread.sleep(3000);
		WebElement yearfield = driver.findElement(By.id("year"));
		yearfield.click();
		Thread.sleep(3000);
		WebElement yearfield1 = driver.findElement(By.xpath("//option[text()='2000']"));
		yearfield1.click();
		Thread.sleep(3000);
		WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
		maleradiobutton.click();
		Thread.sleep(3000);
		WebElement sighinbutton = driver.findElement(By.name("websubmit"));
		sighinbutton.click();
		
	}
}
