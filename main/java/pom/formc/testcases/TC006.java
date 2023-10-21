package pom.formc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FormcHomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testcaseDescription="To verify form C sign up page";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	}
	
	@Test(dataProvider ="fetchData")
public void FormcHomepage(String u_id,String u_pwd,String u_repwd,String u_secques,String u_secans,String u_name, String u_gender,String u_dob,String u_designation,
		String u_emailid,String u_mobile,String u_phone,String u_nationality,String name,String capacity,String address,String state
		,String city_distr, String acco_type, String star_rat,String email, String mcontact,String contact, String name_o,
		String address_o,String state_o,String citydistr_o,String emailid_o,String phoneno_o,String mobile_o) {
		
		
		new FormcHomePage()
		
		.clickOnSignUp()
	    .enterUserId(u_id)
		.enterPassword(u_pwd)
		.enterConfirmPassword(u_repwd)
		.selectSecurityQuestion(u_secques)
		.enterYourAnswer(u_secans)
		.enterName(u_name)
		.selectGender(u_gender)
		.enterDateOfBirth(u_dob)
		.enterDesignation(u_designation)
		.enterEmailid(u_emailid)
		.enterMobile(u_mobile)
		.enterPhonenumber(u_phone)
		.selectNationality(u_nationality)
		.enterNmae(name)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.selectCity(city_distr)
		.selectAccomodationType(acco_type)
		.selectAccomodationGrade(star_rat)
		.enteremailId(email)
		.enterMobile1(mcontact)
		.enterPhoneNumber(contact)
		.enterName1(name_o)
		.enterAddress1(address_o)
		.selectState1(state_o)
		.selectCity1(citydistr_o)
		.enterEmailId1(emailid_o)
		.enterPhoneNumber1(phoneno_o)
		.enterMobileNumber1(mobile_o)
		.enterName2(name)
		.enterAddress2(address)
		.selectState2(state)
		.selectCity2(address_o)
		.enterEmail2(email)
		.enterPhone2(u_mobile)
		.enterMobile2(u_mobile)
		.enterName3(address_o)
		.enterAddress3(address_o)
		.selectState3(state)
		.selectCity3(address)
		.enterEmailId3(u_emailid)
		.enterPhone3(emailid_o)
		.enterMobile3(emailid_o);
		
	}
}
