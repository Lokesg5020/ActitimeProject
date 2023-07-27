package synchronization;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/")))
			System.out.println("url is correct");
		TakesScreenshot tc=(TakesScreenshot)driver;
		File image = tc.getScreenshotAs(OutputType.FILE);
		String local = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(local);
		File dest=new File("./Screenshot/"+local+"Amazon.png");
		FileUtils.copyFile(image, dest);
		driver.quit();
	}

}
