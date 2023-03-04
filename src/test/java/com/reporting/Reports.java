package com.reporting;

import java.io.File;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class Reports {

	public static void generatingReport(String jsonFile) {
		File f = new File("C:\\Users\\vigne\\eclipse-workspace\\CucuAdactin\\CucuPrac\\target");

		net.masterthought.cucumber.Configuration config = new net.masterthought.cucumber.Configuration(f, "Facebook.target");

		config.addClassifications("Browser", "chrome");
		config.addClassifications("version", "103");
		config.addClassifications("sprint", "50");
		
		List<String> list = new ArrayList<String>();
		list.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(list, config);
		
		builder.generateReports();
	}


}
