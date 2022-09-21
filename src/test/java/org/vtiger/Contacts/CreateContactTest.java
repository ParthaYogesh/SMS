package org.vtiger.Contacts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.FileUtility;
import org.sdet40.genericUtilty.IConstantPath;
import org.sdet40.genericUtilty.JavaUtility;
import org.sdet40.genericUtilty.WebDriverUtility;

import Practice.DataType;

public class CreateContactTest 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	ExcelUtility excelUtility=new ExcelUtility();
	FileUtility fileUtility=new FileUtility();
	JavaUtility javaUtility=new JavaUtility(); 
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	
	fileUtility.initializeProperty(IConstantPath.PROPERTY_FILE_PATH);
	
	String browser=fileUtility.getDataFormPropertyFile("browser");
	
	String UserName=fileUtility.getDataFormPropertyFile("username");
	
	String Password=fileUtility.getDataFormPropertyFile("password");
	
	String Url=fileUtility.getDataFormPropertyFile("url");
	
	String timeouts=fileUtility.getDataFormPropertyFile("timeout");

	
	String expectedContactLastName=excelUtility.getDataFromExcelFile("Sheet1", 2, 1)+javaUtility.getRandomNumber(1000);
	
	long longTimeout=(long)javaUtility.ConvertToAnyDatatype(timeouts, DataType.LONG);
	
	
	WebDriver driver=webDriverUtility.OpenBrowserWithApplication(browser, longTimeout, Url);
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
	
//	driver.findElement(By.xpath("//a[.='Contacts']")).click();
//	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
//	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(expectedContactLastName);
//	
//	
//	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//
//	
//		String actualLastName=driver.findElement(By.xpath("")).getText();
//		
//		if(actualLastName.equals(expectedContactLastName))
//		{
//			System.out.println("Contact Created Successfully---> TC is Pased");
//		}else
//		{
//			System.out.println("Contact Not Created---> TC is Failed");
//		}
}
}
