package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_Testing {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		// header Block
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		// Header Block elements
		List<WebElement>HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		
		for(int i=0;i<HeaderLinks.size();i++)
		{
			String HeaderLinkName=HeaderLinks.get(i).getText();
			System.out.println(i+"  "+HeaderLinkName);
			
			HeaderLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
			HeaderBlock=driver.findElement(By.className("menu-wrap"));
			HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		}
		
		driver.close();
		
		
		
		

	}

}
