package usageofwebdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfNavigateMethods {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.dassault-aviation.com/en/");
		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
		URL groupPageUrl = new URL(mainUrl, "group/");
		URL passionPageUrl = new URL(mainUrl, "passion/");
		URL spacePageUrl = new URL(mainUrl, "space/");
		URL civilPageUrl = new URL(mainUrl, "civil/");
		URL defensePageUrl = new URL(mainUrl, "defense/");
		driver.navigate().to(defensePageUrl);
		driver.navigate().to(civilPageUrl);
		driver.navigate().to(spacePageUrl);
		driver.navigate().to(passionPageUrl);
		driver.navigate().to(groupPageUrl);
		driver.manage().window().minimize();
		driver.quit();
	}
}
