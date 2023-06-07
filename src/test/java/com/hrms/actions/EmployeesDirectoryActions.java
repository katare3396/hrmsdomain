package com.hrms.actions;

import org.openqa.selenium.WebDriver;

import com.hrms.pageobject.EmployeesDirectoryPageObject;

public class EmployeesDirectoryActions {

	private static EmployeesDirectoryActions INSTANCE;
//	private WebDriver driver;
	private EmployeesDirectoryPageObject employeesdirectorypageObject;

	private EmployeesDirectoryActions(WebDriver driver) {
//		this.driver = driver;
		this.employeesdirectorypageObject = new EmployeesDirectoryPageObject(driver);
	}

	// Singleton Design Pattern for single Instance
	public static EmployeesDirectoryActions getInstance(WebDriver driver) {
		if (INSTANCE == null) {
			INSTANCE = new EmployeesDirectoryActions(driver);
		}
		return INSTANCE;
	}

//	page visible

	public void employeeDirectoryPageVisible() {
		employeesdirectorypageObject.employeeDirectorypageVisible();
	}

//	Employee directory click

	public void employeesDirectoryClick() {
		employeesdirectorypageObject.employeesDirectoryClick();
	}

//	employee directory current url

	public void employeeDirectoryGetCurrentUrl() {
		employeesdirectorypageObject.getCurrentUrlToCrossVerify();
	}

//	create employee manually

	public void createEmployeeManually() {
		employeesdirectorypageObject.takeActionsNewBtnClick();
		employeesdirectorypageObject.addManuallyClick();
	}

//	mutiple click save btn while create employee

	public void EmployeeDirectoryCreateSaveBtnMutipleClick() {
		employeesdirectorypageObject.saveBtnMutipleClickEmployeeCreationFormDd();
	}

//	single click save btn while create employee

	public void EmployeeDirectoryCreateSaveBtnSingleClick() {
		employeesdirectorypageObject.saveBtnSingleClickEmployeeCreationFormDd();
	}

//	success message that employee is create 

	public void sucessMessageCreateEmployee() {

//		success message that employee is create 
		employeesdirectorypageObject.employeeCreationSuceessMessage();
	}

//empcode is exist -- error message so employee which not create	

	public void employeeCodeAlreadyExist() {
		employeesdirectorypageObject.employeeDirectoryEmployeecodealreadyExist();
		employeesdirectorypageObject.employeeDirectoryCancelBtnClick();

	}

//	  refresh page

	public void employeeDirectoryRefreshpage() {

//      refresh page of employee directory
		employeesdirectorypageObject.employeeDirectoryRefreshPage();
	}

//	search employee

	public void employeeDirectorySearchBoxText() {
		employeesdirectorypageObject.employeeDirectorySearchBoxText();

	}

//	 list employee
	public void employeeDirectoryEmployeeList() {
		employeesdirectorypageObject.employeeDirectoryEmployeeeList();
	}

