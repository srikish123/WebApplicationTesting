package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		
		for(int k=0;k<CountryNames.size();k++)
		{
			String CountryName=CountryNames.get(k).getText();
			System.out.println(CountryName);
			
			
		}

		driver.close();
	}

}
