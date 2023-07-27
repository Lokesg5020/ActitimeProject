package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfIsEnabled {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Maximize the application
		driver.manage().window().maximize();
		// Enter the Main URL of the Application
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		// Identify the ZIP button
		driver.findElement(By.xpath("//a[text()=' ZIP']")).click();
		// identify the disabled element
		WebElement disabledElement = driver.findElement(
				By.xpath("//div[@class='obttns']/descendant::a[text()='Download SOLARIS.X64_195000_db_home.zip']"));
		// isEnabled method is only works for <input> Or <button>
		// Anything other than this it won't work
		// it always give the input as "True"
		if (disabledElement.isEnabled()) {
			System.out.println("Boolean : true - negetive - Fail ");
			System.out.println("Fail: The button is Enabled and it is verified");
		} else {
			System.out.println("Boolean : false - positive - pass ");
			System.out.println("Pass: The button is disabled and it is verified");
		}
		// Minimize the Browser
		driver.manage().window().minimize();
		// Terminate all windows
		driver.quit();

	}
}
