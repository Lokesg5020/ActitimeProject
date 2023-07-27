package vtigerPreAndPost;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class VtigerPreAndPostConditions {
	public WebDriver driver;

	@BeforeMethod
	public void preConditions() throws EncryptedDocumentException, IOException {
		VtigerPropertyConditions until = new VtigerPropertyConditions();
		String browser = until.properties("vtiger", 0, 1);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(until.properties("vtiger", 1, 1));
	}

	@AfterMethod
	public void postCondition() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
