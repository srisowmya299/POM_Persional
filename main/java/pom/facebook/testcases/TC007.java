package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookHomePage;

import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testcaseDescription="To verify Facebook Registration for the new user sign up";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC007";
	}
	
	
	
	@Test(dataProvider ="fetchData")
	public void facebookSignUp(String firstName, String lastName, String emailId, String password, String date, String month, String year) {
        
		new FacebookHomePage()
		.ClickOnCreateNewAccount()
		.enterFirstName(firstName)
		.enterSurName(lastName)
		.enterMobileNumber(emailId)
		.enterNewPassword(password)
		.selectDate(date)
		.selectMonth(month)
		.selectYear(year)
		.ClickOnFemale()
		.ClickOnSignUp();
		
	}
}
