package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("gb_70")).click();
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
