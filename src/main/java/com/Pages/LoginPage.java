package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	public void LoginTest()
	{
	driver.findElement(By.xpath("//input[@name='uid']")).clear();
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
