package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLogin  extends GenericWrappers{
	
	public HotelPage switchToHotelWindow() {
		switchToLastWindow();
		return new HotelPage();
	}

	

public GuestUserLogin clickOnGuestUserLogin() {
	
	clickByXpath(prop.getProperty("GuestUserLogin.GuestUserLogin.XPath"));
	
	return this;
}

public GuestUserLogin enterEmailId(String data) {
	
	enterByXpath(prop.getProperty("GuestUserLogin.enterEmailId.XPath"), data);
	return  this;
}



public GuestUserLogin  enterMobleNumber(String data) {
	
	enterByXpath(prop.getProperty("GuestUserLogin.enterMobleNumber.XPath"), data);
	return this;
}

public HotelPage clickOnuestLogin() {
	
	clickByXpath(prop.getProperty("HotelPage.clickOnuestLogin.XPath"));
	
	return new HotelPage();
}
	

}
