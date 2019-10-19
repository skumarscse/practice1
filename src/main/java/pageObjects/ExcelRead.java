package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelRead {
	@Test
	public void readExcel() throws IOException {
		File loc = new File("D:\\Sathish\\Selenium Materials\\Testsheets.xlsx");
					FileInputStream in = new FileInputStream(loc);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		Sheet sh = wb.getSheet("sheet1");
		Cell data = sh.getRow(2).getCell(1);
		if(data.getCellType()==0) {
			System.out.println(data.getNumericCellValue());
		}
		else if(data.getCellType()==1){
			System.out.println(data.getStringCellValue());
		}
		
	}

}
