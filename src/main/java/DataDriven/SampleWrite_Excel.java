package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleWrite_Excel {

	public static void main(String[] args) throws IOException {
		
		File f = new File("./externalfiles-Excel/Data.xlsx");
		
       /****To write an new excel sheet****/
//		//Getting complete workbook
//		Workbook book = new XSSFWorkbook();
//		
//		//create a sheet
//		Sheet sh = book.createSheet("Login");
//		
//		//create a Row
//		Row r = sh.createRow(0);
//		
//		//Create a cell
//		Cell c1 = r.createCell(0);
//		Cell c2 = r.createCell(1);
//		
//		//write in a cell
//		c1.setCellValue("UserName");
//		c2.setCellValue("Password");
//		
//		FileOutputStream fo = new FileOutputStream(f);
//		
//		book.write(fo);
//		
//		System.out.println("written");		
		
		
		/***To write an existing excel sheet***/
//		FileInputStream fin = new FileInputStream(f);
//		
//		Workbook book = new XSSFWorkbook(fin);
//		
//		Sheet sh = book.getSheet("Login");
//		
//		Row r = sh.createRow(1);
//		
//		Cell c1 = r.createCell(0);
//		Cell c2 = r.createCell(1);
//		
//		c1.setCellValue("Greens@gmail.com");
//		c2.setCellValue("adsf1234@");
//		
//		FileOutputStream fo = new FileOutputStream(f);
//		
//		book.write(fo);
//		
//		System.out.println("---------");
//				
//		book.close();		
		
		/***To update the values from the excel sheet***/
		FileInputStream fin = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fin);
		
		Sheet sh = book.getSheet("Login");
		
		Row r = sh.getRow(0);
		
		Cell c = r.getCell(0);
		
		String s = c.getStringCellValue();
		
		if(s.startsWith("User")) {
			c.setCellValue("Email");
		}
		else {
			c.setCellValue("PhoneNO");
		}
		
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);	
	}
}

