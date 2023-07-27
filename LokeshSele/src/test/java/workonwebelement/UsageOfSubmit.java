package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
	public static void main(String[] args) throws Throwable {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Maximize the bowser window
		driver.manage().window().maximize();
		//Enter the Main URL of the application. 
		driver.get("http://demo.vtiger.com/vtigercrm/");
		//submit() wont leave the control until the page get loaded.
		//click() just click the element and it leaves the control.
		/* submit() method only work for
		 * If the Element is made with <button> OR <input>.
		 * Only If the Element is ancestor of <form>.
		 * Only the Element type = "submit".
		 */
		//If any one of these conditions is not there then it will throw 
		//UnsupportedOperationEception - java -run time - UncheckedException
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).submit();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
