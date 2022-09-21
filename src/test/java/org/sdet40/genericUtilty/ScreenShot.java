package org.sdet40.genericUtilty;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot 
{
//This Method is use to get the ScreenShot
	
	public void getScreenShot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(IConstantPath.PHOTO_PATH);
		try
		{
			FileUtils.copyFile(src, des);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
