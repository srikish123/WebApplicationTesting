package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.jna.Platform;

public class NewTours_LogInTest
{

	@Parameters("Browser")
	
	@Test
	public void LogIn(String b) throws MalformedURLException
	{
		// Nodes
		System.out.println(b);
		
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		}
		else
			if(b.equals("chrome"))
				
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.17:4444/wd/hub"),cap);
		
		driver.get("http://newtours.demoaut.com");
		
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
				
		driver.close();
		
		
		
	}
	
	
	
}
