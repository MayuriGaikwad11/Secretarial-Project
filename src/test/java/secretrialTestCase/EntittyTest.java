package secretrialTestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import secretrial.Methods;

public class EntittyTest {
	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		//String workingDir = System.getProperty("user.dir");
		fis = new FileInputStream("C:\\Users\\Mayuri\\Desktop\\AvaSec\\Secretarial-Project\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Mayuri\\Desktop\\AvaSec\\Secretarial-Project\\Report\\Secretrial.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 1)

	void Login() throws InterruptedException, IOException
	{
	
		test = extent.startTest("Secreterial Logging In - Company Secretory");
		

		XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"Compnay Secretory");		//Method of Login class to login user.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	/*
	@Test(priority = 2)
	void BusinessActivityClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity  ");
		
		Methods.BusinessActivityClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 3)
	void AddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New ");
		
		Methods.BusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 4)
	void validationofsave() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New - To check validation of save button without entering a data");
		
		Methods.validationofsave(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5)
	void validationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit");
		
		Methods.validationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6)
	void CheckInvaliddata() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit - Check Invalid Data");
		
		Methods.CheckInvaliddata(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 7)
	void DeleteBusinessActivity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity - Delete");
		
		Methods.DeleteBusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	//@Test(priority = 7) Not Completed
	void CheckFilterWork() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity - Filter");
		
		Methods.CheckFilterWork(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}*/
	
//	@Test(priority = 8)
	void BusinessActivityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
		
		Methods.BusinessActivityValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 9)
	void DocumentClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents ");
		
		Methods.DocumentClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 10)
	void DocumentsADDMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting MOA");
		
		Methods.DocumentsADDMOA(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 11)
	void WithoutDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type MOA - Without Document ");
		
		Methods.WithoutDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 12)
	void DocumentsADDMOAAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - with existing data ");
		
		Methods.DocumentsADDMOAAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 13)//start
	void ViewMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-view-MOA ");
		
		Methods.ViewMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 14)
	void DownloadMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download - MOA ");
		
		Methods.DownloadMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 15)
	void DeleteMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete - MOA ");
		
		Methods.DeleteMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	//@Test(priority = 16)
	void AddNewDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting AOA");
		
		Methods.DocumentsADD(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 17)
	void DocumentsADDExisting() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -AOA - with existing data ");
		
		Methods.DocumentsADDExisting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 18)
	void ViewAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-View - AOA");
		
		Methods.ViewAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 19)
	void DownloadAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download -AOA ");
		
		Methods.DownloadAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 20)
	void DocumentDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete - AOA ");
		
		Methods.DeleteAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 21)
	void WithoutDocumentAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type AOA - Without Document ");
		
		Methods.WithoutDocumentAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 22)
	void DocumentsADDCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting COI ");
		
		Methods.DocumentsADDCOI(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 23)
	void WithoutDocumentCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type COI - Without Document ");
		
		Methods.WithoutDocumentCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
/*	
	@Test(priority = 24)
	void DocumentsADDCOIExisting() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -COI - with existing data ");
		
		Methods.DocumentsADDCOIExisting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 25)
	void ViewCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-View - COI");
		
		Methods.ViewCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 26)
	void DownloadCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download -COI ");
		
		Methods.DownloadCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 27)
	void DeleteCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete - COI ");
		
		Methods.DeleteCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 28)
	void DocumentsADDPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Policy ");
		
		Methods.DocumentsADDPolicy(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 29)
	void WithoutDocumentPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type Policy - Without Document ");
		
		Methods.WithoutDocumentPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 30)
	void DocumentsADDPolicyAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Policy - with existing data ");
		
		Methods.DocumentsADDPolicyAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 31)
	void ViewPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents- Policies -View ");
		
		Methods.ViewPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 32)
	void DownloadCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Policies -Download  ");
		
		Methods.DownloadPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 33)
	void DeletePolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Policies - Delete  ");
		
		Methods.DeletePolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	*/
