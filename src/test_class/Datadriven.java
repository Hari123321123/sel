package test_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Datadriven 
{
	
	public static void main(String[] args) throws IOException {
		
	FileInputStream file= new FileInputStream(new File("C:\\Users\\admin\\Desktop\\req.xlsx"));

	XSSFWorkbook Workbook = new XSSFWorkbook(file);
		int countofsheets = Workbook.getNumberOfSheets();
		Workbook.close();
	//	System.out.println(countofsheets);
	XSSFSheet sheet=Workbook.getSheet("Sheet1");
int rowcount =sheet.getLastRowNum();
//System.out.println(rowcount);
int coloumcount=sheet.getRow(0).getLastCellNum();
for (int i=0;i<rowcount;i++)
{
	XSSFRow row=sheet.getRow(i); 
	

	////System.out.println(row);
	for (int j=0;j<coloumcount;j++)
	{
		String value =row.getCell(j).toString();
		System.out.print("  "  +value);
	}
	System.out.println();

}}}
/*for (int i=0;i<countofsheets;i++)
{
	if(Workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) 
	{
	  org.apache.poi.ss.usermodel.Sheet sheet1 = Workbook.getSheetAt(i);
      Iterator<Row> rowsofsheet=sheet.iterator();
      Row firstrow= rowsofsheet.next();
      Iterator<org.apache.poi.ss.usermodel.Cell> cellsofrow = firstrow.cellIterator();
      
		int a=0;
		int column=0;
		
      while(cellsofrow.hasNext())
    		  {
    	          org.apache.poi.ss.usermodel.Cell cellvalue = cellsofrow.next();
    	          String TestCaseName = null;
				if(cellvalue.getStringCellValue().equalsIgnoreCase(TestCaseName))
    	          {
    	        	  column=a;
    	        	  System.out.println("Column Index from where xpath is supposed to be fetched :" +column);
    	          }
    	          
    	          a++;
    		  }
      
      while(rowsofsheet.hasNext())
      {
    	  Row r = rowsofsheet.next();
    	  System.out.println(r.getCell(column).getStringCellValue());
    	  String Testname = null;
		if(r.getCell(column).getStringCellValue().equalsIgnoreCase(Testname))
    	  {
    		  System.out.println("Inside If Loop");
    		  Iterator<org.apache.poi.ss.usermodel.Cell> cv = r.cellIterator();
    		  while(cv.hasNext())
    		  {
    			  String xpath=cv.next().getStringCellValue();
    			  System.out.println(xpath);


	}
	}
	*/
      
		
		
	
