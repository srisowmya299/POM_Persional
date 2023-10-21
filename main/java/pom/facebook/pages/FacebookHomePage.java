package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers{

public FacebookSignupPage ClickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		
		return new FacebookSignupPage();
	}
}
