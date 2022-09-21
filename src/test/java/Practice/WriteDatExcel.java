package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatExcel 
{
public static void main(String[] args) throws Exception
{
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");	

	Workbook wb=WorkbookFactory.create(fis);
	
	Sheet sheet=wb.getSheet("CommonData");
	
//	Row row=sheet.createRow(5);
//	
//	Cell cell=row.createCell(5);
//	
//	cell.setCellValue("AB");
//	
//	wb.write(new FileOutputStream("./src/test/resources/TestData.xlsx"));
//	
//	System.out.println("Data Updated Successfully");
	
	Row row=sheet.getRow(0);
	
	Cell cell=row.getCell(1);
	
	String un=cell.getStringCellValue();
	
	
	
	System.out.println(un);
	
	wb.close();
}
}
