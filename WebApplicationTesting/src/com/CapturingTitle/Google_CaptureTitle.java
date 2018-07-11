package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_CaptureTitle
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.close();		

	}

}
