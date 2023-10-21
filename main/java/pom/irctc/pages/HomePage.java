package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.clickOnRegister.XPath"));
		return new RegistrationPage();
	}

	public HomePage mouseHoverOnHolidays() {
		//mouserHoverByXPath("");
		mouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnHolidays.XPath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		//mouseHoverByXPath("");
		mouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnStays.XPath"));
		return new HomePage();
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.clickOnLounge.XPath"));
		return new AccommodationPage();
	}
	
	public HomePage Waitproperty() {

		waitproperty(1000);
		return new HomePage();
	}
	
}
