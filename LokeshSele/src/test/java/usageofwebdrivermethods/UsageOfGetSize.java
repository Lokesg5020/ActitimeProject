package usageofwebdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] args) throws Throwable {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// pass the main URl of the app
		driver.get("https://www.facebook.com/");
		// define the new window - WebDriver
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		// set the size of the window
		// create the Dimension Object to define the window target size - Dimension(int
		// width, int height)
		Dimension targetWindowSize = new Dimension(600, 300);
		// assign the specified dimension to the setSize(Dimension targetSize)
		driver.manage().window().setSize(targetWindowSize);
		Thread.sleep(2000);
		// specify the position or co-ordinates of the window on the screen.
		Point targetWindowPosition = new Point(150, 200);
		driver.manage().window().setPosition(targetWindowPosition);
		// capture the window size
		Dimension windowSize = driver.manage().window().getSize();
		int windowWidth = windowSize.getWidth();
		System.out.println("windowWidth = " + windowWidth);
		int windowHeight = windowSize.getHeight();
		System.out.println("windowHeight = " + windowHeight);
		// capture the window position
		Point windowPosition = driver.manage().window().getPosition();
		int windowStartX = windowPosition.getX();
		System.out.println("windowStartX = " + windowStartX);
		int windowStartY = windowPosition.getY();
		System.out.println("windowStartY = " + windowStartY);
		driver.quit();

	}
}