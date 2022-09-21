package Practice;

import java.util.List;
import java.util.Map;

import org.sdet40.genericUtilty.ExcelUtility;
import org.sdet40.genericUtilty.IConstantPath;

public class FetchDatFromExcelThroughList 
{
public static void main(String[] args) 
{
	ExcelUtility excelUtility=new ExcelUtility();
	excelUtility.initializeExcel(IConstantPath.EXCEL_PATH);
	
	List<Map<String, String>> list=excelUtility.getDataFromExcelInList("Details");
	System.out.println(list.get(1).get("First Name"));
}
}
