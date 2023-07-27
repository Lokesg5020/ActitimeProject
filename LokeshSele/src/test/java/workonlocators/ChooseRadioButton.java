package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseRadioButton {
public static void main(String[] args) throws Throwable {
	//Instantiate the browser specific class
	WebDriver driver = new ChromeDriver();
	//Maximize the browser window 
	driver.manage().window().maximize();
	//Enter the Main URl of the Application
	driver.get("https://www.facebook.com/signup");
	//Identify the Male Radio Button
	WebElement MaleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type='radio']"));
	//Identify the Female Radio Button
	WebElement FemaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@type='radio']"));
	//Identify the Custom Radio Button
	WebElement CustomRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input[@type='radio']"));
	MaleRadioButton.click();
	Thread.sleep(4000);
	FemaleRadioButton.click();
	Thread.sleep(4000);
	CustomRadioButton.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
}
}
