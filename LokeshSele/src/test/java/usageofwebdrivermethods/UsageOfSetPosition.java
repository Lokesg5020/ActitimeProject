package usageofwebdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://demo.actitime.com/");
	Thread.sleep(5000);
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
	Thread.sleep(5000);
	Dimension windowTargetSize = new Dimension(200,300);
	driver.manage().window().setSize(windowTargetSize);
	Thread.sleep(5000);
	Point windowTargetPosition = new Point(150,300);
	driver.manage().window().setPosition(windowTargetPosition);
	Thread.sleep(5000);
	driver.quit();
	
	
}
}
