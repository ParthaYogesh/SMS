//4
package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel 
{
public static void main(String[] args) throws Exception
{
	
	//Step1 --> Convert physical file into java readable object
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	
	//Open the Excel workBook
	
	Workbook wb=WorkbookFactory.create(fis);
	
	//Get the Control on Sheet
	
	Sheet sheet=wb.getSheet("CommonData");
	
	//Get the Control on Row
	Row row=sheet.getRow(1);
	
	//Get the Control on Cell
	Cell cell=row.getCell(1);
	
	String username=cell.getStringCellValue();
	
	System.out.println(username);
	
	//close the  WorkBook
	
	fis.close();
	
}
}
  