package myownprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdhipurushTrailer {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//div[@id='search-input']/child::input")).sendKeys("adipurush telugu final trailer");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath(
				"Adipurush (Official Trailer) Telugu Prabhas | Kriti Sanon | Saif Ali Khan | Om Raut | Bhushan Kumar"))
				.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).sendKeys(Keys.ENTER);
	}
}
