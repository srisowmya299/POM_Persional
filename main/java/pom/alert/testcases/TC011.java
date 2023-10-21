package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.W3SchoolAlertPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testcaseDescription="To verify Prompt Alert";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}
	
	@Test
	
public void prompt(){
		
		new W3SchoolAlertPage()
		.switchframe()
		.clickOnTryIt()
		.sendThekeys("Sowmya")
		.gettheAlert()
		.acceptTheAlert()
		.Switchdefault()
		.refreshThepage()
		.switchframe()
		.clickOnTryIt()
	   .dismisstheAlert()
	   .Switchdefault()
	   .clickonHome();
}
}

