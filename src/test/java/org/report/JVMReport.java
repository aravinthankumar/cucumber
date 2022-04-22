package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String json) {
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\JVMReport");
		
		Configuration con = new Configuration(loc, "Gmail Create Account");
		
		List<String> jsonFiles = new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports();

	}

}
