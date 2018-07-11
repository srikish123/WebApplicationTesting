package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_Youtube 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com");
		 
		driver.navigate().to("http://www.google.com");
		
		driver.close();
	}

}
