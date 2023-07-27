package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromExcel {
	public static void main(String[] args) throws Throwable {
		//Create the FileInputStream object of java with the absolute path of address
		FileInputStream fis = new FileInputStream("./src/test/resources/Facebookdata.xlsx");
		//Call Create() from WorkBookFactory class of POI library. 
		Workbook work = WorkbookFactory.create(fis);
		work.getSheet("DOBtestdata");
	}
}
