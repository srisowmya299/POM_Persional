package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{

	public AccommodationPage clickOnRightMenu()
	{
		clickByXpath(prop.getProperty("AccommodationPage.RightMenu.XPath"));
		return new AccommodationPage();
	}
	
	public FtrPage clickOnBookYourCoach()
	{
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoach.XPath"));
		return new FtrPage();
	}
	
	public HotelPage clickOnHotel() {
		
		clickByXpath(prop.getProperty("AccommodationPage.Hotel.XPath"));
		
		return new HotelPage();
	}
	
	public CharterPage  clickOnCharter() {
		
		clickByXpath(prop.getProperty("AccommodationPage.Charter.XPath"));
		
		return new CharterPage();
	}

	public AccommodationPage switchToAccommodationWindow() {
		// TODO Auto-generated method stub
		switchToLastWindow();
		return new AccommodationPage();
	}

}
