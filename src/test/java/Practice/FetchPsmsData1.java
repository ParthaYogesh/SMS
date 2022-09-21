package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchPsmsData1 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TC.xlsx");	

		Workbook wb=WorkbookFactory.create(fis);

		try
		{
		Sheet sheet=wb.getSheet("Sheet1");
		Cell cell=sheet.getRow(0).getCell(0);
		
		DataFormatter df=new DataFormatter();
		String data=df.formatCellValue(cell);  // OR String data=df.formatCellValue(csheet.getRow(0).getCell(0));  
		
		System.out.println(cell);
		System.out.println(data);
		}
		finally
		{
		fis.close();	
		}
		
	}
}
