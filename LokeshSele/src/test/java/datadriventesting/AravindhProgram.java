package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AravindhProgram {
	public WebDriver driver;
	@Test
public void testOne() throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/ActitimeDrive.properties") ;
	Properties pobj = new Properties();
	pobj.load(fis); 
	System.out.println(pobj.getProperty("browser"));
	System.out.println(pobj.getProperty("url"));
	System.out.println(pobj.getProperty("username"));
	System.out.println(pobj.getProperty("password"));
	
	
}
}
