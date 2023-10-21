package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSerachPage extends GenericWrappers{

	public HotelSerachPage switchToHotelSearchWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelSerachPage Waitproperty() {
		
		waitproperty(1000);
		
		return new HotelSerachPage();
	}
	
	
	public HotelDetailsPage clickOnHotel() {
		
		clickByXpath(prop.getProperty("HotelDetailsPage.clickOnHotel.XPath"));
		
		return new HotelDetailsPage();
	}
}
