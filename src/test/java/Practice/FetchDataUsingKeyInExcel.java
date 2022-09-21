package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataUsingKeyInExcel
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");	

		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("CommonData");
		
		DataFormatter df=new DataFormatter();
		
		String Value=null;
//		for (int i = 0; i < sheet.getLastRowNum(); i++)
//		{
//			//sheet.getRow(i).getCell(0).getStringCellValue();
//			String Key=df.formatCellValue(sheet.getRow(i).getCell(0));
//			
//			if(Key.equalsIgnoreCase("browser"))
//			{
//				 Value=df.formatCellValue(sheet.getRow(i).getCell(1));
//				break;
//			}
//		}
		int i = 0;
		while( i < sheet.getLastRowNum())
		{
			String Key=df.formatCellValue(sheet.getRow(i).getCell(0));
			
			if(Key.equalsIgnoreCase("password"))
			{
				 Value=df.formatCellValue(sheet.getRow(i).getCell(1));
				break;
			}
			i++;
		}
		System.out.println(Value);
		
	}
}
