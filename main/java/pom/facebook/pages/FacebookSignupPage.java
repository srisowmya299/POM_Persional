package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookSignupPage extends GenericWrappers{

public FacebookSignupPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignupPage.FirstName.XPath"), data);
		
		return new FacebookSignupPage();
	}
	
public FacebookSignupPage enterSurName(String data) {
		
		enterByXpath(prop.getProperty("FacebookSingupPage.LastName.XPath"), data);
		
		return new FacebookSignupPage();
	}

public FacebookSignupPage enterMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("FacebookSignupPage.emailId.XPath"), data);
	
	return new FacebookSignupPage();
}

public FacebookSignupPage enterNewPassword(String data) {
	
	enterByXpath(prop.getProperty("FacebookSignupPage.NewPassword.XPath"), data);
	
	return new FacebookSignupPage();
}

public FacebookSignupPage selectDate(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FacebookSignupPage.Date.XPath"), data);
	
	return new FacebookSignupPage();
}

public FacebookSignupPage selectMonth(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FacebookSignupPage.Month.XPath"), data);
	
	return new FacebookSignupPage();
}

public FacebookSignupPage selectYear(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("FacebookSignupPage.Year.XPath"), data);
	
	return new FacebookSignupPage();
}

public FacebookSignupPage clickOnGender(String data) {
	clickByXpath(prop.getProperty("FacebookSignupPage.Gender.XPath"));
	return new FacebookSignupPage();
}

public FacebookSignupPage ClickOnFemale() {
	
	clickByXpath(prop.getProperty("FacebookSignupPage.Femail.XPath"));
	
	return new FacebookSignupPage();
}

public FacebookSignupPage ClickOnMale() {
	
	clickByXpath(prop.getProperty("FacebookSignupPage.Mail.XPath"));
	
	return new FacebookSignupPage();
}

public FacebookSignupPage ClickOnCustom() {
	
	clickByXpath(prop.getProperty("FacebookSignupPage.Custom.XPath"));
	
	return new FacebookSignupPage();
}
public FacebookSignupPage ClickOnSignUp() {
	
	clickByXpath(prop.getProperty("FacebookSignupPage.Signup.XPath"));
	
	return new FacebookSignupPage();
}


}
