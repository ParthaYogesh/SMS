package Practice;

import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.FileUtility;
import org.sdet40.genericUtilty.IConstantPath;
import org.sdet40.genericUtilty.JavaUtility;

public class TestingGenericUtility 
{
public static void main(String[] args) throws Exception  
{
	int randomNumber=new JavaUtility().getRandomNumber(1000);
	
	
	String data=new ExcelUtility().getDatafromExcel(IConstantPath.EXCEL_PATH, "Contacts", 2, 1)+randomNumber;
	System.out.println(data);
	
	String browser=new FileUtility().getDataFormPropertyFile(IConstantPath.PROPERTY_FILE_PATH, "browser");
	System.out.println(browser);
}
}

