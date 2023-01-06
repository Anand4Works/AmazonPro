package com.amazonPrime.org;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listnersClass implements ITestListener {
	ExtentReports er;
	ExtentTest ts;

	public void onFinish(ITestContext context) {
		er.flush();
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter esr= new ExtentSparkReporter(".\\extentReports\\"+"amazonPrime"+".html");
		esr.config().setDocumentTitle("AmazonPrime Report");
		esr.config().setTheme(Theme.STANDARD);
		esr.config().setReportName("Anand");
		er= new ExtentReports();
		er.attachReporter(esr);
		
		er.setSystemInfo("OS","Windows");
		er.setSystemInfo("Language","Java");
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		String s=result.getName();
		ts.log(Status.FAIL, s+"----->Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		String s=result.getName();
		ts.log(Status.SKIP, s+"----->Skipped");
	}

	public void onTestStart(ITestResult result) {
		String s=result.getName();
		 
		ts= er.createTest(s);
		
	}

	public void onTestSuccess(ITestResult result) {
		String s=result.getName();
		ts.log(Status.PASS,s+"------> Passed");
	}
	
	

}
