package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers{

public UserRegistrationPage clickOnNewuser() {
		
		clickByXpath(prop.getProperty("FtrPage.clickOnNewuser.XPath"));
		
		return new UserRegistrationPage();
	}

public FtrPage switchToFtrWindow() {
	// TODO Auto-generated method stub
	switchToLastWindow();
	return new FtrPage();
}
}
