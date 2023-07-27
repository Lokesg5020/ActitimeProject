package usageofwebdrivermethods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// Maximize the Application
		driver.manage().window().maximize();
		// Enter Main URL of the Application
		driver.get("https://demo.actitime.com/");
		Thread.sleep(5000);
		// Create new window and Enter the main URL
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://facebook.com/");
		Thread.sleep(5000);
		// Set the size of the Window
		//Create the dimension Object to define the window targetSize-Dimension(int width,int height)
		Dimension targetWindowSize = new Dimension(200,400);
		driver.manage().window().setSize(targetWindowSize);
		Thread.sleep(5000);
		driver.quit();

	}
}
