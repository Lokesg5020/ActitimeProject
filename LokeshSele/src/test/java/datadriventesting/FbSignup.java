package datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FbSignup {
	public WebDriver driver;

	@Test
	public void fbSignupTest() throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/facebooksignupdata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("browser");
		System.out.println(browser);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.name("firstname")).sendKeys(pobj.getProperty("firstname"));
		driver.findElement(By.name("lastname")).sendKeys(pobj.getProperty("lastname"));
		driver.findElement(By.name("reg_email__")).sendKeys(pobj.getProperty("phno"));
		driver.findElement(By.id("password_step_input")).sendKeys(pobj.getProperty("password"));
		List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
		for (WebElement dropDown : allDropdowns) {
			if(dropDown.isDisplayed()) {
				Select dropDownSelect = new Select(dropDown);
				if(dropDown.getAttribute("title").equals("Day")) {
					dropDownSelect.selectByVisibleText("18");
				}else if(dropDown.getAttribute("title").equals("Month")) {
					dropDownSelect.selectByVisibleText("Sep");
				}else if(dropDown.getAttribute("title").equals("Year")) {
					dropDownSelect.selectByVisibleText("2000");
				}
			}
		}
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(10000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
