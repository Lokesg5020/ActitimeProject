package usageofwebdrivermethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pre_PostConditions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.dassault-aviation.com/en/");
	driver.manage().window().fullscreen();
	driver.manage().window().minimize();
	driver.quit();
}
}
