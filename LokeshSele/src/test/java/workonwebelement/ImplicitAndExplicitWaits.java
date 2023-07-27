package workonwebelement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWaits {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.facebook.com/");
		URL url = new URL("https://www.facebook.com/");
		driver.navigate().to(url);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		driver.get("https://www.amazon.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/")))
			System.out.println("url is correct");
		TakesScreenshot tc=(TakesScreenshot)driver;
		File image = tc.getScreenshotAs(OutputType.FILE);
		
		driver.quit();
			
	}
}
