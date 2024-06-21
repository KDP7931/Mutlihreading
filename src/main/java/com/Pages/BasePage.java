package com.Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Kp.qa.config.AutoConstant;
import com.Kp.qa.config.PropertyFileData;

public class BasePage implements AutoConstant {
	static PropertyFileData pf;
	WebDriver driver;
	
	public WebDriver setUp(String browserName) throws IOException
	{
		pf = new PropertyFileData();
	String chrome_key = pf.GetPropertyString("ChromeDriverKey");
	String chrome_value = pf.GetPropertyString("ChromeDriverPath");
	String firefox_key = pf.GetPropertyString("FirefoxDriverKey");
	String firefox_value = pf.GetPropertyString("FirefoxDriverPath");
	String url = pf.GetPropertyString("url");
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(chrome_key, chrome_value);
			driver= new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(firefox_key, firefox_value);
			driver= new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
	}

}
}
