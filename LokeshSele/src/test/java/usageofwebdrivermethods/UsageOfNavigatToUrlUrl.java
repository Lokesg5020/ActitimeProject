package usageofwebdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigatToUrlUrl {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dassault-aviation.com/en/");
		URL mainUrl = new URL("https://dassault-aviation.com/en/");
		URL groupPageUrl = new URL(mainUrl, "group/");
		URL passionPageUrl = new URL(mainUrl, "passion/");
		URL civilPageUrl = new URL(mainUrl, "civil/");
		URL spacePageUrl = new URL(mainUrl, "space/");
		URL defencePageUrl = new URL(mainUrl, "defense/");
		// -----------------------------------------------------------------------------
		Thread.sleep(4000);
		driver.navigate().to(defencePageUrl);

		Thread.sleep(4000);
		driver.navigate().to(spacePageUrl);

		Thread.sleep(4000);
		driver.navigate().to(groupPageUrl);

		Thread.sleep(4000);
		driver.navigate().to(passionPageUrl);

		Thread.sleep(4000);
		driver.navigate().to(civilPageUrl);

		Thread.sleep(4000);
		driver.quit();
	}
}
