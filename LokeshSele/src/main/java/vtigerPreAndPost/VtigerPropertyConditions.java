package vtigerPreAndPost;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VtigerPropertyConditions {

	public String properties(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/vtiger.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		String value = work.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
