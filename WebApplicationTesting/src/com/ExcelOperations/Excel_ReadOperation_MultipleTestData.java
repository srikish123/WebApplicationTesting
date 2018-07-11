package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation_MultipleTestData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\MultipleTestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum(); // identifying Row Count
		
		for(int i=0;i<=RowCount;i++) // Rows
		{
			Row r=sheet.getRow(i);
			int CellCount=r.getLastCellNum();
			
			for(int j=0;j<CellCount;j++) // Cells
			{
				Cell c=r.getCell(j);
				String data=c.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
	}

}
