package com.cgi.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//no need to do this
public class ZDemo2Excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("src/test/resources/Orangedata.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidLoginTest");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data=new Object[rowCount-1][cellCount];
		
		for(int r=1;r<rowCount;r++)
		{
			for(int c=0;c<cellCount;c++)
			{
				String value= sheet.getRow(r).getCell(c).getStringCellValue();
				data[r-1][c]=value;
			}
		}
		
		
		System.out.println(data);
		
		

	}

}
