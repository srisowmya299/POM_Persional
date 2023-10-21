package pom.alert.pages;

import wrappers.GenericWrappers;

public class W3SchoolAlertPage extends GenericWrappers{

	public AlertPage clickOnTryIt() {
		clickByXpath(prop.getProperty("W3SchoolAlertPage.TryIt.XPath"));
		return  new AlertPage();
		
	}
	
	public W3SchoolAlertPage clickonHome() {
			
			clickByXpath(prop.getProperty("W3SchoolAlertPage.Home.XPath"));
			
			return new W3SchoolAlertPage();
		}
	
	
	public 	W3SchoolAlertPage refreshThepage() {
		refresh();
		return new W3SchoolAlertPage();
	}
	
	public W3SchoolAlertPage switchframe() {
		
		switchToFrameByXpath(prop.getProperty("W3SchoolAlertPage.switchframe.XPath"));
		
		return  new W3SchoolAlertPage();
	}
	

	
}
