package com.FacebookLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String homePage_Title=driver.getTitle();
		System.out.println(homePage_Title);
		
		
		// 		<input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		
		driver.findElement(By.id("email")).sendKeys("lsrikishan@ymail.com");
		
		// <input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">
		
		driver.findElement(By.id("pass")).sendKeys("Hellooo");
		
		// <label id="loginbutton" class="uiButton uiButtonConfirm" for="u_0_y">
		
		driver.findElement(By.id("loginbutton")).click();
		
		String AfterLogIn=driver.getTitle();
		System.out.println(AfterLogIn);
		
		driver.close();
		

	}

}
