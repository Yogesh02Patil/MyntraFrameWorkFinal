package com.myntra.testframework.factory;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportFactory {
	
	
	static ExtentReports report;
	static ExtentTest logger;
	
	
	public static ExtentTest getReport(String path,String testname) 
	{
		
	   report=new ExtentReports(path,false);
	   logger=report.startTest(testname);
	   return logger;
	   
	}
	
   
	public static void closeReport(ExtentTest logger)
	{
		
		report.endTest(logger);
		report.flush();
	}

	
}
