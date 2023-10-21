package pom.ssc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.SSCHomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testcaseDescription="To verify SSC Page";
		author="Sowmya";
		category="Smoke";
		browserName="chrome";
		//url="https://ssc.nic.in/registration/home";
		url="https://ssc.nic.in/";
		sheetName="TC008";
	}
	
	@Test(dataProvider ="fetchData")
	
public void SSC(String AadharNumber,String VerifyAadharNumber,String Name, String VerifyName, 
		String FatherName, String MotherName,String VerifyMotherName,String DateOfBirth, String VerifyDateOfBirth, 
		String EducationBoard, String ddlEducationBoard,String SecondaryRollNum, String VerifySecondaryRollNum, String Yearofpassing, String ddlYearofpassing, String Levelofeducationqualification,
		String MobileNum, String VerifyMobileNum,String EmailID, String VerifyEmailID,String VerifyFatherName) {
		
		new  SSCHomePage()
		.ClickOnNewRegistration()
		.clickOnYes()
		.clickOnNO()
		.enterAdharNumber(AadharNumber)
		.enterConfirmAdharNumber(VerifyAadharNumber)
		.enterName(Name)
		.enterVerifyName(VerifyName)
		.clickOnChangeNameNo()
		.clickOnChangeNameYes()
		.enterNewName(Name)
		.enterFathersName(FatherName)
		.enterVerifyFatherName(VerifyFatherName)
		.enterMotherName(MotherName)
		.enterVerifyMotherName(VerifyMotherName)
		.enterDate(DateOfBirth)
		.enterVerifyDate(VerifyDateOfBirth)
		.selectEducationBoard(EducationBoard)
		.selectVerifyEducationBoard(ddlEducationBoard)
		.enterRollNumber(SecondaryRollNum)
		.enterVerifyRollNumber(VerifySecondaryRollNum)
		.selectYeraOfPassing(Yearofpassing)
		.selectVerifyYearOfPassing(ddlYearofpassing)
		.clickOnMale()
		.clickOnFemale()
		.clickOnTransGender()
		.clickOnVerifyMale()
		.clickOnVerifyFemale()
		.clickOnVerifyTransGender()
		.selectLevelOfEducationQualification(Levelofeducationqualification)
		.enterMobileNumber(MobileNum)
		.enterVerifyMobileNumber(VerifyMobileNum)
		.enterEmailId(EmailID)
		.enterVerifyEmailId(VerifyEmailID);
		;
		
	}
}
