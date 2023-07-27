package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnButton {
	public static void main(String[] args) throws Throwable {
		//Identify the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter the Main URl of the application
		driver.get("https://www.facebook.com/");
		//Identify the login button and click the button
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
