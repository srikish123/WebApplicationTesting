package com.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment1 {

	public static void main(String[] args) throws Throwable 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement> CountryNames=Country.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		
		FileInputStream file= new FileInputStream("C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\assignment.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		for(int k=0;k<CountryNames.size();k++)
		{
			String CountryName=CountryNames.get(k).getText();
			System.out.println(CountryName);	

			Row r=sheet.createRow(k);
			Cell c=r.createCell(0);
			
			c.setCellValue(CountryName);
			FileOutputStream file1= new FileOutputStream("C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\assignment.xlsx");
			
		}
		
		
				
				
				
				
				
		

		driver.close();
	}	

	}


