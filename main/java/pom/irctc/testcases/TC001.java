package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testcaseDescription="To verify IRCTC signup";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
		sheetName="TC001";
	}
	
	@Test (dataProvider ="fetchData")
	
	public void irctcRegistration(String username,String password, String ConformPassword,String secanswer, String firstName, String middlename, String lastName, String month, String year, 
			 String country, String email, String mobile, String mobilecountry, String address, String readdress, String resaddress, String pincode, String state, String distic, String Postal, String resphone,
			 String offAddress, String ofAddress, String offPinCode, String offState, String offCity, String offPostOff, String offPhone) {

			
			new HomePage()
			
			.clickOnRegister()
			.enterUserName(username)
			.enterPassword(password)
			.enterConfirmPassword(ConformPassword)
			.clickPreferedLanguage()
			.selectLanguage()
			.clickOnSecurityQuestion()
			.selectSecurityQuestion()
			.enterSecurityAnswer(secanswer)
			.clickOnContinue()
			.enterFirstName(firstName)
			.enterSecondName(middlename)
			.enterLastName(lastName)
			.clickOnOccupation()
			.selectOccupation()
			.clickOnDateOfBirth()
			.selectMonth(month)
			.selectYear(year)
			.clickOnDate()
			.clickOnMarried()
			.clickOnUnmarried()
			.selectNation(country)
			.clickOnMale()
			.clickOnFemale()
			.clickOnTransgender()
			.enterEmailId(email)
			.enterMobileNumber(mobile)
			.selectNationality(mobilecountry)
			.clickOnContinue2()
			.enterFlatDoorNo(address)
			.enterStreet(readdress)
			.enterArea(resaddress)
			.enterPincode(pincode)
			.Waitproperty()
			.clickOnState()
			.Waitproperty()
			.enterState(state)
			.Waitproperty()
			.clickOnCity()
			.selectCity(distic)
			.Waitproperty()
			.selectPostoffice(Postal)
			.Waitproperty()
			.enterPhone(resphone)
			.clickOnNo()
			.clickOnYes()
			.clickOnTermsandConditions()
			.clickOnRegister()
			;
				
			
			
		}
}
