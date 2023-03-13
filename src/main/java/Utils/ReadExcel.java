/*
Read data from Excel
1. Apache POI
2. Apache POI - OOXML
Pre-condition
1. Create an excel file with data
Steps to impliment
1. Locate the data
2. Locate the work book
3. Read the data from the cell(Rows & Column)
4. Close the resource
*/

package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] getExcelData() throws IOException {
		String fileLocation = "./test-data/Login-data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lasRowNum = sheet.getLastRowNum();
		System.out.println("No. of Rows: "+lasRowNum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();		//getRow(0) - headerRow
		System.out.println("No. of cells: "+lastCellNum);
		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println("Inclusive of header: "+physicalNumberOfRows);
//		int physicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
//		System.out.println("Inclusive of cells: "+physicalNumberOfCells);
		
		String[][] data = new String[lasRowNum][lastCellNum];
		for (int i = 1; i <= lasRowNum ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();	//To use for convert to string from any dataTypes
				String value = dft.formatCellValue(cell);
//				String value = cell.getStringCellValue();
//				System.out.println(value);
				data[i-1][j] = value;
			} 
		}
//		wbook.close();
		return data;
	}
}
