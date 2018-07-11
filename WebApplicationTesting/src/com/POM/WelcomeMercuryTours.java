package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{
	// Object Repository
	
	// identification of elements
	// operation done on Elements -- creating a business logic (Method)
	
	//WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void FindAFlight(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		SignIn.click();
	}
	
	
	
	
	
	
}
