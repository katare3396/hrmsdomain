package com.hrms.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hrms.pageobject.EmployeesDirectoryPageObject;

public class EmployeesDirectoryActions {

	private WebDriver driver;
	private EmployeesDirectoryPageObject employeesdirectorypageObject;
	public EmployeesDirectoryActions employeesDirectoryActions;

	public EmployeesDirectoryActions(WebDriver driver) {
		this.driver = driver;
		this.employeesdirectorypageObject = new EmployeesDirectoryPageObject(driver);
	}

//	page visible

	public void employeeDirectoryPageVisible() {

		employeesdirectorypageObject.employeeDirectorypageVisible();
	}

//	Employee directory clcik

	public void employeesDirectoryClick() {
		employeesdirectorypageObject.employeesDirectoryClick();

	}

//	employee directory current url

	public void employeeDirectoryGetCurrentUrl() {
		employeesdirectorypageObject.getCurrentUrlToCrossVerify();
	}

//	create employee manually

	public void createEmployeeManually() {
		employeesdirectorypageObject.createNewBtnClick();
		employeesdirectorypageObject.addManuallyClick();
	}

//	save btn while create employee

	public void EmployeeDirectoryCreateSaveBtnClick() {
		employeesdirectorypageObject.saveBtnEmployeeCreationFormDd();
	}

//	success message that employee is create 

	public void sucessMessageCreateEmployee() {

//		success message that employee is create 
		employeesdirectorypageObject.employeeCreationSuceessMessage();
	}

//	  refresh page

	public void employeeDirectoryRefreshpage() {

//      refresh page of employee directory
		employeesdirectorypageObject.employeeDirectoryRefreshPage();
	}

//	search employee

	public void employeeDirectorySearchBoxText() {
		employeesdirectorypageObject.employeeDirectorySearchBoxText();
		employeesdirectorypageObject.employeeDirectoryEmployeeeList();
	}

//	first section -->"personal detail"  employee creation form field

	public void employeeCreationFirstSectionFormPersonalDetail() {

		employeesdirectorypageObject.employeeCreationFormFullNameInput();
		employeesdirectorypageObject.employeeCreationFormGenderDd();
		employeesdirectorypageObject.employeeCreationFormJoiningDateCalendar();
		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();
		employeesdirectorypageObject.employeeCreationFormDateOfMarriagecalendar();
		employeesdirectorypageObject.employeeCreationFormDateOfBirthCalendar();
		employeesdirectorypageObject.employeeCreationFormNationalityDd();
		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();
		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();
		employeesdirectorypageObject.employeeCreationFormAadharCardEnter();
		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

	}

//	second section -->"detail" employee creation form field

	public void employeeCreationSecondSectionFormWorkDetail() {

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInput();
		employeesdirectorypageObject.employeeCreationFormdetailLeaveRuleDd();
		employeesdirectorypageObject.employeeCreationFormdetailReportingManagerDd();
		employeesdirectorypageObject.employeeCreationFormdetailShiftDd();
		employeesdirectorypageObject.employeeCreationFormdetailDepartmentDd();
		employeesdirectorypageObject.employeeCreationFormdetailDesignationDd();
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeTypeDd();
		employeesdirectorypageObject.employeeCreationFormdetailLocation_Dd();
		employeesdirectorypageObject.employeeCreationFormdetailOfficial_Email_ID_Input();
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeStatusDd();
		employeesdirectorypageObject.employeeCreationFormDetailCompanyDd();

	}

//	 third section -->"Address" employee creation form field

	public void employeeCreationThreeSectionFormAddress() {

		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress1Text();
		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress2Text();
		employeesdirectorypageObject.employeeCreationFormAddressCountryDd();
		employeesdirectorypageObject.employeeCreationFormAddressStateDd();
		employeesdirectorypageObject.employeeCreationFormAddressCityDd();
		employeesdirectorypageObject.employeeCreationFormAddressZipInput();
		employeesdirectorypageObject.employeeCreationFormAddressSameAsCurrentCb();

	}

//	four section -->"Bank Name" employee creation form field 

	public void employeeCreationFourSectionFormBankDetail() {

		employeesdirectorypageObject.employeeCreationFormBankNameText();
		employeesdirectorypageObject.employeeCreationFormBankNameAccountNoText();
		employeesdirectorypageObject.employeeCreationFormBankNameIFSCcodeText();
		employeesdirectorypageObject.employeeCreationFormBankNameAccountHolderNameText();

	}

//	five section -->"Emergency Detail" employee creation form field

	public void employeeCreationFiveSectionFormemergencyDetail() {

		employeesdirectorypageObject.employeeCreationFormEmergencyNameText();
		employeesdirectorypageObject.employeeCreationFormEmergencyRelationshipText();
		employeesdirectorypageObject.employeeCreationFormEmergencyAddressText();
		employeesdirectorypageObject.employeeCreationFormEmergencyEmailText();
		employeesdirectorypageObject.employeeCreationFormEmergencyMobileNoText();

	}

//	six section -->"Qualification" employee creation form field 

	public void employeeCreationSixSectionFormQualification() {

		employeesdirectorypageObject.employeeCreationFormQualificationDiplomaNameDd();
		employeesdirectorypageObject.employeeCreationFormQualificationInstitutionNameText();
		employeesdirectorypageObject.employeeCreationFormQualificationPassingYearText();
		employeesdirectorypageObject.employeeCreationFormQualificationPercentageText();

	}

//	seven section -->"Work Experience" employee creation form field 

