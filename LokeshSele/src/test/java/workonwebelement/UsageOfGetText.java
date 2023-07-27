package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Identift the forgotten password link
		WebElement forgottenPassword = driver.findElement(By.xpath("//a[contains(@href,'recover/initiate/?privacy_mutation')]"));
		//Get the forgotten password tag text
		String forgottenPasswordText = forgottenPassword.getText();
		System.out.println("Forgotten Password Tag Text is : "+forgottenPasswordText);
		//comparing the forgotten password tagtext
		if(forgottenPasswordText.equals("Forgotten password?")) {
			System.out.println("pass: Forgotten password tag text is found correct and it is verified.");
		}else {
			System.out.println("Fail: Forgotten password tagtext is found incorrect and it is verified");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
