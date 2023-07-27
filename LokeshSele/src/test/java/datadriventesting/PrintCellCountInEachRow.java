package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCellCountInEachRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		List<String> expectedDayList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		List<String> expectedYearList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./src/test/resources/Facebookdata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("DOBtestdata");
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
		for (int i = firstRowIndex; i <= lastRowIndex; i++) {
			int firstCellIndex = (int) sheet.getRow(i).getFirstCellNum();
			int lastcellIncrementalIndex = (int) sheet.getRow(i).getLastCellNum();
			System.out.println(lastcellIncrementalIndex);
			for (int j = firstCellIndex + 1; j < lastcellIncrementalIndex; j++) {
				CellType cellType = sheet.getRow(i).getCell(j).getCellType();
				if (String.valueOf(cellType).equals("STRING")) {
//					System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
					expectedMonthList.add(sheet.getRow(i).getCell(j).getStringCellValue());
				} else if (String.valueOf(cellType).equals("NUMERIC")) {
//					System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());
//					long cellValue = (long)sheet.getRow(i).getCell(j).getNumericCellValue();
//					System.out.println(cellValue);
					if (lastcellIncrementalIndex == 32) {
						expectedDayList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					} else if (lastcellIncrementalIndex == 120) {
						expectedYearList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					}
				}
			}
			workBook.close();
			System.out.println(expectedDayList);
			System.out.println(expectedMonthList);
			System.out.println(expectedYearList);
		}
	}
}
