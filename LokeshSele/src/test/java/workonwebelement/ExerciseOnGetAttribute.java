package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOnGetAttribute {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter the main URL of the Application
		driver.get("https://pib.gov.in/indexd.aspx");
		//Identify the G20 Image 
		WebElement g20 = driver.findElement(By.xpath("//a[@href='https://pib.gov.in/newsite/g20india.aspx']/img"));
		//Identify the ToolTip of G20 Image
		String g20ToolTipText = g20.getAttribute("title");
		System.out.println("g20ToolTipText = "+g20ToolTipText);
		//Identyfy the Alternative ToolTip Of G20 imag
		String g20AlternativeToolTipText = g20.getAttribute("alt");
		System.out.println("g20AlternativeToolTipText = "+g20AlternativeToolTipText);
		//minimize the browser
		driver.manage().window().minimize();
		//Terminate all the browsers
		driver.quit();
	}
}
