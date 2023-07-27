package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//Identify the login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//Get the Login button TagName
		String loginTagName = loginButton.getTagName();
		System.out.println("Login Tagname = "+"<"+loginTagName+">");
		//Checking the login button is made with login button OR not
		//If it was made with button tag the it should click the button
		if(loginTagName.equals("button")){
			System.out.println("Login button is made with button tag.");
			loginButton.click();
		}else {
			System.out.println("Login button is not made with button tag.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
