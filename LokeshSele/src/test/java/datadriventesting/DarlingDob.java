package datadriventesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DarlingDob {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup/");
		List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
		System.out.println(allDropDowns.size());
		for (WebElement dropDown : allDropDowns) {
			if(dropDown.isDisplayed()) {
				Select dropDownSelect = new Select(dropDown);
				if(dropDown.getAttribute("title").equals("Day")) {
//					dropDownSelect.selectByIndex(22);
//					dropDownSelect.selectByValue("23");
					dropDownSelect.selectByVisibleText("23");
					
				}else if (dropDown.getAttribute("title").equals("Month")) {
//					dropDownSelect.selectByIndex(9);
//					dropDownSelect.selectByValue("10");
					dropDownSelect.selectByVisibleText("Oct");
				}else if(dropDown.getAttribute("title").equals("Year")) {
					dropDownSelect.selectByValue("1979");
//					dropDownSelect.selectByVisibleText("1979");
				}
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
