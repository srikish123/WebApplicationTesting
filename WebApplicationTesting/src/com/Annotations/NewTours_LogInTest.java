package com.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{
	
	FirefoxDriver driver;

	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn()
	{
		// <input type="text" size="10" name="userName">
		
				driver.findElement(By.name("userName")).sendKeys("tutorial");
				
				/// <input type="password" size="10" name="password">
				
				driver.findElement(By.name("password")).sendKeys("tutorial");
				
				driver.findElement(By.name("login")).click();
				
				String expected_Title ="Find";
				String actual_Title=driver.getTitle();
				
				if(actual_Title.contains(expected_Title))
					{
					System.out.println("Title matched -- PASS");
					}
				else
				{
					System.out.println("Title not matched - FAIL");
				}
							

				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
