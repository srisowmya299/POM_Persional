package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormcHomePage extends GenericWrappers{

public Formcpage clickOnSignUp() {
		
		clickByXpath(prop.getProperty("Formcpage.clickOnSignUp.XPath"));
		
		
		return new Formcpage();
				
	}
}