	public void randomNameGeneration() {
		employeesdirectorypageObject.employeeCreationFormFullNameInputGenerator();

		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnterGeneration();

		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnterGeneration();

		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInputString();

		employeesdirectorypageObject.employeeCreationFormAadharCardEnterGeneration();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInputGeneration();

		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress1TextGeneration();

		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress2TextGneration();

		employeesdirectorypageObject.employeeCreationFormAddressZipInputGeneration();

		employeesdirectorypageObject.employeeCreationFormBankNameTextGeneration();

		employeesdirectorypageObject.employeeCreationFormBankNameAccountNoTextGeneration();

		employeesdirectorypageObject.employeeCreationFormBankNameIFSCcodeTextGeneration();

		employeesdirectorypageObject.employeeCreationFormBankNameAccountHolderNameTextGeneration();

		employeesdirectorypageObject.employeeCreationFormEmergencyNameTextGeneration();

		employeesdirectorypageObject.employeeCreationFormEmergencyRelationshipTextGeneration();

		employeesdirectorypageObject.employeeCreationFormEmergencyAddressTextGeneration();

		employeesdirectorypageObject.employeeCreationFormEmergencyEmailTextGeneration();

		employeesdirectorypageObject.employeeCreationFormEmergencyMobileNoTextGeneration();

		employeesdirectorypageObject.employeeCreationFormQualificationInstitutionNameTextGeneration();

		employeesdirectorypageObject.employeeCreationFormQualificationPassingYearTextGeneration();

		employeesdirectorypageObject.employeeCreationFormQualificationPercentageTextGeneration();

		employeesdirectorypageObject.employeeCreationFormWEPreviousCompanyNameTxtGeneration();

		employeesdirectorypageObject.employeeCreationFormWEJobTitleTxtGeneration();
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

//	mandatory first section(employee name , joining date ,DOB, Mrriage is not fill) -->"personal detail"  employee creation form field

	public void employeeCreationFirstSectionMandatoryFormPersonalDetail() {

		// mandatory field of employee name not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryFullNameInput();

		employeesdirectorypageObject.employeeCreationFormGenderDd();

		// mandatory field joining name not fill
		employeesdirectorypageObject.employeeCreationFormmandatoryJoiningDateCalendar();
		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();

		// mandatory filed marriage Date not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfMarriagecalendar();

		// mandatory field DOB not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfBirthCalendar();

		employeesdirectorypageObject.employeeCreationFormNationalityDd();

		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();

		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();

		employeesdirectorypageObject.employeeCreationFormManadatoryAadharCardEnter();
		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

	}

//	mandatory first section (where joining date,Dob,Marriage date is not filled) -->"personal detail"  employee creation form field

	public void employeeCreationFirstSectionMandatoryJoiningDateNotFillFormPersonalDetail() {

		// generated employee name
		employeesdirectorypageObject.employeeCreationFormFullNameInput();

		employeesdirectorypageObject.employeeCreationFormGenderDd();

		// mandatory field joining name not fill
		employeesdirectorypageObject.employeeCreationFormmandatoryJoiningDateCalendar();
		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();

		// mandatory filed marriage Date not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfMarriagecalendar();

		// mandatory field DOB not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfBirthCalendar();

		employeesdirectorypageObject.employeeCreationFormNationalityDd();

		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();

		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();

		employeesdirectorypageObject.employeeCreationFormAadharCardEnter();

		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

	}

//	second section -->"detail" employee creation form field

	public void employeeCreationSecondSectionFormWorkDetail() {

//		empcode generating
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInput();

		employeesdirectorypageObject.employeeCreationFormdetailLeaveRuleDd();

		employeesdirectorypageObject.employeeCreationFormdetailReportingManagerDd();

		employeesdirectorypageObject.employeeCreationFormdetailShiftDd();

		employeesdirectorypageObject.employeeCreationFormdetailDepartmentDd();

		employeesdirectorypageObject.employeeCreationFormdetailDesignationDd();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeTypeDd();

		employeesdirectorypageObject.employeeCreationFormdetailLocation_Dd();

		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInput();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeStatusDd();

		employeesdirectorypageObject.employeeCreationFormDetailCompanyDd();

	}
//	mandatory second section -->"detail" employee creation form field

	public void employeeCreationSecondSectionNewEmpCodeFormWorkDetail() {

//	new emp code 	
		employeesdirectorypageObject.employeeCreationFormdetailNewEmployeeCodeInput();

		employeesdirectorypageObject.employeeCreationFormdetailLeaveRuleDd();

		employeesdirectorypageObject.employeeCreationFormdetailReportingManagerDd();

		employeesdirectorypageObject.employeeCreationFormdetailShiftDd();

		employeesdirectorypageObject.employeeCreationFormdetailDepartmentDd();

		employeesdirectorypageObject.employeeCreationFormdetailDesignationDd();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeTypeDd();

		employeesdirectorypageObject.employeeCreationFormdetailLocation_Dd();

		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInput();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeStatusDd();

		employeesdirectorypageObject.employeeCreationFormMandatoryDetailCompanyDd();

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

//		employeesdirectorypageObject.selectEntityEmployeeCreationFormDd();

		employeeCreationFirstSectionFormPersonalDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationSecondSectionFormWorkDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationThreeSectionFormAddress();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationFourSectionFormBankDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationFiveSectionFormemergencyDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationSixSectionFormQualification();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationSevenSectionFormWorkExperience();

//		 save btn while create employee

//		EmployeeDirectoryCreateSaveBtnClick();
	}

//	employee not filled first section (full name , dob , marriage date & joining date is not fill)  mandatory filled it should get error

	public void employeeDirectoryEmployeeNotFillFirstSectionMandatoryFieldThanItShouldGetError() {

		createEmployeeManually();

		employeeCreationFirstSectionMandatoryFormPersonalDetail();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		error message of enter full name 
		employeesdirectorypageObject.errorMessageDisplayEnterFullNameMandatoryFullName();

//		error  message of Enter 12 Digital Adhaar Name
		employeesdirectorypageObject.errorMessgeEnter12DigitalAdhaarNameManadatoryAdhaar();

//		cancel btn
		employeesdirectorypageObject.employeeDirectoryCancelBtnClick();

//		url match
		employeesdirectorypageObject.getCurrentUrlToCrossVerify();
	}

//	employee (not filled joining date)   mandatory filled it should get error

	public void employeeDirectoryEmployeeNotFillMandatoryFieldOfJoiningDateThanItShouldGetError() {

//		manually employee create form 

//		employeesdirectorypageObject.selectEntityEmployeeCreationFormDd();

//		first section mandatory filed are (joining date is not filled)
		employeeCreationFirstSectionMandatoryJoiningDateNotFillFormPersonalDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		second section mandatory filed ar not filled
		employeeCreationSecondSectionNewEmpCodeFormWorkDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		three section mandatory filed ar not filled
		employeeCreationThreeSectionFormAddress();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		four section mandatory filed ar not filled
		employeeCreationFourSectionFormBankDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		five section mandatory filed ar not filled
		employeeCreationFiveSectionFormemergencyDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		six section mandatory filed ar not filled
		employeeCreationSixSectionFormQualification();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		seven section mandatory filed ar not filled
		employeeCreationSevenSectionFormWorkExperience();

//		 save btn while create employee

		EmployeeDirectoryCreateSaveBtnMutipleClick();

//		pop of joining date is missing 
		employeesdirectorypageObject.Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process_Btn();

//      sucess message 
		sucessMessageCreateEmployee();

	}

//	click on employee profile

	public void employeeDirectoryProfileClick() {
		employeesdirectorypageObject.employeeDirectoryProfieClick();

	}

//	get text

	public void EmployeeDirectoryGetText() {

//		first section get text

		employeesdirectorypageObject.employeeDirectoryGetTextFullName();
		employeesdirectorypageObject.employeeDirectoryGetTextGender();
		employeesdirectorypageObject.employeeDirectoryGetTextMaritalStatus();
		employeesdirectorypageObject.employeeDirectoryGetTextNationality();
		employeesdirectorypageObject.employeeDirectoryGetTextMOBILENUMBER();
		employeesdirectorypageObject.employeeDirectoryGetTextPersonalEmailID();
		employeesdirectorypageObject.employeeDirectoryGetTextAadharCard();
		employeesdirectorypageObject.employeeDirectoryGetTextBloodGroup();

//		second section get text
		employeesdirectorypageObject.employeeDirectoryGetTextLeaveRule();
		employeesdirectorypageObject.employeeDirectoryGetTextReportingManager();
		employeesdirectorypageObject.employeeDirectoryGetTextShift();
		employeesdirectorypageObject.employeeDirectoryGetTextDepartment();
		employeesdirectorypageObject.employeeDirectoryGetTextDesignation();
		employeesdirectorypageObject.employeeDirectoryGetTextEmployeeType();
		employeesdirectorypageObject.employeeDirectoryGetTextLocation();
		employeesdirectorypageObject.employeeDirectoryGetTextOfficialEmailID();
		employeesdirectorypageObject.employeeDirectoryGetTextEmployeeStatus();
		employeesdirectorypageObject.employeeDirectoryGetTextCompany();

//		three section get text
		employeesdirectorypageObject.employeeDirectoryGetTextCurrentAddress1();
		employeesdirectorypageObject.employeeDirectoryGetTextCurrentAddress2();
		employeesdirectorypageObject.employeeDirectoryGetTextCountry();
		employeesdirectorypageObject.employeeDirectoryGetTextState();
		employeesdirectorypageObject.employeeDirectoryGetTextCity();
		employeesdirectorypageObject.employeeDirectoryGetTextZip();

//		four section get text
		employeesdirectorypageObject.employeeDirectoryGetTextBankName();
		employeesdirectorypageObject.employeeDirectoryGetTextAccountNo();
		employeesdirectorypageObject.employeeDirectoryGetTextIFSCcode();
		employeesdirectorypageObject.employeeDirectoryGetTextAccountHolderName();

//		five section get text
		employeesdirectorypageObject.employeeDirectoryGetTextName();
		employeesdirectorypageObject.employeeDirectoryGetTextRelationship();
		employeesdirectorypageObject.employeeDirectoryGetTextAddress();
		employeesdirectorypageObject.employeeDirectoryGetTextEmail();
//		employeesdirectorypageObject.employeeDirectoryGetTextMobileNo();

//		six section get text
		employeesdirectorypageObject.employeeDirectoryGetTextDiplomaDegreeName();
		employeesdirectorypageObject.employeeDirectoryGetTextInstitutionName();
		employeesdirectorypageObject.employeeDirectoryGetTextPassingYear();
		employeesdirectorypageObject.employeeDirectoryGetTextPercentage();

//		seven section get text
		employeesdirectorypageObject.employeeDirectoryGetTextPreviousCompanyName();
		employeesdirectorypageObject.employeeDirectoryGetTextJobTitle();

//		employeesdirectorypageObject.employeeDirectoryGetTextsideReportingManager();

		employeesdirectorypageObject.employeeDirectoryViewClickCrossBtn();
	}

	public void employeeDiectoyarrowBthClick() {
		employeesdirectorypageObject.employeeDiectoyarrowBthClick();
	}

//file upload bulk creation

	public void fileUploadBulkCreation() {
		employeesdirectorypageObject.takeActionsNewBtnClick();
		employeesdirectorypageObject.employeeDirectorBulkCreation();
		employeesdirectorypageObject.employeeDirectoryFileUpload();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();
		employeesdirectorypageObject.sucessMessageBulkUpload();
	}

//	write data in excel files

	public void excelFileWrite() {
		employeesdirectorypageObject.excelFilesWriteBulkCreate();
	}

//	 compare employee code 

	public void empCodeFindAnyDuplicate() {
		employeesdirectorypageObject.uniqueListEmpCode();
	}

//	check Emp Directory Page Close
	public void checkEmpDirectoryPageShouldNotDisplay() {

		employeesdirectorypageObject.checkEmpDirectoryPageClose();
	}

}
