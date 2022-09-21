package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchPsmsData 
{
	
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TC.xlsx");	
		
		Workbook wb=WorkbookFactory.create(fis);
		
		
		try
		{
		Sheet sheet=wb.getSheet("Sheet1");
		
		//int data=(int)sheet.getRow(0).getCell(0).getNumericCellValue();  ==>Cannot get a NUMERIC value from a STRING cell
		
		String data=sheet.getRow(0).getCell(0).toString();
		
		System.out.println(data);
		}
		finally
		{
		fis.close();	
		}
		
		
}
}
