package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDatFromExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Facebookdata.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		Sheet sheet = work.getSheet("DOBtestdata");
		double cellValue = sheet.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(cellValue);

	}
}
