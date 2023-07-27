package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement userName = driver.findElement(By.id("username"));
		Point userNameLocation = userName.getLocation();
		System.out.println("userNameLocation = "+userNameLocation);
		int userNamesartX = userNameLocation.getX();
		System.out.println("userNamesartX = "+userNamesartX);
		int userNameStartY = userNameLocation.getY();
		System.out.println("userNameStartY = "+userNameStartY);
		driver.manage().window().minimize();
		driver.quit();		
	}
}
