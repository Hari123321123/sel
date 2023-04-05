package request_repository;

import java.io.IOException;

import common_method.extractor;
import common_method.getdata;
import test_class.Datadriven;

public class RequestRepository {

public static String postbody() throws IOException {
	
	String value = extractor.ExcelDataExtractor();
	String postbody=extractor.ExcelDataExtractor();
	
getdata.getDataExcel("post_data","tc_1");
	String job=value;
	System.out.println(job);
	return "{\r\n"
	+ "    \"name\": \"morpheus\",\r\n"
	+ "    \"job\": \""+job+"\""+"\r\n"
	+"}";
}
}
