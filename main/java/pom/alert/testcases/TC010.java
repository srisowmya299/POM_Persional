package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.W3SchoolAlertPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testcaseDescription="To verify Simple Alert";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
	
public void Simple() {
		
		
		new W3SchoolAlertPage()
		
		.switchframe()
		.clickOnTryIt()
		.gettheAlert()
		.acceptTheAlert()
		;
		
	}
}
