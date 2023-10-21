package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	public void generateReport() {
		// TODO Auto-generated method stub
		
		// start report
		ExtentReports report = new ExtentReports("./Reports/Result.html", false);
		
		
		// start test
		ExtentTest test = report.startTest("TC005", "To verify IRCTC REgistration for the new user Sign up");
		
		test.assignAuthor("Sowmya");
		
		test.assignCategory("Regression");
		
		// log test steps
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		test.log(LogStatus.PASS	,"The browser got laucnhed with the given url succesfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
		

	}

}
