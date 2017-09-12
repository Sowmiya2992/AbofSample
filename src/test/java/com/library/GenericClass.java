package com.library;

import java.util.Properties;
import java.io.FileInputStream;

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
}