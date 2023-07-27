package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingTwoImages {
	public static void main(String[] args) throws Throwable {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Enter the main URL of the application
		try {
		driver.get("https://pib.gov.in/");
		}
		catch (WebDriverException e) {
		}
		//Identify the amritmahotsav image
		WebElement amritmahotsavImg = driver.findElement(By.xpath("//a[@href='https://amritmahotsav.nic.in/']/img"));
		//Identify the Source of the amritmahotsav image
		String sourceOfamritmahotsav = amritmahotsavImg.getAttribute("src");
		System.out.println("sourceofamritmahotsav = "+sourceOfamritmahotsav);
		//Identify the g20india image
		WebElement g20IndiaImage = driver.findElement(By.xpath("//a[@href='https://pib.gov.in/newsite/g20india.aspx']/img"));
		//identify the source of the g20india image
		String sourceOfg20IndiaImage = g20IndiaImage.getAttribute("src");
		System.out.println("sourceOfg20IndiaImage = "+sourceOfg20IndiaImage);
		//Compare the Both sources
		Thread.sleep(2000);
		if(sourceOfamritmahotsav.equals(sourceOfg20IndiaImage)) {
			System.out.println("Boolean True");
			System.out.println("Since the both Source are same and both the images are same.");
		}else {
			System.out.println("Boolean False");
			System.out.println("Since the both source are different and both images are different.");
		}
		//minimize the window
		driver.manage().window().minimize();
		//terminate all the windows
		driver.quit();
	}
}
