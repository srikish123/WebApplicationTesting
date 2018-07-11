package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Hellooo");
		
		Actions act = new Actions(driver);
		
		// performing Tab operation with KeyBoard
		act.sendKeys(Keys.TAB).build().perform();
		
		// using action class object(act)  ,we can directly send the data into password element as the focus is currently on Password Element
		
		act.sendKeys("Hiiiiiii").build().perform();
		
		// using action class object(act) performing Enter using Enter keyy on KeyBoard
		
		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}
