package pom.alert.pages;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers{


	public AlertPage gettheAlert() {
		
		getAlertText();
		
		return new AlertPage();
	}
	
	public AlertPage sendThekeys(String data) {
		
		sendkeys(data);
		
		return new AlertPage();
}
	
	public AlertPage acceptTheAlert() {
		acceptAlert();
		return new AlertPage();
		
	}
	
	public  AlertPage dismisstheAlert() {
			
		dismissAlert();
			
		return new AlertPage();
		}
	
	public W3SchoolAlertPage Switchdefault() {
	
		defaultcontent();

		return  new  W3SchoolAlertPage();


		}
	
}
