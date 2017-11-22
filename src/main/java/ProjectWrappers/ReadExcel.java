package ProjectWrappers;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel


{
		public Object[][] readExcelData(String filename) throws InvalidFormatException, IOException{
		
		File excelFile=new File("./testdata/"+ filename +".xlsx");
		//open Workbook
		//go to sheet
		//Find the rows in the sheet
		//Iterate the number and move to each row
		//Find the columns in the sheet
		//Iterate the number and move to each row
		//In Excel we have to make the cell as Empty to avoid null point Exception
		
		XSSFWorkbook wbook=new XSSFWorkbook(excelFile);
		XSSFSheet sheet1=wbook.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		int columncount=sheet1.getRow(0).getLastCellNum();
		Object [][] data = new Object[rowcount][columncount];
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet1.getRow(i);
			
			for(int j=0;j<columncount;j++)
			{
				XSSFCell cell=row.getCell(j);
				
				//String data=cell.getStringCellValue();
				
				data[i-1][j] =cell.getStringCellValue();
				
				System.out.println("Row : "+ i + " " + "column :" + j + " " + "value :"+ data);
	}

	}
		return data;

		//close method will save the book while creating the new book
		//wbook.close();
	}
		
		
		//close method will save the book while creating the new book
		//wbook.close();
	}


