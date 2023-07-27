package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLeftAndRightAlignment {
	public static void main(String[] args) {
		//instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//Enter the main URl of the application
		driver.get("https://demo.actitime.com/");
		//identify the user name  text field and use getRect()
		Rectangle userName = driver.findElement(By.id("username")).getRect();
		//identify the password text field and use getRect()
		Rectangle password = driver.findElement(By.name("pwd")).getRect();
		//get the startX of user name text field
		int userNameStartX = userName.getX();
		System.out.println("userNameStartX = " + userNameStartX);
		//Get the width of User name text field
		int userNameWidth = userName.getWidth();
		System.out.println("userNameWidth = " + userNameWidth);
		//get the startX of password text field
		int passwordStartX = password.getX();
		System.out.println("passwordStartX = " + passwordStartX);
		//Get the width of User name text field
		int passwordWidth = password.getWidth();
		System.out.println("passwordWidth = " + passwordWidth);
		//get the endX of user name text field
		int usernameEndX = userNameStartX + userNameWidth;
		System.out.println("usernameEndX = " + usernameEndX);
		//get the endX of password text field
		int passwordEndX = passwordStartX + passwordWidth;
		System.out.println("passwordEndX = " + passwordEndX);
		//checking the left alignment of username and password
		if (userNameStartX == passwordStartX) {
			System.out.println(
					"Pass:The left alignment of  username and passsword textField is found correct and it is verified");
		} else {
			System.out.println(
					"Fail:The left alignment of  username and passsword textField is found incorrect and it is verified");
		}
		//Checking the right alignment of username and password
		if (usernameEndX == passwordEndX) {
			System.out.println(
					"Pass:The right alignment of User name and password Text Field is found correct and it is verified");
		} else {
			System.out.println(
					"Fail:The right alignment of User name and password Text Field is found incorrect and it is verified");

		}
		//minimize the browser
		driver.manage().window().minimize();
		//terminate all windows
		driver.quit();

	}
}
