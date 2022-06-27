package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class paramatraisation {
    public static String getData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
    	FileInputStream file=new FileInputStream("E:\\AUTOMATION\\KiteZerodha\\src\\test\\resources\\sheet.xlsx");
    	String value = WorkbookFactory.create(file).getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
    	return value;
    }
	

	
	
	
	
	
	
}
