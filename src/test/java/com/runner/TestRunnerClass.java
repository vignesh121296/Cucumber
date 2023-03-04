package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FacebookLogin.feature" ,glue = "com.stepdefinition",monochrome = true ,dryRun = false  ,
       plugin = {"pretty","json:target\\output.json" } , stepNotifications = true ,publish = true ,snippets = SnippetType.UNDERSCORE     )

public class TestRunnerClass extends Reports {
	
	@AfterClass
	public static void reports() {

		Reports.generatingReport("C:\\Users\\vigne\\eclipse-workspace\\CucuAdactin\\CucuPrac\\target\\output.json");
		
		
	}

}
