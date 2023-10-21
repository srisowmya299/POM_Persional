package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testcaseDescription="To verify IRCTC Charter";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
		sheetName="TC003";
	}
	
	@Test (dataProvider ="fetchData")
	
public void  sallonCheck(String name, String organization, String address,String mobile, String email,String requestFor,
		String originStation,String destnStation, String durationPeriod, String coachDetails, String numPassenger,
		String charterPurpose, String services, String verify, String year, String byear, String NoOfDays, String NoOfCoaches, String NoOfPassengers,String PurposeOfCharter) {
		
		new HomePage()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationWindow()
		.clickOnRightMenu()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterNameOfApplicant(name)
		.enterNameOfOrganization(organization)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.selectRequestFor(requestFor)
		.enterOriginatingStation(originStation)
		.enterDestinationStaton(destnStation)
		.enterCharterPurpose(charterPurpose)
		.clickOnDate()
		.clickOnMonth()
		.selectYear(year)
		.clickOnSpecificDate()
		.clickOnArrivalBackDate()
		.clickOnArrivalBackMonth()
		.selectArrvalBackYear(byear)
		.clickOnSpecificArrivalBackDate()
		.enterNoOfDays(NoOfDays)
		.enterNoOfCoaches(NoOfCoaches)
		.enterNoOfPassengers(NoOfPassengers)
		.enterPurposeOfCharter(PurposeOfCharter)
		.enterAdditionalService(verify)
		.clickOnSubmit()
		;
		
		
	}
}
