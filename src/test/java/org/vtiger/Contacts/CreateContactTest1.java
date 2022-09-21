package org.vtiger.Contacts;


import org.openqa.selenium.WebDriver;
import org.sddet40.objectRepository.CommonPage;
import org.sddet40.objectRepository.ContactInformationPage;
import org.sddet40.objectRepository.LoginPage;
import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.FileUtility;
import org.sdet40.genericUtilty.IConstantPath;
import org.sdet40.genericUtilty.JavaUtility;
import org.sdet40.genericUtilty.WebDriverUtility;

import Practice.DataType;
public class CreateContactTest1 
{
	
	public static void main(String[] args) 
	{
//Create instance for the Generic Utility
	
	ExcelUtility excelUtility=new ExcelUtility();
	FileUtility fileUtility=new FileUtility();
	JavaUtility javaUtility=new JavaUtility(); 
	WebDriverUtility webDriverUtility=new WebDriverUtility();

	
	//Initialize the Property File and ExcelFile
	
	fileUtility.initializeProperty(IConstantPath.PROPERTY_FILE_PATH);
	excelUtility.initializeExcel(IConstantPath.EXCEL_PATH);
	
	
	//Fetch the Data from the Property file
	
	String browser=fileUtility.getDataFormPropertyFile("browser");
	
	String UserName=fileUtility.getDataFormPropertyFile("username");
	
	String Password=fileUtility.getDataFormPropertyFile("password");
	
	String Url=fileUtility.getDataFormPropertyFile("url");
	
	String timeouts=fileUtility.getDataFormPropertyFile("timeout");

	//Fetch the Data from the Excel file
	String expectedContactLastName=excelUtility.getDataFromExcelFile("Sheet1", 2, 1)+javaUtility.getRandomNumber(1000);
	
	
	//Convert String to Long
	long longTimeout=(long)javaUtility.ConvertToAnyDatatype(timeouts, DataType.LONG);
	
	//Launching the Browser and doing Browser Setting
	WebDriver driver=webDriverUtility.OpenBrowserWithApplication(browser, longTimeout, Url);
	
	
	//Initialize all the Objects in repo class
	LoginPage loginPage=new LoginPage(driver);
	CommonPage commonPage=new CommonPage(driver);
	ContactInformationPage contactInformationPage=new ContactInformationPage(driver);
}
}
