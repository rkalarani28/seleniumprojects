package seleniumProject;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import dataDriven.ReadDynamicDataFromExcel;

public class DataProviderClass {
	
	@DataProvider(name="test")
	public String[][] getData() throws IOException {
		System.out.println("dpc");
		String[][] excelData= ReadDynamicDataFromExcel.getExcelData();
	/*	String[][] data=new String[3][3];
		
		data[0][0]="kala@gmail.com";
		data[0][1]="welcome";
		data[1][0]="krishna@gmail.com";
		data[1][1]="hi";*/
		return excelData;
}
}