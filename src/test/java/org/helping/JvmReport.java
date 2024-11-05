package org.helping;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class JvmReport {

	public static  void generateJvmReport(String jsonPath) {

		//1.Mention the target folder location - File
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\JVM Report");
		
		//.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "FaceBook Application");
		c.addClassifications("employee name ", "Asik");
		c.addClassifications("Employee Id ", "2345");
		
	     
		//3..Add json file paths into List<String>
		List<String> l = new ArrayList();
		l.add(jsonPath);
		
		//4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}
	
	
	
	
	
	
	
	
}
