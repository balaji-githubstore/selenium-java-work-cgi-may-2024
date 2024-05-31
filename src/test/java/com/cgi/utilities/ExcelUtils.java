package com.cgi.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static Object[][] getSheetIntoTwoDimensionalArray(String filePath,String sheetname) throws IOException {
		
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetname);

		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][cellCount];

		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < cellCount; c++) {
				String value = sheet.getRow(r).getCell(c).getStringCellValue();
				data[r - 1][c] = value;
			}
		}
		book.close();
		file.close();
		
		return data;
	}

}
