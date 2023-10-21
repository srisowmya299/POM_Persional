package utils;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public static ExtentReports report ;
	
	public static ExtentTest test;
	
	public String testCaseName, testcaseDescription;
	
	public String author, category;
	
	public void startReport() {
		
		 report = new ExtentReports("./reports/Result_latest.html", false);
		
	}
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 * @throws IOException 
	 */
	public abstract long takeSnap();
	
	
	public void startTest(String testName, String description) {
		
		test = report.startTest(testName, description);
		
		test.assignAuthor(author);
		test.assignCategory(category);
		
	}
	
	public void reportStep(String description, String status, boolean bSnap) {
		
		if(!bSnap) {
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, description);
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, description);
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description);
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, description);
		}
		
		}
	}
	
	
	public void reportStep(String description, String status) {
	
		long snapNumber = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, description +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png")   );
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, description +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png") );
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png") );
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, description  +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png") );
		}
		
	}
	
	
	public void endTest() {
		report.endTest(test);
	}
	

	public void endReport() {
		report.flush();
	}
}
