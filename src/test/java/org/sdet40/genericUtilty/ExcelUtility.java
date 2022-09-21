package org.sdet40.genericUtilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook workbook;
	/*
	 * This class consist of all common Action on excel
	 */
	public void initializeExcel(String ExcelPath)// String SheetName, int rowNumber, int cellNumber) throws
													// EncryptedDocumentException, IOException
	{
		FileInputStream fisExcel = null;

		try {
			fisExcel = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook = WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * this method consist of code to fetch data from the excel workbook based on index
	 * @param excelPath
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 */
	public String getDataFromExcelFile(String SheetName, int rowNumber, int cellNumber) {
		Sheet sheet = workbook.getSheet(SheetName);

		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		return data;
	}
	/*
	 * this method is used to  fetch data from the excel workbook based on key
	 * @param sheetName
	 * @param required key
	 * @return
	 */
	public String getDataFromExcelFile(String SheetName, String RequiredKey) {
		Sheet sheet = workbook.getSheet(SheetName);

		String value = null;
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			String ActualKey = sheet.getRow(i).getCell(0).getStringCellValue();

			if (ActualKey.equalsIgnoreCase(RequiredKey)) {
				value = sheet.getRow(i).getCell(1).getStringCellValue();
				break;
			}
		}

		return value;
	}
	  /*
			 * this method is used to  fetch data from the excel workbook and stored in map
			 * @param sheetName
			 * @return
			 */
	public Map<String, String> getDataFromExcelInMap(String SheetName) {
		Sheet Sheet = workbook.getSheet(SheetName);
		Map<String, String> map = new HashMap();

		DataFormatter df = new DataFormatter();

		for (int i = 0; i <= Sheet.getLastRowNum(); i++) {
			map.put(df.formatCellValue(Sheet.getRow(i).getCell(0)), df.formatCellValue(Sheet.getRow(i).getCell(1)));
		}
		return map;
	}

	 //----Grade TC01
	  public Map<String, String> getDataFromExcelInMapGrade(String sheetName) {

		Sheet sheet = workbook.getSheet(sheetName);
		Map<String, String> map = new HashMap<>();
		DataFormatter df = new DataFormatter();
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(2)), df.formatCellValue(sheet.getRow(i).getCell(3)));
		}
		return map;
	  }
	  
	  /*
		 * this method is used to  fetch data from the excel workbook and stored in List<map>
		 * @param sheetName
		 * @return
		 */
	public List<Map<String, String>> getDataFromExcelInList(String SheetName) {
		Sheet Sheet = workbook.getSheet(SheetName);
		List<Map<String, String>> list = new ArrayList();

		DataFormatter df = new DataFormatter();

		for (int i = 0; i < Sheet.getRow(0).getLastCellNum(); i++) {
			Map<String, String> map = new HashMap();

			for (int j = 0; j <= Sheet.getLastRowNum(); j++) {
				map.put(df.formatCellValue(Sheet.getRow(j).getCell(0)), df.formatCellValue(Sheet.getRow(j).getCell(i)));
			}

			list.add(map);
		}

		return list;
	}
	/*
	 * This method is used to write data to excel
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param value
	 */
	public void writeToExcel(String sheetName, int rowNumber, int cellNumber, String value) 
	{
		FileOutputStream fosExcel=null;
		try {
			fosExcel=new FileOutputStream(IConstantPath.EXCEL_PATH);
		} catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		Sheet sheet=workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.createCell(cellNumber);
		cell.setCellValue(value);
		
		try {
			workbook.write(fosExcel);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String[][] getMultipleData(String SheetName)
	{
		Sheet Sheet = workbook.getSheet(SheetName);
		DataFormatter df = new DataFormatter();
		String [][] arr=new String[Sheet.getLastRowNum()][Sheet.getRow(0).getLastCellNum()];

		for (int i = 1; i <= Sheet.getLastRowNum(); i++) 
		{
			for (int j = 0; j < Sheet.getRow(0).getLastCellNum(); j++) 
			{
				arr[i-1][j]=df.formatCellValue(Sheet.getRow(i).getCell(j));
			}
		}
		return arr;
	}
	/*
	 * This method is used to close the workbook
	 */
	public void closExcelWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
