package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_DragAndDrop {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// class="demo-frame" -- identifying the frame of a WebPage
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Destination=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Destination).build().perform();
		
		driver.close();
		
		

	}

}
