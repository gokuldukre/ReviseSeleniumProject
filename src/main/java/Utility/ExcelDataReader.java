package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	public static String getDataFromExcel(String sheetName, int row, int cell) throws Exception {
		String path="C:\\Users\\DELL\\eclipse-workspace\\OctoberSeleniumProject\\ExcelDataFolder\\Data.xlsx";
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		String data=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
