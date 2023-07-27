package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
	public static void main(String[] args) throws Throwable {
		// instantiate the specific browser class
		WebDriver driver = new ChromeDriver();
		// Enter the URL in the form of String
		driver.get("https://www.shoppersstack.com/");
		// capturing and storing the Title of the Web page
		String webpagetitle = driver.getTitle();
		System.out.println("Web page Title is = " + webpagetitle);
		Thread.sleep(10000);
		driver.get("https://www.shoppersstack.com/products_page/86");
		String webpagetitle1 = driver.getTitle();
		System.out.println("web page title 1 is = " + webpagetitle1);
		Thread.sleep(10000);
		driver.close();

	}
}