//	@Test(priority = 34)
	void DocumentsADDLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration  ");
		
		Methods.DocumentsADDLicenseRegi(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 35)
	void DocumentsADDLicenseRegiInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration :- Invalid data ");
		
		Methods.DocumentsADDLicenseRegiInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 36)//start
	void WithoutDocumentLicense() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
		
		Methods.WithoutDocumentLicense(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 37)
	void DocumentsADDLicenseRegiED() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Licence/Registration  - with existing data ");
		
		Methods.DocumentsADDLicenseRegiED(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 38)
	void ViewLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents- LICENSE_REGISTRATION -View ");
		
		Methods.ViewLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 39)
	void DownloadLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-LICENSE_REGISTRATION -Download  ");
		
		Methods.DownloadLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 40)
	void DeleteLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-LICENSE_REGISTRATION - Delete  ");
		
		Methods.DeleteLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority = 41)
	void DocumentsADDAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting  Annual Report ");
		
		Methods.DocumentsADDAnnualReport(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 42)
	void DocumentsADDAnnualReportED() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Annual Reportn  - with existing data ");
		
		Methods.DocumentsADDAnnualReportED(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 43)
	void DocumentsADDAnnualReportWD() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Annual Report :- Without Document ");
		
		Methods.DocumentsADDAnnualReportWD(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 44)
	void ViewAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents- Annual report -View ");
		
		Methods.ViewAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 45)
	void DownloadAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Annual report -Download  ");
		
		Methods.DownloadAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 46)
	void DeleteAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Annual report - Delete  ");
		
		Methods.DeleteAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 47)
	void DocumentsADDClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Close   ");
		
		Methods.DocumentsADDClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 48)
	void BranchDetailsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details   ");
		
		Methods.BranchDetailsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	//@Test(priority = 14)
	void BankDetailAddnew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New  ");
		
		Methods.BankDetailAddnew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

	
	//@Test(priority = 15)
	void BankDetailInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add Bank details with Invalid data  ");
		
		Methods.BankDetailInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 16)
	void BankDetailInvalidSC() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add bank details with Special charecter");
		
		Methods.BankDetailInvalidSC(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 17)
	void WithOutBankDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details- add bank details without filling out required fields.");
		
		Methods.WithOutBankDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 18)
	void BankDetailEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details");
		
		Methods.BankDetailEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 19)
	void BankDetailEditInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Edit - Invalid Data");
		
		Methods.BankDetailEditInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 20)
	void BankDetailDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete");
		
		Methods.BankDetailDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 21)
	void BankDetailDeleteCan() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete - cancel");
		
		Methods.BankDetailDeleteCan(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 22) //not Completed
	void EntityView() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - View");
		
		Methods.EntityView(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 23) 
	void EntityMoreOption() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action");
		
		Methods.EntityMoreOption(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 24) 
	void EntityMoreOptionRC() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action");
		
		Methods.EntityMoreOptionRC(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 25) 
	void RCAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies -Add New");
		
		Methods.RCAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 26) 
	void RCSharesHeld() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies -Shares Held");
		
		Methods.RCSharesHeld(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 27) 
	void RCClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - close Button");
		
		Methods.RCClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 28) 
	void RCSearchField() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - Search Field");
		
		Methods.RCSearchField(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 29) 
	void RCDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - Delete");
		
		Methods.RCDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
//	@Test(priority = 30) 
	void EntityMoreOption1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.EntityMoreOption1(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 31) 
	void Capital() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.Capital(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 32) //not completed
	void CapitalA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.CapitalA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 33) //not completed
	void PreferenceShareCapital() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.PreferenceShareCapital(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 34) 
	void ApplicabilityClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Applicability");
		
		Methods.ApplicabilityClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 35) //not completed
	void Applicability() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Applicability");
		
		Methods.Applicability(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 36) //not completed
	void ApplicabilityClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Applicability");
		
		Methods.ApplicabilityClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 37) 
	void Shareholding() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Shareholding");
		
		Methods.Shareholding(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 38) 
	void Shareholdingnew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Shareholding");
		
		Methods.Shareholdingnew(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

//	@Test(priority = 40) 
	void ShareholdingValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Shareholding -Enter two mandatory fields");
		
		Methods.ShareholdingValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 41) 
	void ShareholdingValidationEmpty() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Shareholding - 'New' tab with empty field");
		
		Methods.ShareholdingValidationEmpty(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
}
