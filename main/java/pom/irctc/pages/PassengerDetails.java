package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetails extends GenericWrappers{

public PassengerDetails Waitproperty() {
		
		waitproperty(1000);
		
		return new PassengerDetails();
	}

	public PassengerDetails clickOnTitle() {
	
		clickByXpath(prop.getProperty("PassengerDetails.clickOnTitle.XPath"));
		
	
		return new PassengerDetails();
}
	
	public PassengerDetails Selecttitle(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetails.Selecttitle.XPath"), data);
		
		return new PassengerDetails();
	}
	
	public PassengerDetails enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetails.enterFirstName.XPath"), data);
		
		return new PassengerDetails();
	}
	
public PassengerDetails enterLastName(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetails.enterLastName.XPath"), data);
		
		return new PassengerDetails();
	}


public PassengerDetails SelectCountry(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectCountry.XPath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails SelectState(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectState.XPath"), data);
	
	return new PassengerDetails();
}
public PassengerDetails enterMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("PassengerDetails.enterMobileNumber.XPath"), data);
	
	return new PassengerDetails();
}
public PassengerDetails enterEmail(String data) {
	
	enterByXpath(prop.getProperty("PassengerDetails.enterEmail.XPath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails SelectGST(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PassengerDetails.SelectGST.XPath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails enterCompanyName(String data) {
	
	enterByXpath(prop.getProperty("PassengerDetails.enterCompanyName.XPath"), data);
	
	return new PassengerDetails();
}

public PassengerDetails enterCompanyAdress(String data) {
	
	enterByXpath(prop.getProperty("PassengerDetails.enterCompanyAdress.XPath"), data);
	
	return new PassengerDetails();
}
public SummaryPage clickOnContinue() {
	
	clickByXpath(prop.getProperty("SummaryPage.clickOnContinue.XPath"));
	
	return new SummaryPage();
}
}