	public void employeeCreationSevenSectionFormWorkExperience() {

		employeesdirectorypageObject.employeeCreationFormWEPreviousCompanyNameTxt();
		employeesdirectorypageObject.employeeCreationFormWEJobTitleTxt();
		employeesdirectorypageObject.employeeCreationFormWEFromDateCalendar();
		employeesdirectorypageObject.employeeCreationFormWETODateCalendar();

	}

//	employee create manually

	public void formOfmanuallyEmployeeCreate() {

		employeesDirectoryActions = new EmployeesDirectoryActions(driver);

//		employeesdirectorypageObject.selectEntityEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationFirstSectionFormPersonalDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationSecondSectionFormWorkDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationThreeSectionFormAddress();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationFourSectionFormBankDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationFiveSectionFormemergencyDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationSixSectionFormQualification();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeesDirectoryActions.employeeCreationSevenSectionFormWorkExperience();

//		 save btn while create employee

		employeesDirectoryActions.EmployeeDirectoryCreateSaveBtnClick();
	}

//	employee not filled first section  mandatory filled it should get error

	public void employeeDirectoryEmployeeNotFillFirstSectionMandatoryFieldThanItShouldGetError() {
		employeesDirectoryActions = new EmployeesDirectoryActions(driver);

		employeesDirectoryActions.createEmployeeManually();

		employeesDirectoryActions.employeeCreationFirstSectionFormPersonalDetail();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();
		employeesdirectorypageObject.errorMessageEnterFullName();

//		cancel btn
		employeesdirectorypageObject.employeeDirectoryCancelBtnClick();
	}

//	employee not filled joining date   mandatory filled it should get error

	public void employeeDirectoryEmployeeNotFillMandatoryFieldOfJoiningDateThanItShouldGetError() {
		employeesDirectoryActions = new EmployeesDirectoryActions(driver);

//		manually employee create form 
		employeesDirectoryActions.formOfmanuallyEmployeeCreate();

//		pop of joining date is missing 
		employeesdirectorypageObject.Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process_Btn();

//      sucess message 
		employeesDirectoryActions.sucessMessageCreateEmployee();

	}
	
//	click on employee profile
	
	public void employeeDirectoryProfileClick() {
		employeesdirectorypageObject.employeeDirectoryProfieClick();
	}
	
//	get text
	
	public void EmployeeDirectoryGetText() {
		employeesdirectorypageObject.employeeDirectoryGetTextFullName();
		employeesdirectorypageObject.employeeDirectoryGetTextGender();
		employeesdirectorypageObject.employeeDirectoryGetTextMaritalStatus();
		employeesdirectorypageObject.employeeDirectoryGetTextNationality();
		employeesdirectorypageObject.employeeDirectoryGetTextMOBILENUMBER();
//		employeesdirectorypageObject.employeeDirectoryGetTextPersonalEmailID();
		employeesdirectorypageObject.employeeDirectoryGetTextAadharCard();
		employeesdirectorypageObject.employeeDirectoryGetTextBloodGroup();
		employeesdirectorypageObject.employeeDirectoryGetTextLeaveRule();
		employeesdirectorypageObject.employeeDirectoryGetTextReportingManager();
		employeesdirectorypageObject.employeeDirectoryGetTextShift();
		employeesdirectorypageObject.employeeDirectoryGetTextDepartment();
		employeesdirectorypageObject.employeeDirectoryGetTextDesignation();
		employeesdirectorypageObject.employeeDirectoryGetTextEmployeeType();
		employeesdirectorypageObject.employeeDirectoryGetTextLocation();
//		employeesdirectorypageObject.employeeDirectoryGetTextOfficialEmailID();
		employeesdirectorypageObject.employeeDirectoryGetTextEmployeeStatus();
		employeesdirectorypageObject.employeeDirectoryGetTextCompany();
		employeesdirectorypageObject.employeeDirectoryGetTextCurrentAddress1();
		employeesdirectorypageObject.employeeDirectoryGetTextCurrentAddress2();
		employeesdirectorypageObject.employeeDirectoryGetTextCountry();
		employeesdirectorypageObject.employeeDirectoryGetTextState();
		employeesdirectorypageObject.employeeDirectoryGetTextCity();
		employeesdirectorypageObject.employeeDirectoryGetTextZip();
		employeesdirectorypageObject.employeeDirectoryGetTextBankName();
		employeesdirectorypageObject.employeeDirectoryGetTextAccountNo();
		employeesdirectorypageObject.employeeDirectoryGetTextIFSCcode();
		employeesdirectorypageObject.employeeDirectoryGetTextAccountHolderName();
		employeesdirectorypageObject.employeeDirectoryGetTextName();		
		employeesdirectorypageObject.employeeDirectoryGetTextRelationship();
		employeesdirectorypageObject.employeeDirectoryGetTextAddress();
		employeesdirectorypageObject.employeeDirectoryGetTextEmail();
//		employeesdirectorypageObject.employeeDirectoryGetTextMobileNo();
		employeesdirectorypageObject.employeeDirectoryGetTextDiplomaDegreeName();
		employeesdirectorypageObject.employeeDirectoryGetTextInstitutionName();
		employeesdirectorypageObject.employeeDirectoryGetTextPassingYear();
		employeesdirectorypageObject.employeeDirectoryGetTextPercentage();
		employeesdirectorypageObject.employeeDirectoryGetTextPreviousCompanyName();
		employeesdirectorypageObject.employeeDirectoryGetTextJobTitle();
//		employeesdirectorypageObject.employeeDirectoryGetTextsideReportingManager();
	
		employeesdirectorypageObject.employeeDirectoryViewClickCrossBtn();
	}

}
