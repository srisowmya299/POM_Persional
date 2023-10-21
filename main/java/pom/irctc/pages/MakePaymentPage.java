package pom.irctc.pages;

import wrappers.GenericWrappers;

public class MakePaymentPage extends GenericWrappers{

	public MakePaymentPage clickOnTermsAndConditions() {
		
		clickByXpath(prop.getProperty("MakePaymentPage.clickOnTermsAndConditions.XPath"));
		return new MakePaymentPage();	
	}
	
	public MakePaymentPage clickOnMakePayments() {
		
		clickByXpath(prop.getProperty("MakePaymentPage.clickOnMakePayments.XPath"));
		return this;
		
	}
}
