package usageofwebdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCloseAndQuit {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//it will used to close a specific one window in the Session
	//it will used as an intermediate method to close the window
	//it will not close the browser API In the back end.
//	driver.close();
	//post-condition
	//terminate the session completely
	//it will close all the windows in the session irrespective of driver control.
	//it will close the browser API in the back end.
	driver.quit();
}
}
