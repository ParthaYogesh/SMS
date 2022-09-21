package Practice;

import java.util.Map;

import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.IConstantPath;

public class FetchDataFromExcelThrougMap 
{
	public static void main(String[] args) 
	{
		ExcelUtility excelUtility=new ExcelUtility();
		excelUtility.initializeExcel(IConstantPath.EXCEL_PATH);
		
		Map <String , String> map = excelUtility.getDataFromExcelInMap("Details");
		
		System.out.println(map);
		
		
	}
}
