package datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginAndLogoutActitime {
	WebDriver driver;

	@Test
	public void LoginLogoutActitimeTest() throws Throwable {
		Properties pobj = new Properties();
		pobj.load(new FileInputStream("./src/test/resources/ActitimeDrive.properties"));
		String browserName = pobj.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.manage().window().minimize();
		driver.quit();
		
	}
}