package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testcaseDescription="To verify BookyourCoach";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
		sheetName="TC002";
	}
	
	@Test (dataProvider ="fetchData")
	
public void BookyourCoach(String userId, String password,String cnfPassword, String secQstn, String secAnswer,  String month, String year,String email, 
 		String occupation,String fname,String mname,String sname, String natinality, String flatNo,String street, String area, String country, 
 		String mobile, String pincode, String city, String state, String postOffice, String flatNoOffice,String countryOffice, String mobileOffice, 
 		String pincodeOffice, String cityOffice, String stateOffice, String postOfficeOffice ) {
		
		
		new HomePage()
		
		
		.mouseHoverOnHolidays()
		//.Waitproperty()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationWindow()
		.clickOnRightMenu()
		.clickOnBookYourCoach()
		.switchToFtrWindow()
		.clickOnNewuser()		
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfirmPassword(cnfPassword)
		.selectSecurityQuestion(secQstn)
		.entersecurityAnswer(secAnswer)
		.clickOnDate()
		.selectyear(year)
		.selectMonth(month)
		.clickOnDatenum()
		//.clickOnMale()
		.clickOnFemale()
		//.clickOnTransgender()
		//.clickOnInstitution()
		.clickOnMarried()
		//.clickOnUnmarried()
		.enterEmail(email)
		.selectOccupation(occupation)
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(sname)
		.selectNationalty(natinality)
		.enterFlatnO(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.selectcountry(country)
		.enterMobile(mobile)
		.enterPincode("523002")
		//.Waitproperty()
		.clickOnState()
		.selectCity(pincode)
		
		.selectState(city)
		.selectPostOffice(postOffice)
		//.clickOnYes()
		.clickOnNo()
		.enterCommunicationFlatNo(flatNoOffice)
		.enterCommunicationStreet(countryOffice)
		.enterCommuncationArea(pincodeOffice)
		.selectCommunicationcountry(pincode)
		.enterMobileNumber(mobileOffice)
		.enterCommunicationPincode(postOfficeOffice)
		;
		
		
		
	}
}
