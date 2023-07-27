package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UageOfIsEnabled {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter the Main URL of the Application
		driver.get("https://www.facebook.com/signup");
		//Identify the male radio button 
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		//Check the radio button is enabled or not
		//if it is enabled then it should print pass
		//if it is disabled then it should print false.
		if (maleRadioButton.isEnabled()) {
			System.out.println("Boolean: true");
			System.out.println("Pass:The male Radio Button is Enabled and it is verified");
		} else {
			System.out.println("Boolean: false");
			System.out.println("Fail:the male radio button is disabled and it is verified");
		}
		//Minimize the browser 
		driver.manage().window().minimize();
		//Terminate all windows
		driver.quit();

	}
}
