package dataDriven;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDynamicDataFromExcel {

	public static String[][] getExcelData() throws IOException {
	//public static String[][] main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("rdd");
		String path="./excel data/excel.xlsx";
		XSSFWorkbook work=new XSSFWorkbook(path);
		XSSFSheet sheet=work.getSheetAt(0);
		int lastRow=sheet.getLastRowNum();
		short lastColm=sheet.getRow(0).getLastCellNum();
		int no=sheet.getPhysicalNumberOfRows();
		
		String[][] data= new String[lastRow][lastColm];
		for (int j = 1; j <=lastRow; j++) {
			XSSFRow row= sheet.getRow(j);
			for (int i = 0; i <lastColm; i++) {
				XSSFCell cell = row.getCell(i);
				//String value = cell.getStringCellValue();
				DataFormatter format=new DataFormatter();
				String val=format.formatCellValue(cell);
				//System.out.println(val);
				data[j-1][i]=val;
			}

		}
	/*	System.out.println("physical"+no);
		System.out.println(lastColm);	
		System.out.println(lastRow);*/
		return data;
		

	}



}
