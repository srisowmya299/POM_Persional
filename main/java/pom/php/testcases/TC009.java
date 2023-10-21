package pom.php.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.PHPRegistrationPage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testcaseDescription="To verify PHP Page";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
		sheetName="TC009";
	}
	
	@Test(dataProvider ="fetchData")
	
public void php(String inputFirstName, String inputLastName, String inputEmail, String inputPhone, 
		String inputCompanyName, String inputAddress1, String inputAddress2, String inputCity,String stateinput,
		String inputPostcode,String inputCountry,String customfield2,String inputNewPassword1,String inputNewPassword2) {
		
		new PHPRegistrationPage()
		
		.enterFirstName(inputFirstName)
		.enterLastName(inputLastName)
		.enterEmailAddress(inputEmail)
		.clickOnCountryCode()
		.enterCompanyname(inputCompanyName)
		.enterStreetAddress(inputAddress1)
		.enterStreetAddress2(inputAddress2)
		.enterCity(inputCity)
		.enterState(stateinput)
		.enterPostCode(inputPostcode)
		.enterMobile(inputPhone)
		.selectCountry(inputCountry)
		.enterPassword(inputNewPassword1)
		.enterConfirmPassword(inputNewPassword2);
		
	}
}
