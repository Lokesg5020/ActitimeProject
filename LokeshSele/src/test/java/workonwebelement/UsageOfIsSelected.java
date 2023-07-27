package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Enter the main URL of the application
		driver.get("https://www.facebook.com/signup");
		//Identify the male radio button 
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		if (maleRadioButton.isSelected()) {
			// Before we select it has got already selected by default
			System.out.println("Pass: The male radio button is selected already");
		} else {
			// Before we select the maleRadioButton has not selected upon that confirmation
			// we are moving ahead to select
			System.out.println("Fail:Before we select the male radio button has not been selected");
			//Select the male radio button Since it has not been selected
			maleRadioButton.click();
		}
		//Verify the male Radio button has been selected after the selection or not
		if(maleRadioButton.isSelected()) {
			System.out.println("Boolean: true -Positive - Pass");
			System.out.println("Pass: The male radio button is selected and it is verified");
		}
		else {
			System.out.println("Boolean: False - Negetive - Fail");
			System.out.println("Fail: The male radio button is not selected even after clicking and it is verified");
		}
		//Minimize the browser
		driver.manage().window().minimize();
		//Terminate All the windows
		driver.quit();

	}
}
