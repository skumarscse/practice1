package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class WriteExcel {
	
	@Test
	public void writeExcel() throws IOException  {

		File loc = new File("D:\\Sathish\\Selenium Materials\\Testsheets.xlsx");
		FileInputStream f = new FileInputStream(loc);
		XSSFWorkbook wb = new XSSFWorkbook(f);
		Sheet sh = wb.getSheet("sheet1");
		int rowIndex = 7;
		int columnIndex = 7;
		Row row = sh.getRow(rowIndex);
		{
			if (row == null) {
				sh.createRow(rowIndex);
			}
			Cell cell = sh.getRow(rowIndex).getCell(columnIndex);
			if (cell == null) {
				sh.getRow(rowIndex).createCell(columnIndex).setCellValue("New Record");
			} else {
				sh.getRow(rowIndex).getCell(columnIndex).setCellValue("New Record");
			}
			FileOutputStream out = new FileOutputStream(loc);
			wb.write(out);
		}
	}

}