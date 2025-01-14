package utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseTest.BaseClass;

public class ExtentReportManager extends BaseClass implements ITestListener{
	public ExtentSparkReporter sparkReporter;  // UI of the report
	public ExtentReports extent;  //populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods

	public void onStart(ITestContext context) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String repName = "Test-Report-" + timeStamp + ".html";
		sparkReporter = new ExtentSparkReporter(".\\report\\" + repName);// specify location of the report	
		sparkReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
		sparkReporter.config().setReportName("Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);				// Theme of the report 
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Environment","https://be.cognizant.com");
		extent.setSystemInfo("Tester Name","Vishal Kumar(237372)");
		extent.setSystemInfo("os","Windows11");
		extent.setSystemInfo("Browser name","Chrome,Edge");
		
		List<String> includedGroups = context.getCurrentXmlTest().getIncludedGroups();
		if (!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups", includedGroups.toString());
		}
					
	}


	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName()); // create a new entry in the report
		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
		try {
			String s = new ScreenShots(driver).ScreenShot(result.getName());
			test.addScreenCaptureFromPath(s);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
		try {
			String s = new ScreenShots(driver).ScreenShot(result.getName());
			test.addScreenCaptureFromPath(s);
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}

	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
		
	}

	
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
		
}