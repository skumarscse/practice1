package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelReadAll {

	@Test
	public void readExcel() throws IOException {
		File loc = new File("D:\\Sathish\\Selenium Materials\\Testsheets.xlsx");
		FileInputStream in = new FileInputStream(loc);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		Sheet sh = wb.getSheet("sheet1");
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row eachRow = sh.getRow(i);
			for (int j = 0; j < eachRow.getPhysicalNumberOfCells(); j++) {
				Cell data = eachRow.getCell(j);
				if (data.getCellType() == 0) {
					System.out.println(data.getNumericCellValue());
				} else if (data.getCellType() == 1) {
					System.out.println(data.getStringCellValue());
				}

			}
		}
	}
}