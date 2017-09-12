package com.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.beust.jcommander.Parameter;

public class BaseClass
{
	public static WebDriver driver;
	
	@Parameter
	@BeforeMethod
	public void setup()
	{
		if(GenericClass.getproperties("BROWSERNAME").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(GenericClass.getproperties("URL"));
		}
		else if(GenericClass.getproperties("BROWSERNAME").equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(GenericClass.getproperties("URL"));
		}
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}