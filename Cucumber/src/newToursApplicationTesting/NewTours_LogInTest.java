package newToursApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTours_LogInTest 
{

	FirefoxDriver driver;
	
	@Given("^Open fireFox browser and navigate to newtours application$")
	public void Open_fireFox_browser_and_navigate_to_newtours_application()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^User enters Valid UserName and Password and click on SigIn button$")
	public void User_enters_Valid_UserName_and_Password_and_click_on_SigIn_button() 
	{
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		/// <input type="password" size="10" name="password">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		
	}

	@Then("^User should be able to successfully login to application and close the application$")
	public void User_should_be_able_to_successfully_login_to_application_and_close_the_application()
	{
	
		String expected_Title ="Find";
		String actual_Title=driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
			{
			System.out.println("Title matched -- PASS");
			}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
		
		driver.close();
	}
	
	
	
}
