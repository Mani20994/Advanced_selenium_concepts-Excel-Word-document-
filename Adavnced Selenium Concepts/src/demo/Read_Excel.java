package demo;

import java.io.File;
import jxl.Workbook;

public class Read_Excel {

	public static void main(String[] args) throws Exception
	{
		File src=new File("C:/Program Files/TestData.xls");
	
		System.out.println("Excel Located");
		
		Workbook wb=Workbook.getWorkbook(src);
		
		System.out.println("Workbook Read");
		
		// for getting first column value 
		String data00=wb.getSheet(0).getCell(0,0).getContents();
		System.out.println("Data is"+data00);
		
		//for getting second column value
		String data01=wb.getSheet(0).getCell(1,0).getContents();
		System.out.println("Data is" +data01);
		
		//for getting second column value
		String data10=wb.getSheet(0).getCell(1,0).getContents();
		System.out.println("Data is" +data10);
		
		String data11=wb.getSheet(0).getCell(1,1).getContents();
		System.out.println("Data is" +data11);
		
		String data02=wb.getSheet(0).getCell(0,2).getContents();
		System.out.println("Data is" +data02);
		
		String data12=wb.getSheet(0).getCell(1,2).getContents();
		System.out.println("Data is" +data12);
		
		
		
		//To get total number of rows 
		int rows=wb.getSheet(0).getRows();
		
		System.out.println("Total number of rows in sheet1 is"+rows);
		
		
	}
	
	
	
	
	
	
	
}
