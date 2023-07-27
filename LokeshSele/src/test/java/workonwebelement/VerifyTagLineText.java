package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagLineText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Identify the Tag line
		WebElement tagLine = driver.findElement(By.className("_8eso"));
		//Get the tagline text
		String actualTagLineText = tagLine.getText();
		System.out.println("actualTagLineText is = " + actualTagLineText);
		//Expected tag line Text is
		String ExpectedTagLineText = "Facebook helps you connect and share with the people in your life.";
		System.out.println("ExpectedTagLineText is = " + ExpectedTagLineText);
		//Comparing the both tagline Text
		if (actualTagLineText.equals(ExpectedTagLineText)) {
			System.out.println("The tag line text is found correct and it is verified.");
		} else {
			System.out.println("the tag line text is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
