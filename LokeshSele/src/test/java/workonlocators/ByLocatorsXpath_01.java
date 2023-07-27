package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsXpath_01 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop.malaicha.com/login");
	WebElement cookies = driver.findElement(By.className("outline"));
	cookies.click();
	WebElement registerbutton = driver.findElement(By.xpath("//button[text()='Register']"));
	registerbutton.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
