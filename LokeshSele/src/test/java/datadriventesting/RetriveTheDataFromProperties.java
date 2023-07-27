package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

public class RetriveTheDataFromProperties {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/ActitimeDrive.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String brwserName = pobj.getProperty("browser");
	System.out.println("brwserName :"+brwserName);
	
}
}
