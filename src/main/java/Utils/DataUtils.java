package Utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider(name = "login" /*, indices = {1,2}, parallel = true */)
	public String[][] getData() throws IOException {
		String[][] excelData = ReadExcel.getExcelData();
//		//indices = 0
//		data[0][0] = "abc123@gmail.com";
//		data[0][1] = "Pass1234$";
//		//indices = 1
//		data[1][0] = "abc456@gmail.com";
//		data[1][1] = "Pass5678$";
//		//indices = 2
//		data[2][0] = "xyz@gmail.com";
//		data[2][1] = "xyz5678$";
		//return data;
		return excelData;
	}
}
