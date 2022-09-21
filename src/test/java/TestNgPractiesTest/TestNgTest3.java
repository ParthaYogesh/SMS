package TestNgPractiesTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.IConstantPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgTest3 
{
	@Test(dataProvider = "getData")						//(dataProvider = "Data")	
	public void step2Test(String city, int pincode)
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println("City : "+city);
		System.out.println("Pin Code : "+pincode);
		System.out.println();
	}
	
//	@DataProvider(parallel = true)										//(name = "Data")
//	public Object[][] getData()
//	{
//	Object [][] ob=new Object[2][2];	
//	ob [0][0]="Banglore";
//	ob [0][1]=540043;
//	
//	ob [1][0]="Mysore";
//	ob [1][1]=571602;
//	
//	return ob;
//	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
	ExcelUtility excelUtility=new ExcelUtility();
	excelUtility.initializeExcel(IConstantPath.EXCEL_PATH);
	
	String [] [] obj=excelUtility.getMultipleData("DetailsOFCity");
	
	return obj;
	}
}
