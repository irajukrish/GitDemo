package com.mypages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
		
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
        
		
	}

	

}
