package pom.irctc.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers{

	public UserRegistrationPage enterUserId(String data) {
			
			enterByXpath(prop.getProperty("UserRegistrationPage.enterUserId.XPath"), data);
			
			return new UserRegistrationPage();
		}

	public UserRegistrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterPassword.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterConfirmPassword.XPath"), data);
		
		return new UserRegistrationPage();
	}

	public UserRegistrationPage selectSecurityQuestion(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectSecurityQuestion.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage clickOnDate() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnDate.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage selectMonth(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectMonth.XPath"), data);
		
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage selectyear(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectyear.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	
	public UserRegistrationPage clickOnDatenum() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnDatenum.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage clickOnMale() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnMale.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage clickOnFemale() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnFemale.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage clickOnTransgender() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnTransgender.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage clickOnInstitution() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnInstitution.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage clickOnMarried() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnMarried.XPath"));
		
		return new UserRegistrationPage();
	}
	public UserRegistrationPage clickOnUnmarried() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnUnmarried.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterEmail.XPath"), data);
		
		return new UserRegistrationPage();
	}	
	public UserRegistrationPage selectOccupation(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectOccupation.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage entersecurityAnswer(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.entersecurityAnswer.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterFirstName.XPath"), data);
		
		return new UserRegistrationPage();
		
		
	}
	
	public UserRegistrationPage enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterMiddleName.XPath"), data);
		
		return new UserRegistrationPage();
	}
	public UserRegistrationPage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterLastName.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage selectNationalty(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectNationalty.XPath"), Value);
		
		return new UserRegistrationPage();
		}

	public UserRegistrationPage enterFlatnO(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterFlatnO.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterStreet(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterStreet.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterArea(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterArea.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage selectcountry(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectcountry.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	public UserRegistrationPage enterMobile(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterMobile.XPath"), data);
		
		return new UserRegistrationPage();
	}
	public UserRegistrationPage enterPincode(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterPincode.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage selectCity(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectCity.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage clickOnState() {
		
		//selectVisibileTextByXpath("//select[@name='state']", Value);
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnState.XPath"));
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage selectState(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectState.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage selectPostOffice(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectPostOffice.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage clickOnYes() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnYes.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage clickOnNo() {
		
		clickByXpath(prop.getProperty("UserRegistrationPage.clickOnNo.XPath"));
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterCommunicationFlatNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterCommunicationFlatNo.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterCommunicationStreet(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterCommunicationStreet.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage enterCommuncationArea(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterCommuncationArea.XPath"), data);
		
		return new UserRegistrationPage();
	}

	public UserRegistrationPage selectCommunicationcountry(String Value) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistrationPage.selectCommunicationcountry.XPath"), Value);
		
		return new UserRegistrationPage();
		}
	
	public UserRegistrationPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterMobileNumber.XPath"), data);
		
		return new UserRegistrationPage();
	}
	public UserRegistrationPage enterCommunicationPincode(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.enterCommunicationPincode.XPath"), data);
		
		return new UserRegistrationPage();
	}
	
	public UserRegistrationPage Waitproperty() {

		waitproperty(1000);
		return new UserRegistrationPage();

}
}
