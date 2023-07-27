package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UasageOfFullScreen {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nationalgeographic.com/environment/");
	//Go to full screen mode
	Thread.sleep(5000);
	driver.manage().window().fullscreen();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.close();
}
}
