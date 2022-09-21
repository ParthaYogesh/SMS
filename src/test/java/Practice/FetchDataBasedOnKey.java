package Practice;

import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.IConstantPath;

public class FetchDataBasedOnKey 
{
public static void main(String[] args) 
{
	ExcelUtility excelUtility=new ExcelUtility();
	excelUtility.initializeExcel(IConstantPath.EXCEL_PATH);
	String FirstName=excelUtility.getDataFromExcelFile("Details", "First Name");
	String LastName=excelUtility.getDataFromExcelFile("Details", "Last Name");
	
//	String FirstName=excelUtility.getDataFromExcelFile("CommonData", "url");
//	String LastName=excelUtility.getDataFromExcelFile("CommonData", "username");
	
	System.out.println(FirstName);
	System.out.println(LastName);
}
}
