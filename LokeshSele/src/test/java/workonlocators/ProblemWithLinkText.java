package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithLinkText {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nbtindia.gov.in/");
	WebElement catalogues = driver.findElement(By.linkText("CATALOGUES"));
	catalogues.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
