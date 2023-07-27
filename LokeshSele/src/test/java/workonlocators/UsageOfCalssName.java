package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCalssName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement tagLine = driver.findElement(By.className("_8eso"));
		String tagLineText = tagLine.getText();
		System.out.println("Tag Line Text is : "+tagLineText);
		driver.manage().window().minimize();
		driver.quit();
	}
}
