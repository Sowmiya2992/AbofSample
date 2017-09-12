package com.library;

import java.util.Properties;
import java.io.FileInputStream;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericClass
{
	public static String getproperties(String skey)
	{
		String svalue = null;
		Properties properties = new Properties();
		try
		{
		FileInputStream file = new FileInputStream("D:\\eclipse-workspace\\LearnFramework\\config.properties");
		properties.load(file);
		svalue=properties.getProperty(skey);
		}
		catch(Exception e)
		{
		}		
		return svalue;
	}
	
	public static void selectbyindex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectbyvalue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectbyvisibletext(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
}