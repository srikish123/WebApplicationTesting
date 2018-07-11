package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowser_Automation {

	public static void main(String[] args)
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.close();*/
		
	/*	System.setProperty("webdriver.edge.driver", "C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\DriverFiles\\MicrosoftWebDriver (1).exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://yahoo.com");*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\DriverFiles\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srikishan Tatikonda\\Desktop\\SriKishanSelenium\\WebApplicationTesting\\DriverFiles\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		

	}

}
