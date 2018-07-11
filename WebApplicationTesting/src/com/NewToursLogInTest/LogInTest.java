package com.NewToursLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args)
	{
		// Automate Browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// Maximize the Browser
		
		driver.manage().window().maximize();
		
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		/// <input type="password" size="10" name="password">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());		
		driver.close();
		
		

	}

}
