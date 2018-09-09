package com.myntra.testframework.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.attribute.standard.RequestingUserName;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderFromExcal {

	File f;
	FileInputStream istream;
	static XSSFWorkbook wbook;

	public DataProviderFromExcal() throws Exception {
		
		f = new File("C:\\Users\\Yogesh\\git\\NewProject\\MyntraProject\\TestData\\data.xlsx");
		istream = new FileInputStream(f);
		wbook = new XSSFWorkbook(istream);
	}

	public static String getData(String exelname, int row, int col) {

		return (wbook.getSheet(exelname).getRow(row).getCell(col).getStringCellValue());

	}

	public static String getData(int sheetindex, int row, int col) {

		return (wbook.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue());

	}

}
