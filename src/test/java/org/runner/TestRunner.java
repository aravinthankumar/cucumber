package org.runner;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
                 glue="org.base_create_gmail_account",dryRun=false,
                //tags= {"@step1 or @step2 or @step3"},
                 monochrome=true,
                 
                 snippets=SnippetType.UNDERSCORE,
                 plugin= {"pretty",
                		 "json:src\\test\\resources\\reports\\jsonreport.json",
                		 "rerun:src\\test\\resources\\failed.txt"
                		 
                 }
                 
                 
		)

public class TestRunner extends BaseClass {
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("src\\test\\resources\\reports\\jsonreport.json");
		System.out.println("__________________________JVMReport____________________");
		
		quit();
	}
	
	

}
