package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
public static void main(String[] args) throws IOException {
			String path="./excel data/excel.xlsx";
			XSSFWorkbook work=new XSSFWorkbook(path);
			XSSFSheet sheet=work.getSheetAt(0);
			for (int j = 0; j < 2; j++) {
			XSSFRow row=sheet.getRow(j);
			for (int i = 0; i < 2; i++) {
				XSSFCell colm = row.getCell(i);
				 
				System.out.println(colm.getStringCellValue());
			}
			
		}
			work.close();

	}
}

