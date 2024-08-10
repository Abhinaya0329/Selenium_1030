package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	@Test
	public void createReport() {
		//step 1- create object for extentSpartReporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReport.html");
		
		//step 2- create object for extentReports
		ExtentReports extReport = new ExtentReports();
		
		//step 3-Attach ExtentSparkReport to ExtentReports
		extReport.attachReporter(spark);
		
		//step 4-create ExtentTest object
		ExtentTest test = extReport.createTest("createReport");
		
		//step 5- call log() and provide status and message 
		test.log(Status.PASS, "SUCCESSFULLY CREATED EXTENT REPORTS");
		
		//step 6- call flush()
		extReport.flush();
		}

}
