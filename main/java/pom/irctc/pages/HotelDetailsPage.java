package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers{

	public HotelDetailsPage switchToHotelDetailsWindow() {
		switchToLastWindow();
		return new HotelDetailsPage();
	}
	
	public HotelDetailsPage Waitproperty() {
		
		waitproperty(1000);
		
		return new HotelDetailsPage();
	}
	
	
	public PassengerDetails clickOnContinueBook() {
		clickByXpath(prop.getProperty("PassengerDetails.clickOnContinueBook.XPath"));
		
		return new PassengerDetails();
	}
}
