package common_method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class extractor
{
   public static String ExcelDataExtractor() throws IOException
	{
		String value = null;
		FileInputStream file= new FileInputStream(new File("C:\\Users\\admin\\Desktop\\req.xlsx"));

		XSSFWorkbook Workbook = new XSSFWorkbook(file);
			int countofsheets = Workbook.getNumberOfSheets();
			Workbook.close();
			System.out.println(countofsheets);
		XSSFSheet sheet=Workbook.getSheet("post_data");
	int rowcount =sheet.getLastRowNum();
	System.out.println(rowcount);
	int coloumcount=sheet.getRow(0).getLastCellNum();
	for (int i=1;i<=rowcount;i++)
	{
		XSSFRow row=sheet.getRow(i); 
		for (int j=0;j<coloumcount;j++)
		{
			value =row.getCell(j).toString();
			System.out.print("  "  +value);
		
			//return value;
		
		}
		System.out.println();
		
	}
	
	//System.out.println(value);
	return value;
	
}
		
}
	
