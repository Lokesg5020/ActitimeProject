package saucePropertyData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SaucePreAndPostConditions {
	public WebDriver driver;

	@BeforeMethod
	public void preCondition() throws EncryptedDocumentException, IOException {
		SauceProperties util = new SauceProperties();
		String browser = util.properties("Functionality", 4, 2);
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("edge"))
			driver = new EdgeDriver();
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(util.properties("Functionality", 5, 2));

	}

	@AfterMethod
	public void postCondition() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
