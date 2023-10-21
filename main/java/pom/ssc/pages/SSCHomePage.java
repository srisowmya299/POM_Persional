package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SSCHomePage extends GenericWrappers{

public SSCRegistrationPage ClickOnNewRegistration() {
		
		clickByXpath(prop.getProperty("SSCRegistrationPage.ClickOnNewRegistration.XPath"));
		
		return  new SSCRegistrationPage();
	}
}

