package myownprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement searchBar = driver.findElement(By.id("search"));
	searchBar.sendKeys("Adhipurush trailer");
	WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
	searchButton.click();
	
}
}
