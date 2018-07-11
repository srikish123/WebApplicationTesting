package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	
	@BeforeMethod
	public void LaunchAndLogIn()
	{
		System.out.println("Browser launch and Login");
	}
	
	@Test(priority=0)
	public void InBox()
	{
		System.out.println("Testing InBox Funcationality");
	}
	
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("testing Compose Mail Funcationality");
	}
	
	@Test(enabled=false)
	public void SentMail()
	{
		System.out.println("Testing SentMail Funcationality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Close the Application");
	}
	
	
}
