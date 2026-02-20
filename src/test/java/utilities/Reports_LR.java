package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.Baseclass;

public class Reports_LR implements ITestListener{
	public ExtentSparkReporter report;
	//provides basic info of the document like reportname,doc name,theme of the report
	public ExtentReports extent;
	//providesbasic info of the user (username,hostname,OS browser,envnmt)
	public ExtentTest test;
	//provides basic info about test cases pass/fail or skipped
//pre defined methods(onstart,ontestsuccess,ontestfailure,ontestskipped,onfinish
	
	public void onStart(ITestContext tr) {
		String timeStamp=new SimpleDateFormat("yyyy.MM.DD HH.mm.ss").format(new Date());
		String rename="LivelyRoot"+timeStamp+".html";
		report=new ExtentSparkReporter(rename);
		report=new ExtentSparkReporter("C:\\Users\\admin\\eclipse-workspace\\HybridLivelyRoot\\Extent Reports\\"+rename);
	
		report.config().setDocumentTitle("LivelyRoot");
		report.config().setReportName("LivelyRoot-products");
		report.config().setTheme(Theme.STANDARD);
	
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("username","Swetha");
		extent.setSystemInfo("Hostname","LocalHost");
		extent.setSystemInfo("OS","Windows10");
		extent.setSystemInfo("Browser","chrome");
		extent.setSystemInfo("Environment","QA");
		
	}
		
	public void onTestSuccess(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
			}
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
	String impactlocation=new Baseclass().screenshot(tr.getName());
	test.addScreenCaptureFromPath(impactlocation);

	}
	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.YELLOW));	
	}
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
		
	}

