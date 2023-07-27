package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	WebElement CheckBox = driver.findElement(By.name("remember"));
	CheckBox.click();
	Thread.sleep(4000);
	CheckBox.click();
	Thread.sleep(4000);
	CheckBox.click();
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.quit();
	
	
	
}
}
