package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{

	public HotelPage switchToHotelWindow() {
		switchToLastWindow();
		return new HotelPage();
	}
	
public GuestUserLogin clickOnLogin() {
		
		clickByXpath(prop.getProperty("GuestUserLogin.clickOnLogin.XPath"));
		
		return  new GuestUserLogin();
	}
	
	

public HotelPage enterDestination(String data) {
	
	enterByXpath(prop.getProperty("HotelPage.enterDestination.XPath"), data);
	
	return new HotelPage();
	
}

public HotelPage Waitproperty() {
	
	waitproperty(1000);
	
	return new HotelPage();
}

public HotelPage ClickOnCity() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnCity.XPath"));
	
	return  this;
}

public HotelPage ClickOnDate1() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnDate1.XPath"));
	
	return new HotelPage();
}


public HotelPage click1OnYear() {
	
	clickByXpath(prop.getProperty("HotelPage.click1OnYear.XPath"));
	
	return this;
}

public HotelPage ClickOnYear() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnYear.XPath"));
	
	return new HotelPage();
}


public HotelPage ClickOnMonth() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnMonth.XPath"));
	
	return this;
}

public HotelPage ClickOnDate() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnDate.XPath"));
	
	return this;
}






		public HotelPage ClickOnReturnDateOfTravel() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnReturnDateOfTravel.XPath"));
			
			return new HotelPage();
		}
		
		
		public HotelPage ClickOnYear1() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnYear1.XPath"));
			
			return this;
		}
		
		
		public HotelPage clickOnReturnYear() {
			
			clickByXpath(prop.getProperty("HotelPage.clickOnReturnYear.XPath"));
			return this;
			
			
		}
		
		public HotelPage clickOnreturnMonth() {
			
			clickByXpath(prop.getProperty("HotelPage.clickOnreturnMonth.XPath"));
			return this;
		}
		
		public HotelPage ClickOnReturnDate() {
			
			clickByXpath(prop.getProperty("HotelPage.ClickOnReturnDate.XPath"));
			return this;
		}
		








public HotelPage ClickOnGuest() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnGuest.XPath"));
	
	return new HotelPage();
}


public HotelPage selectRooms(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("HotelPage.selectRooms.XPath"), data);
	
	return new HotelPage();
}

public HotelPage selectAdults(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("HotelPage.selectAdults.XPath"), data);
	
	return new HotelPage();
}

public HotelPage ClickOnDone() {
	
	clickByXpath(prop.getProperty("HotelPage.ClickOnDone.XPath"));
	
	return new HotelPage();
}

public HotelSerachPage ClickOnFindHotel() {
	
	clickByXpath(prop.getProperty("HotelSerachPage.ClickOnFindHotel.XPath"));
	
	return new HotelSerachPage();
}


}
