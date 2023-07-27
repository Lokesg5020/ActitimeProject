package com.Actitime.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
public String getPropertyData(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./data/ActitimeDrive.properties");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscipt.xlsx");
	Workbook work = WorkbookFactory.create(fis);
	String data = work.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
}
