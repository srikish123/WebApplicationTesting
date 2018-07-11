package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Verification {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http:/google.com");
		
		String expected_Title="google";
		String actual_Title=driver.getTitle();
		
		System.out.println(expected_Title);
		System.out.println(actual_Title);
		
		if(actual_Title.equalsIgnoreCase(expected_Title))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched -- FAIL");
		}

		driver.close();
	}

}
