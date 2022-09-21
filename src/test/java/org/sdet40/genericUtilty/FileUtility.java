package org.sdet40.genericUtilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	
	Properties property=null;
	public void initializeProperty(String propertyFilePath)
	{
		FileInputStream fis=null;
		
		try
		{
			fis=new FileInputStream(propertyFilePath);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Properties properties=new Properties();
		try
		{
			properties.load(fis);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
	}
public String getDataFormPropertyFile(String Key) 
{
	return property.getProperty(Key).trim();
}
}
