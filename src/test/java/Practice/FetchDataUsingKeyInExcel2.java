package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataUsingKeyInExcel2
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");	

		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("CommonData");
		
		DataFormatter df=new DataFormatter();
		
		String [] [] a=new String[sheet.getLastRowNum()][sheet.getRow(3).getLastCellNum()];
		
		for (int i = 0; i <sheet.getLastRowNum(); i++)
		{
			for (int j = 0; j < sheet.getRow(3).getLastCellNum(); j++) 
			{ 
				a[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		
		
		for (int i = 0; i < sheet.getLastRowNum(); i++)
		{
			for (int j = 0; j < sheet.getRow(3).getLastCellNum(); j++) 
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

		
	}
}


