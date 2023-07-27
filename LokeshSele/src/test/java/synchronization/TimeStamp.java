package synchronization;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeStamp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
				/*
				 * //capture the local date and time of the machine LocalDateTime local =
				 * LocalDateTime.now(); System.out.println(local); //convert it into string
				 * String timeString = local.toString(); System.out.println(timeString); String
				 * updatedString = timeString.replace(':', '-');
				 * System.out.println(updatedString);
				 */
				String timeStamp = LocalDateTime.now().toString().replace(':', '-');
				System.out.println(timeStamp);
				driver.manage().window().minimize();
				driver.quit();
				
			}

}
