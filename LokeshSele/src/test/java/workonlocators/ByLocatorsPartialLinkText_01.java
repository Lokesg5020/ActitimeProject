package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByLocatorsPartialLinkText_01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alvas.org/");
		WebElement college = driver.findElement(
				By.linkText("Alva’s College of Medical Laboratory Technology & Post Graduate Research Centre"));
		Actions action = new Actions(driver);
		action.scrollToElement(college).perform();
		college.click();
		
	}
}
