package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OTPVerificationPage extends GenericWrappers{

	public OTPVerificationPage clickOnVerify() {
		clickByXpath(prop.getProperty("OTPVerificationPage.clickOnVerify.XPath"));
		return new OTPVerificationPage();
		
	}
}
