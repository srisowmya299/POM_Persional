package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{

	public CharterPage clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		
		return new CharterPage();
	}

	public CharterPage enterNameOfApplicant(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.NameOfApplicant.XPath"), data);
		
		return new CharterPage();	
	}
	public CharterPage enterNameOfOrganization(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.NameOfOrganization.XPath"), data);
		
		return new CharterPage();
	}
	public CharterPage enterAddress(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.Address.XPath"), data);
	
	return new CharterPage();
	
	}
	public CharterPage enterMobile(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.Mobile.XPath"), data);
	
	return new CharterPage();
	}
	public CharterPage enterEmail(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.Email.XPath"), data);
	
	return new CharterPage();
	}

	public CharterPage selectRequestFor(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("CharterPage.selectRequestFor.XPath"), Value);
	
	return new CharterPage();
	}

	public CharterPage enterOriginatingStation(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.OriginatingStation.XPath"), data);
	
	return new CharterPage();}

	public CharterPage enterDestinationStaton(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.DestinationStaton.XPath"), data);
	
	return new CharterPage();}

	public CharterPage enterCharterPurpose(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.CharterPurpose.XPath"), data);
	
	return new CharterPage();
	}

	public CharterPage clickOnDate() {
	
	clickByXpath(prop.getProperty("CharterPage.clickOnDate.XPath"));
	
	return new CharterPage();
	}

	public CharterPage selectYear(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("CharterPage.selectYear.XPath"), Value);
	
	return new CharterPage();
	}

	public CharterPage clickOnMonth() {
	
	clickByXpath(prop.getProperty("CharterPage.clickOnMonth.XPath"));
	
	return new CharterPage();
	}



	public CharterPage clickOnSpecificDate() {
	
	clickByXpath(prop.getProperty("CharterPage.clickOnSpecificDate.XPath"));
	
	return new CharterPage();
	}
	public CharterPage clickOnArrivalBackDate() {
	
	clickByXpath(prop.getProperty("CharterPage.ArrivalBackDate.XPath"));
	
	return new CharterPage();
	}

	public CharterPage selectArrvalBackYear(String Value) {
	
	selectVisibileTextByXpath(prop.getProperty("CharterPage.selectArrvalBackYear.XPath"), Value);
	
	return new CharterPage();
	}
	public CharterPage clickOnArrivalBackMonth() {
	
	clickByXpath(prop.getProperty("CharterPage.clickOnArrivalBackMonth.XPath"));
	
	return new CharterPage();
	}
	public CharterPage clickOnSpecificArrivalBackDate() {
	
	clickByXpath(prop.getProperty("CharterPage.clickOnSpecificArrivalBackDate.XPath"));
	
	return new CharterPage();
	}

	public CharterPage enterNoOfDays(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.NoOfDays.XPath"), data);
	
	return new CharterPage();
	
	}

	public CharterPage enterNoOfCoaches(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.NoOfCoaches.XPath"), data);
	
	return new CharterPage();
	
	}

	public CharterPage enterNoOfPassengers(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.NoOfPassengers.XPath"), data);
	
	return new CharterPage();
	
	}	

	public CharterPage enterPurposeOfCharter(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.PurposeOfCharter.XPath"), data);
	
	return new CharterPage();
	
	}

	public CharterPage enterAdditionalService(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.AdditionalService.XPath"), data);
	
	return new CharterPage();
	}
	
	public CharterPage clickOnSubmit() {
	
	clickByXpath(prop.getProperty("CharterPage.clickOnSubmit.XPath"));
	
	return new CharterPage();
	}
	

}
