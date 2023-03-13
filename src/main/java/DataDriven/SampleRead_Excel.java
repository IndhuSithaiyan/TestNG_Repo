package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleRead_Excel {

	public static void main(String[] args) throws IOException {

		//1.Passing the File location
		File f = new File("./externalfiles-Excel/Excelwork.xlsx");

		//2.Read/Write a file
		FileInputStream fin = new FileInputStream(f);

		//3.Get Complete Excelsheet
		//Excel ------- Sheet -------- Row ------- cell
		Workbook book = new XSSFWorkbook(fin);

		//4.Fetch a sheet
		Sheet sh = book.getSheet("Login");

		//		//5.Fetch a row
		//		Row r = sh.getRow(1);
		//
		//		//6.Fetch a cell
		//		Cell c = r.getCell(3);
		//
		//		System.out.println(c);

		//To find no of rows
		int numberOfRows = sh.getPhysicalNumberOfRows();   // size() - using in list
		System.out.println("No of rows: "+numberOfRows);

		for (int i = 0; i < numberOfRows; i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
			
				//To fetch cell type ---- getcellType() return type: int
				int cellType = c.getCellType();
				
				// type==1 -----> String || type==0 -----> numb/date
				if (cellType==1) {
					String name = c.getStringCellValue();
					System.out.println(name);
				}
				
				else if(DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					System.out.println(dateCellValue);
					
					//Date --------> String
					SimpleDateFormat sim = new SimpleDateFormat("dd MMM, yyyy");  //21 Feb 2022
					String formatDatevalue = sim.format(dateCellValue);
					System.out.println(formatDatevalue);	
				}
				
				else {
					double numericCellValue = c.getNumericCellValue();
					System.out.println(numericCellValue);
					
					//doble --------- long ----------- string
					//Downcasting -------- convert doble to long
					long lo = (long)numericCellValue;
					System.out.println(lo);
					
					//long ------- String
					String name = String.valueOf(lo);
					System.out.println(name);
				}
			}
		}
	}
}