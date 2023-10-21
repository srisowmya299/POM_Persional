package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testcaseDescription="To verify GST validation";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
		sheetName="TC005";
	}
	
	@Test(dataProvider ="fetchData")
	
	public void GSTValidation(String Destination ,String Rooms,String Adults,String hotelAdult,String email, String mobileNo,String title,String firstName, String lastName, String country, String state,String gst, String gstNumber,String companyName, String companyAddress) {
		
		
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationWindow()
		 .clickOnHotel()
		 .switchToHotelWindow()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmailId(email)
		.enterMobleNumber(mobileNo)
		.clickOnuestLogin()
		.switchToHotelWindow()
		 .Waitproperty()
		 .Waitproperty()
		.enterDestination(Destination)
		.Waitproperty()
		.ClickOnCity()
		.ClickOnDate1()
		.Waitproperty()
		.click1OnYear()
		.Waitproperty()
		.ClickOnYear()
		.Waitproperty()
		.ClickOnMonth()
		.Waitproperty()
		.ClickOnDate()
		.Waitproperty()
		.ClickOnReturnDateOfTravel()
		.Waitproperty()
		.ClickOnYear1()
		.clickOnReturnYear()
		.Waitproperty()
		.clickOnreturnMonth()
		.ClickOnReturnDate()
		.ClickOnGuest()
		.selectRooms(Rooms)
		.selectAdults(Adults)
		.ClickOnDone()
		.ClickOnFindHotel()
		.Waitproperty()
		.switchToHotelSearchWindow()
		.clickOnHotel()
		.switchToHotelDetailsWindow()
		.Waitproperty()
		.clickOnContinueBook()
		.Selecttitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.SelectCountry(country)
		.SelectState(state)
		.enterMobileNumber(mobileNo)
		.enterEmail(email)
		.SelectGST(gst)
		.enterCompanyName(companyName)
		.enterCompanyAdress(companyAddress)
		.clickOnContinue();
				
				
				
			}
}
