package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	//to read data from excel sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//provide the path of excel folder
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		//make file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		//get into the sheet....
		Sheet sheet = wb.getSheet("IPL");
		
		//get into desired row
		Row row = sheet.getRow(3);
		
		//get into desired cell/column
		Cell cell = row.getCell(0);
		
		//read the value from cell.....
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		
		

	}

}
