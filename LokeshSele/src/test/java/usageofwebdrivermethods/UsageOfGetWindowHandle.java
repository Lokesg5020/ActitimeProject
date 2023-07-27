package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.nationalgeographic.com/");
	driver.quit();
	

 }
}
