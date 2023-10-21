package pom.php.pages;

import wrappers.GenericWrappers;

public class PHPRegistrationPage extends GenericWrappers{

public PHPRegistrationPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.enterFirstName.XPath"), data);
		
		
		return new PHPRegistrationPage();
	}
	
public PHPRegistrationPage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.enterLastName.XPath"), data);
		
		
		return new PHPRegistrationPage();
	}
public PHPRegistrationPage enterEmailAddress(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterEmailAddress.XPath"), data);
	
	
	return new PHPRegistrationPage();
}

public PHPRegistrationPage clickOnCountryCode() {
	
	clickByXpath(prop.getProperty("PHPRegistrationPage.clickOnCountryCode.XPath"));
	return new PHPRegistrationPage();
}

public PHPRegistrationPage enterCompanyname(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterCompanyname.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterStreetAddress(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterStreetAddress.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterStreetAddress2(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterStreetAddress2.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterCity(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterCity.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterState(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterState.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterPostCode(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterPostCode.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterMobile(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterMobile.XPath"), data);
	
	
	return new PHPRegistrationPage();
}

public PHPRegistrationPage selectCountry(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("PHPRegistrationPage.selectCountry.XPath"), data);
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterPassword(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterPassword.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
public PHPRegistrationPage enterConfirmPassword(String data) {
	
	enterByXpath(prop.getProperty("PHPRegistrationPage.enterConfirmPassword.XPath"), data);
	
	
	return new PHPRegistrationPage();
}
}
