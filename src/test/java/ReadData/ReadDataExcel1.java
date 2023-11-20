package ReadData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//to read the data from external resources
	FileInputStream fis=new FileInputStream("src\\test\\resources\\sp4616.xlsx");
	
	//to read the data from excel
	Workbook wb = WorkbookFactory.create(fis);
	
	
	//to get control of the sheet
	Sheet sh = wb.getSheet("Sheet1");
	
	//to get control of row
	
	Row rw = sh.getRow(1);
	
	
	//to get the control of coloum
	Cell cl = rw.getCell(1);
	
	//to get the value of the cell
	 String data = cl.getStringCellValue();	
	
	System.out.println(data);
	 
    
}
}
