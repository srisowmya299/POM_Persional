package pom.irctc.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.enterUserName.XPath"), data);
		return new RegistrationPage();
	}
	
	public RegistrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterPassword.XPath"), data);
		return new  RegistrationPage();
		
		
	}
	
     public RegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterConfirmPassword.XPath"), data);
		return new  RegistrationPage();
}
     
     public RegistrationPage clickPreferedLanguage() {
 		
 		clickByXpath(prop.getProperty("RegistrationPage.clickPreferedLanguage.XPath"));
 		return new  RegistrationPage();

     }
     
     public RegistrationPage selectLanguage() {
  		
  		clickByXpath(prop.getProperty("RegistrationPage.selectLanguage.XPath"));
  		return new  RegistrationPage();

      }
     
     public RegistrationPage clickOnSecurityQuestion() {
   		
   		clickByXpath(prop.getProperty("RegistrationPage.clickOnSecurityQuestion.XPath"));
   		return new  RegistrationPage();

       }
     public RegistrationPage selectSecurityQuestion() {
    		
    		clickByXpath(prop.getProperty("RegistrationPage.selectSecurityQuestion.XPath"));
    		return new  RegistrationPage();

        }
     
     public RegistrationPage enterSecurityAnswer(String data) {
 		
 		enterByXpath(prop.getProperty("RegistrationPage.enterSecurityAnswer.XPath"), data);
 		return new  RegistrationPage();

     }
     
     public RegistrationPage clickOnContinue() {
    	 
    	 clickByXpath(prop.getProperty("RegistrationPage.clickOnContinue.XPath"));
    	 return new RegistrationPage();
     }
     
public RegistrationPage enterFirstName(String data) {
    	 enterByXpath(prop.getProperty("RegistrationPage.enterFirstName.XPath"), data);
    	 return new RegistrationPage();
     }

public RegistrationPage enterSecondName(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterSecondName.XPath"), data);
	 return new RegistrationPage();
}
public RegistrationPage enterLastName(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterLastName.XPath"), data);
	 return new RegistrationPage();
}    
     
public RegistrationPage clickOnOccupation() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnOccupation.XPath"));
	 return new RegistrationPage();
}    
      
public RegistrationPage selectOccupation () {
	 clickByXpath(prop.getProperty("RegistrationPage.selectOccupation.XPath"));
	 return new RegistrationPage();
}  

public RegistrationPage  clickOnDateOfBirth() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnDateOfBirth.XPath"));
	 return new RegistrationPage();
}





public RegistrationPage  selectMonth(String data) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectMonth.XPath"), data);
	 return new RegistrationPage();
} 
public RegistrationPage  selectYear(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectYear.XPath"), Value);
	 return new RegistrationPage();
} 

public RegistrationPage clickOnDate() {
	
	clickByXpath(prop.getProperty("RegistrationPage.clickOnDate.XPath"));
	return new RegistrationPage();
}


public RegistrationPage  clickOnMarried() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnMarried.XPath"));
	 return new RegistrationPage();
}   

public RegistrationPage  clickOnUnmarried() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnUnmarried.XPath"));
	 return new RegistrationPage();
}   


     
public RegistrationPage  selectNation(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectNation.XPath"), Value);
	 return new RegistrationPage();
} 

public RegistrationPage  clickOnMale() {
			 clickByXpath(prop.getProperty("RegistrationPage.clickOnMale.XPath"));
			 return new RegistrationPage();
		}  

public RegistrationPage  clickOnFemale() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnFemale.XPath"));
	 return new RegistrationPage();
}  

public RegistrationPage  clickOnTransgender() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnTransgender.XPath"));
	 return new RegistrationPage();
}  



public RegistrationPage  enterEmailId(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterEmailId.XPath"), data);
	 return new RegistrationPage();
}
public RegistrationPage  enterMobileNumber(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterMobileNumber.XPath"), data);
	
	 return new RegistrationPage();
}

public RegistrationPage  selectNationality(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectNationality.XPath"), Value);
	 return new RegistrationPage();
} 




public RegistrationPage clickOnContinue2() {
	 
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnContinue2.XPath"));
	 return new RegistrationPage();
}

public RegistrationPage enterFlatDoorNo(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterFlatDoorNo.XPath"), data);
	 return new RegistrationPage();
}  

public RegistrationPage enterStreet(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterStreet.XPath"), data);
	 return new RegistrationPage();
}  

public RegistrationPage enterArea(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterArea.XPath"), data);
	 return new RegistrationPage();
}  

public RegistrationPage enterPincode(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterPincode.XPath"), data);
	 return new RegistrationPage();
}  


public RegistrationPage clickOnState() {
	
	clickByXpath(prop.getProperty("RegistrationPage.clickOnState.XPath"));
	
	return this;
}

public RegistrationPage enterState(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterState.XPath"), data);
	 return new RegistrationPage();
} 

public RegistrationPage clickOnCity() {
	clickByXpath(prop.getProperty("RegistrationPage.clickOnCity.XPath"));
	return new RegistrationPage();
}

public RegistrationPage  selectCity(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectCity.XPath"), Value);//changed 
	 return new RegistrationPage();
} 


public RegistrationPage  selectPostoffice(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectPostoffice.XPath"), Value);
	 return new RegistrationPage();
} 

public RegistrationPage enterPhone(String data) {
	 enterByXpath(prop.getProperty("RegistrationPage.enterPhone.XPath"), data);
	 return new RegistrationPage();
}

public RegistrationPage  clickOnYes() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnYes.XPath"));
	 return new RegistrationPage();
}

public RegistrationPage  clickOnNo() {
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnNo.XPath"));
	 return new RegistrationPage();
}

public RegistrationPage clickOnTermsandConditions() {
	 
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnTermsandConditions.XPath"));
	 return new RegistrationPage();
}

public RegistrationPage clickOnRegister() {
	 
	 clickByXpath(prop.getProperty("RegistrationPage.clickOnRegister.XPath"));
	 return new RegistrationPage();
}



public RegistrationPage closeAllBrowser() {
	
	closeAllBrowser();
	
	return new RegistrationPage();
}

public RegistrationPage Waitproperty() {

	waitproperty(1000);
	return new RegistrationPage();
}

	
	

}
