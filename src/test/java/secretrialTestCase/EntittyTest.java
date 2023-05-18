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
	
	
	@Test(priority = 3)
	void AddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New ");
		
		Methods.BusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
@Test(priority = 4)
	void validationofsave() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New - To check validation of save button without entering a data");
		
		Methods.validationofsave(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 5)
	void validationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit");
		
		Methods.validationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6)
	void CheckInvaliddata() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit - Check Invalid Data");
		
		Methods.CheckInvaliddata(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 7)
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
	}
	
	@Test(priority = 8)
	void BusinessActivityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
		
		Methods.BusinessActivityValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 9)
	void DocumentClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents ");
		
		Methods.DocumentClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 10)
	void DocumentsADDMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting MOA");
		
		Methods.DocumentsADDMOA(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11)
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
	void DownloadPolicy() throws InterruptedException, IOException
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
	
//	@Test(priority = 36)
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
	
//	@Test(priority = 49)
	void AddNewBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New -With Valid Data  ");
		
		Methods.AddNewBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 50)
	void AddNewBranchDetailsinvalidData() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New - With Invalid Data ");
		
		Methods.AddNewBranchDetailsinvalidData(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 51)
	void AddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New - With 2 Mandatory field ");
		
		Methods.AddNewBranchDetailsMandatoryfield(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 52)
	void AddNewBranchDetailsWithOutData() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New - WithOut Data ");
		
		Methods.AddNewBranchDetailsWithOutData(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 53)
	void EditBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Edit ");
		
		Methods.EditBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 54)
	void UploadBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document -With Valid Extention ");
		
		Methods.UploadBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 55)
	void UploadBranchDetailsInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With Invalid Extention  ");
		
		Methods.UploadBranchDetailsInvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 56)
	void UploadBranchDetailsMulvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
		
		Methods.UploadBranchDetailsMulvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 57)
	void UploadBranchDetailsMulInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
		
		Methods.UploadBranchDetailsMulInvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 58)//19/04/2023
	void UploadBranchDetailsWF() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - WithOut Document  ");
		
		Methods.UploadBranchDetailsWF(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 59)
	void AddNewBranchDetailsClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New -Close  ");
		
		Methods.AddNewBranchDetailsClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 60)
	void BankDetailsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details  ");
		
		Methods.BankDetailsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 61)
	void BankDetailAddnew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New -with valid data ");
		
		Methods.BankDetailAddnew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

//	@Test(priority = 62)
	void BankDetailInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid account number  ");
		
		Methods.BankDetailInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 63)
	void BankDetailInvalidBName() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid Bank Name  ");
		
		Methods.BankDetailInvalidBName(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 64)
	void BankDetailInvalidIFC() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid IFSC ");
		
		Methods.BankDetailInvalidIFC(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 65)
	void WithOutBankDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details- add bank details without filling out required fields.");
		
		Methods.WithOutBankDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 66)
	void BankDetailEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Edit");
		
		Methods.BankDetailEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 67)
	void BankDetailEditInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Edit - Invalid Data");
		
		Methods.BankDetailEditInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 68)
	void BankDetailDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete");
		
		Methods.BankDetailDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 69)
	void BankDetailDeleteCan() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete - cancel");
		
		Methods.BankDetailDeleteCan(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 70) //20/04/2023  //not complete
		void EntityView() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - View");
			
			Methods.EntityView(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
//   ----------------------------------   Public Limited   -------------------------------------------
	
//	@Test(priority = 71) 
	void PublicLimitedSelect() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited");
			
			Methods.PublicLimitedSelect(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 72) 
	void PublicLimitedAdd() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited -With Valid Data");
			
			Methods.PublicLimitedAdd(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 73) 
	void PublicLimitedAddInvalid() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - -With Invalid Data");
			
			Methods.PublicLimitedAddInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 74) 
	void PublicLimitedAddWith2man() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - -With two mandatory fields");
			
			Methods.PublicLimitedAddWith2man(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 75) 
	void PublicLimitedAddWithoutdata() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - -withOut Data");
			
			Methods.PublicLimitedAddWithoutdata(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 76) 
	void PublicLimitedAddClose() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - Close");
			
			Methods.PublicLimitedAddClose(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 77) 
	void PublicLimitedEdit() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit");
			
			Methods.PublicLimitedEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 78) 
	void PublicLimitedEditInvalid() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit-with Invalid Name");
			
			Methods.PublicLimitedEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 79) 
	void PublicLimitedEditClose() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit- Close Button");
			
			Methods.PublicLimitedEditClose(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 80) //  21/04/2023
	void PLBusinessActivityClick() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit-Business Activity ");
			
			Methods.PLBusinessActivityClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 81)
	void PLBusinessActivity() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit-Business Activity - Add New ");
			
			Methods.PLBusinessActivity(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	
//	@Test(priority = 82)
	void PLBusinessActivityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Public Limited - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
		
		Methods.PLBusinessActivityValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 83)
	void PLvalidationofsave() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Business Activity -Add New - To check validation of save button without entering a data");
		
		Methods.PLvalidationofsave(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 84)
	void PLvalidationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Business Activity -Edit - With Valid Data");
		
		Methods.PLvalidationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 85)
	void PLCheckInvaliddata() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited -Edit- Business Activity -Edit -With Invalid Data");
		
		Methods.PLCheckInvaliddata(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 86)
	void PLDeleteBusinessActivity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Business Activity - Delete");
		
		Methods.PLDeleteBusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 87)
	void PLBusinessActivityADDNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Business Activity - Add New -Close");
		
		Methods.PLBusinessActivityADDNewClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 88)
	void PLDocumentClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents ");
		
		Methods.PLDocumentClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 89)
	void PLDocumentsADDMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting MOA");
		
		Methods.PLDocumentsADDMOA(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 90)
	void PLWithoutDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -Type MOA - Without Document ");
		
		Methods.PLWithoutDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 91)
	void PLDocumentsADDMOAAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - with existing data ");
		
		Methods.PLDocumentsADDMOAAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 92)
	void PLViewMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-view-MOA ");
		
		Methods.PLViewMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 93)
	void PLDownloadMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Public Limited -Edit - Documents-Download - MOA ");
		
		Methods.PLDownloadMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

//	@Test(priority = 94) //  24/04/2023
	void PLDeleteMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - MOA ");
		
		Methods.PLDeleteMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
//	@Test(priority = 95)
		void PLDocumentsADD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Selecting AOA");
			
			Methods.PLDocumentsADD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 96)
		void PLWithoutDocumentAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -Type AOA - Without Document ");
			
			Methods.PLWithoutDocumentAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 97)
		void PLDocumentsADDExisting() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -AOA - with existing data ");
			
			Methods.PLDocumentsADDExisting(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 98)
		void PLViewAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-View - AOA");
			
			Methods.PLViewAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 99)
		void PLDownloadAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Download -AOA ");
			
			Methods.PLDownloadAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 100)
		void PLDeleteAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - AOA ");
			
			Methods.PLDeleteAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 101)
		void PLDocumentsADDCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Selecting COI ");
			
			Methods.PLDocumentsADDCOI(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
			
	//	@Test(priority = 102)
		void PLWithoutDocumentCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Type COI - Without Document ");
			
			Methods.PLWithoutDocumentCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 103)
		void PLDocumentsADDCOIExisting() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -COI - with existing data ");
			
			Methods.PLDocumentsADDCOIExisting(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	/*
		@Test(priority = 104)
		void PLViewCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited -Edit - Documents-View - COI");
			
			Methods.PLViewCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 105)
		void PLDownloadCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Download -COI ");
			
			Methods.PLDownloadCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 106)
		void PLDeleteCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - COI ");
			
			Methods.PLDeleteCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 107)
		void PLDocumentsADDPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Policy ");
			
			Methods.PLDocumentsADDPolicy(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
    	@Test(priority = 108)
		void PLWithoutDocumentPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Type Policy - Without Document ");
			
			Methods.PLWithoutDocumentPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 109)
		void PLDocumentsADDPolicyAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Policy - with existing data ");
			
			Methods.PLDocumentsADDPolicyAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		@Test(priority = 110)
		void PLViewPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited  - Edit - Documents- Policies -View ");
			
			Methods.PLViewPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 111)
		void PLDownloadPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Policies -Download  ");
			
			Methods.PLDownloadPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 112)
		void PLDeletePolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Policies - Delete  ");
			
			Methods.PLDeletePolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 113)
		void PLDocumentsADDLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration  ");
			
			Methods.PLDocumentsADDLicenseRegi(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 114) // 25/04/2023
		void PLDocumentsADDLicenseRegiInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration :- Invalid data ");
			
			Methods.PLDocumentsADDLicenseRegiInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 115)
		void PLWithoutDocumentLicense() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
			
			Methods.PLWithoutDocumentLicense(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 116)
		void PLDocumentsADDLicenseRegiED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Licence/Registration  - with existing data ");
			
			Methods.PLDocumentsADDLicenseRegiED(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 117)
		void PLViewLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited -Edit - Documents- LICENSE_REGISTRATION -View ");
			
			Methods.PLViewLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 118)
		void PLDownloadLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-LICENSE_REGISTRATION -Download  ");
			
			Methods.PLDownloadLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 119)
		void PlDeleteLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-LICENSE_REGISTRATION - Delete  ");
			
			Methods.PlDeleteLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 120)
		void PLDocumentsADDAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting  Annual Report ");
			
			Methods.PLDocumentsADDAnnualReport(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 121)
		void PLDocumentsADDAnnualReportED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Annual Reportn  - with existing data ");
			
			Methods.PLDocumentsADDAnnualReportED(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 122)
		void PlDocumentsADDAnnualReportWD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Annual Report :- Without Document ");
			
			Methods.PlDocumentsADDAnnualReportWD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 123)
		void PLViewAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents- Annual report -View ");
			
			Methods.PLViewAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 124)
		void PLDownloadAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Annual report -Download  ");
			
			Methods.PLDownloadAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 125)
		void PLDeleteAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Annual report - Delete  ");
			
			Methods.PLDeleteAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 126)
		void PLBranchDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details   ");
			
			Methods.PLBranchDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 127)
		void PLAddNewBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New -With Valid Data  ");
			
			Methods.PLAddNewBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 128)
		void PLAddNewBranchDetailsinvalidData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New - With Invalid Data ");
			
			Methods.PLAddNewBranchDetailsinvalidData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 129)
		void PLAddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New - With 2 Mandatory field ");
			
			Methods.PLAddNewBranchDetailsMandatoryfield(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 130)
		void PLAddNewBranchDetailsWithOutData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Add New - WithOut Data ");
			
			Methods.PLAddNewBranchDetailsWithOutData(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	   @Test(priority = 131)
		void PLEditBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Edit ");
			
			Methods.PLEditBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 132) // 26/04/2023
		void PLUploadBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited  - Edit - Branch Details - Upload Document -With Valid Extention ");
			
			Methods.PLUploadBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 133)
		void PLUploadBranchDetailsInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited  - Edit - Branch Details - Upload Document - With Invalid Extention  ");
			
			Methods.PLUploadBranchDetailsInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 134)
		void PLUploadBranchDetailsMulvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
			
			Methods.PLUploadBranchDetailsMulvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 135)
		void PLUploadBranchDetailsMulInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
			
			Methods.PLUploadBranchDetailsMulInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 136)
		void PLUploadBranchDetailsWF() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Upload Document - WithOut Document  ");
			
			Methods.PLUploadBranchDetailsWF(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 137)
		void PLAddNewBranchDetailsClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Add New -Close  ");
			
			Methods.PLAddNewBranchDetailsClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 138)
		void PLBankDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details  ");
			
			Methods.PLBankDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 139)
		void PLBankDetailAddnew() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Bank Details-Add New -with valid data ");
			
			Methods.PLBankDetailAddnew(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}

		@Test(priority = 140)
		void PLBankDetailInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Public Limited - Edit - Bank Details-Add New - with Invalid account number  ");
			
			Methods.PLBankDetailInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 141)
		void PLBankDetailInvalidBName() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details-Add New - with Invalid Bank Name  ");
			
			Methods.PLBankDetailInvalidBName(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 142)
		void PLBankDetailInvalidIFC() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details-Add New - with Invalid IFSC ");
			
			Methods.PLBankDetailInvalidIFC(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 143)
		void PLWithOutBankDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details- add bank details without filling out required fields.");
			
			Methods.PLWithOutBankDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 144)
		void PLBankDetailEdit() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Edit");
			
			Methods.PLBankDetailEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 145)
		void PLBankDetailEditInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Edit - Invalid Data");
			
			Methods.PLBankDetailEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 146)
		void PLBankDetailDeleteCan() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Delete - cancel");
			
			Methods.PLBankDetailDeleteCan(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 147)
		void PLBankDetailDelete() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Delete");
			
			Methods.PLBankDetailDelete(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		*/
		
	//   ----------------------------------   Listed Company   -------------------------------------------
		/*
		@Test(priority = 148) 
		void ListedCompanySelect() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New -  Listed Company ");
				
				Methods.ListedCompanySelect(driver,test);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 149) 
		void ListedCompanyAdd() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New -Listed Company -With Valid Data");
				
				Methods.ListedCompanyAdd(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 150) 
		void ListedCompanyAddInvalid() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company- -With Invalid Data");
				
				Methods.ListedCompanyAddInvalid(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 151) 
		void ListedCompanyAddWith2man() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company - With two mandatory fields");
				
				Methods.ListedCompanyAddWith2man(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 152) 
		void ListedCompanyAddWithoutdata() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company - -withOut Data");
				
				Methods.ListedCompanyAddWithoutdata(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 153) 
		void ListedCompanyAddClose() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company - Close");
				
				Methods.ListedCompanyAddClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
	//	@Test(priority = 154) 
		void ListedCompanyEdit() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company -Edit");
				
				Methods.ListedCompanyEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
	
	//	@Test(priority = 155) 
		void ListedCompanyEditInvalid() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company  -Edit-with Invalid Name");
				
				Methods.ListedCompanyEditInvalid(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 156) 
		void ListedCompanyEditClose() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company -Edit- Close Button");
				
				Methods.ListedCompanyEditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority =157 ) 
		void LCBusinessActivityClick() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company -Edit-Business Activity ");
				
				Methods.LCBusinessActivityClick(driver,test);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 158)
		void LCBusinessActivity() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity -  Listed Company  -Edit-Business Activity - Add New ");
				
				Methods.LCBusinessActivity(driver,test);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 159)
		void LCBusinessActivityValidation() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
			
			Methods.LCBusinessActivityValidation(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 160)
		void LCvalidationofsave() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company- Edit - Business Activity -Add New - To check validation of save button without entering a data");
			
			Methods.LCvalidationofsave(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 161)
		void LCvalidationofedit() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Business Activity -Edit - With Valid Data");
			
			Methods.LCvalidationofedit(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 162)
		void LCCheckInvaliddata() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company -Edit- Business Activity -Edit -With Invalid Data");
			
			Methods.LCCheckInvaliddata(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 163)
		void LCDeleteBusinessActivity() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Business Activity - Delete");
			
			Methods.LCDeleteBusinessActivity(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 164)
		void LCBusinessActivityADDNewClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Business Activity - Add New -Close");
			
			Methods.LCBusinessActivityADDNewClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 165)
		void LCDocumentClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents ");
			
			Methods.LCDocumentClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 166)
		void LCDocumentsADDMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting MOA");
			
			Methods.LCDocumentsADDMOA(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 167)
		void LCWithoutDocument() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New -Type MOA - Without Document ");
			
			Methods.LCWithoutDocument(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 168)
		void LCDocumentsADDMOAAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - with existing data ");
			
			Methods.LCDocumentsADDMOAAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 169)
		void LCViewMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-view-MOA ");
			
			Methods.LCViewMOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 170)
		void LCDownloadMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company -Edit - Documents-Download - MOA ");
			
			Methods.LCDownloadMOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}*/
		/*
		@Test(priority = 171) 
		void LCDeleteMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Delete - MOA ");
			
			Methods.LCDeleteMOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
		
		@Test(priority = 172)  //28/04/2023
		void LCDocumentsADD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting AOA");
			
			Methods.LCDocumentsADD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	    @Test(priority = 173)
		void LCWithoutDocumentAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Type AOA - Without Document ");
			
			Methods.LCWithoutDocumentAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 174)
		void LCDocumentsADDExisting() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New -AOA - with existing data ");
			
			Methods.LCDocumentsADDExisting(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 175)
		void LCViewAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company - Edit - Documents-View - AOA");
			
			Methods.LCViewAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 176)
		void LCDownloadAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Download -AOA ");
			
			Methods.LCDownloadAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 177)
		void LCDeleteAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company - Edit - Documents-Delete - AOA ");
			
			Methods.LCDeleteAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 178)
			void LCDocumentsADDCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New - Selecting COI ");
				
				Methods.LCDocumentsADDCOI(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
				
	     	@Test(priority = 179)
			void LCWithoutDocumentCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New -Type COI - Without Document ");
				
				Methods.LCWithoutDocumentCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}	
		
			@Test(priority = 180)
			void LCDocumentsADDCOIExisting() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -COI - with existing data ");
				
				Methods.LCDocumentsADDCOIExisting(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
		
			@Test(priority = 181)
			void LCViewCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company -Edit - Documents-View - COI");
				
				Methods.LCViewCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 182)
			void LCDownloadCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company - Edit - Documents-Download -COI ");
				
				Methods.LCDownloadCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 183)
			void LCDeleteCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company- Edit - Documents-Delete - COI ");
				
				Methods.LCDeleteCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
		
		@Test(priority = 184)
		void LCDocumentsADDPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting Policy ");
			
			Methods.LCDocumentsADDPolicy(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
    	@Test(priority = 185)
		void LCWithoutDocumentPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Type Policy - Without Document ");
			
			Methods.LCWithoutDocumentPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 186)  // 02/05/2023
		void LCDocumentsADDPolicyAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Policy - with existing data ");
			
			Methods.LCDocumentsADDPolicyAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 187)
		void LCViewPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Documents- Policies -View ");
			
			Methods.LCViewPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 188)
		void LCDownloadPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Policies -Download  ");
			
			Methods.LCDownloadPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 189)
		void LCDeletePolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Policies - Delete  ");
			
			Methods.LCDeletePolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 190)
		void LCDocumentsADDLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting Licence/Registration  ");
			
			Methods.LCDocumentsADDLicenseRegi(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 191) 
		void LCDocumentsADDLicenseRegiInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting Licence/Registration :- Invalid data ");
			
			Methods.LCDocumentsADDLicenseRegiInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 192)
		void LCWithoutDocumentLicense() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
			
			Methods.LCWithoutDocumentLicense(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 193)
		void LCDocumentsADDLicenseRegiED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Licence/Registration  - with existing data ");
			
			Methods.LCDocumentsADDLicenseRegiED(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 194)
		void LCViewLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company -Edit - Documents- LICENSE_REGISTRATION -View ");
			
			Methods.LCViewLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 195)
		void LCDownloadLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-LICENSE_REGISTRATION -Download  ");
			
			Methods.LCDownloadLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 196)
		void lCDeleteLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company- Edit - Documents-LICENSE_REGISTRATION - Delete  ");
			
			Methods.lCDeleteLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		
		@Test(priority = 197)
		void LCDocumentsADDAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting  Annual Report ");
			
			Methods.LCDocumentsADDAnnualReport(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 198)
		void LCDocumentsADDAnnualReportED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Annual Reportn  - with existing data ");
			
			Methods.LCDocumentsADDAnnualReportED(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 199)
		void lCDocumentsADDAnnualReportWD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company- Edit - Documents-Add New - Annual Report :- Without Document ");
			
			Methods.lCDocumentsADDAnnualReportWD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 200)
		void LCViewAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents- Annual report -View ");
			
			Methods.LCViewAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 201)
		void LCDownloadAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Annual report -Download  ");
			
			Methods.LCDownloadAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 202)
		void LCDeleteAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Annual report - Delete  ");
			
			Methods.LCDeleteAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 203)
		void LCBranchDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Branch Details  ");
			
			Methods.LCBranchDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 204)
		void LCAddNewBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Branch Details - Add New -With Valid Data  ");
			
			Methods.LCAddNewBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 205)
		void LCAddNewBranchDetailsinvalidData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - With Invalid Data ");
			
			Methods.LCAddNewBranchDetailsinvalidData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 206)
		void LCAddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - With 2 Mandatory field ");
			
			Methods.LCAddNewBranchDetailsMandatoryfield(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 207) //03/05/2023
		void LCAddNewBranchDetailsWithOutData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - WithOut Data ");
			
			Methods.LCAddNewBranchDetailsWithOutData(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	   @Test(priority = 208)
		void LCEditBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Edit ");
			
			Methods.LCEditBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 209) 
		void LCUploadBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company   - Edit - Branch Details - Upload Document -With Valid Extention ");
			
			Methods.LCUploadBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 210)
		void LCUploadBranchDetailsInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company   - Edit - Branch Details - Upload Document - With Invalid Extention  ");
			
			Methods.LCUploadBranchDetailsInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 211)
		void LCUploadBranchDetailsMulvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
			
			Methods.LCUploadBranchDetailsMulvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 212)
		void LCUploadBranchDetailsMulInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
			
			Methods.LCUploadBranchDetailsMulInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 213)
		void LCUploadBranchDetailsWF() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Upload Document - WithOut Document  ");
			
			Methods.LCUploadBranchDetailsWF(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 214)
		void LCAddNewBranchDetailsClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Add New -Close  ");
			
			Methods.LCAddNewBranchDetailsClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority =215 )
		void LCBankDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details  ");
			
			Methods.LCBankDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 216)
		void LCBankDetailAddnew() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New -with valid data ");
			
			Methods.LCBankDetailAddnew(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 217)
		void LCBankDetailInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company- Edit - Bank Details-Add New - with Invalid account number  ");
			
			Methods.LCBankDetailInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 218)
		void LCBankDetailInvalidBName() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New - with Invalid Bank Name  ");
			
			Methods.LCBankDetailInvalidBName(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 219)
		void PLBankDetailInvalidIFC() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New - with Invalid IFSC ");
			
			Methods.LCBankDetailInvalidIFC(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 220)
		void LCWithOutBankDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details- add bank details without filling out required fields.");
			
			Methods.LCWithOutBankDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 221)
		void LCBankDetailEdit() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Edit");
			
			Methods.LCBankDetailEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 222)
		void LCBankDetailEditInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Edit - Invalid Data");
			
			Methods.LCBankDetailEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 223)
		void LCBankDetailDeleteCan() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Delete - cancel");
			
			Methods.LCBankDetailDeleteCan(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 224)
		void LCBankDetailDelete() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Bank Details -Delete");
			
			Methods.LCBankDetailDelete(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	/*	//--------------------------'More Action'- 'Related Companies'-------------------------
		 
		@Test(priority = 225) // 04/05/2023
		void EntityMoreOption() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action");
			
			Methods.EntityMoreOption(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
	@Test(priority = 226) 
	void RCAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies -Add New");
		
		Methods.RCAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 227) 
	void RCSharesHeld() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies -Shares Held");
		
		Methods.RCSharesHeld(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 228) 
	void RCClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - close Button");
		
		Methods.RCClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 229) 
	void RCSearchField() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - Search - with Valid Data");
		
		Methods.RCSearchField(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 230) 
		void RCSearchFieldINvalidData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action -Related Companies - Search - with InValid Data");
			
			Methods.RCSearchFieldINvalidData(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	@Test(priority = 231) 
	void RCDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - Delete");
		
		Methods.RCDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	//--------------------------'More Action'- 'Capital'-------------------------
	
	@Test(priority = 232) 
	void EntityMoreOption1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.EntityMoreOption1(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 233) 
	void Capital() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.Capital(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
		
		//--------------------------'More Action'- 'Shareholding'-------------------------
		
		@Test(priority = 234) 
		void Shareholding() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding");
			
			Methods.Shareholding(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 235) 
		void Shareholdingnew() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - New");
			
			Methods.Shareholdingnew(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 236) 
		void ShareholdingInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - New -with Invalid data");
			
			Methods.ShareholdingInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 237) 
		void ShareholdingValidation() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding -Enter two mandatory fields");
			
			Methods.ShareholdingValidation(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 238) 
		void ShareholdingValidationEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - 'New' tab with empty field");
			
			Methods.ShareholdingValidationEmpty(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		
		@Test(priority = 239) 
		void ShareholdingnewClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - 'New' tab - Close");
			
			Methods.ShareholdingnewClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		*/
		
		//--------------------------'More Action'- 'Debenture Holding'-------------------------
		
			//	@Test(priority = 240) //16/05/2023
				void Shareholding() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding");
					
					Methods.DebentureHolding(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 241) 
				void DebentureHoldingSearch() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Search-With Valid data");
					
					Methods.DebentureHoldingSearch(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 242) 
				void DebentureHoldingSearchInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Search-With InValid data");
					
					Methods.DebentureHoldingSearchInvalid(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 243) 
				void ClassAllDS() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All");
					
					Methods.ClassAllDS(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 244) 
				void ClassAllNCD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -NCD");
					
					Methods.ClassAllNCD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 245) 
				void ClassAllPCD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -PCD");
					
					Methods.ClassAllPCD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 246) 
				void ClassAllFCD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -FCD");
					
					Methods.ClassAllFCD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 247) 
				void ClearFilter() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Clear Filter");
					
					Methods.ClearFilter(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 248) 
				void AddNewDH() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -with Valid Data");
					
					Methods.AddNewDH(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
		//		@Test(priority = 249) 
				void AddNewDHTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with Two mandatory field");
					
					Methods.AddNewDHTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 250) //17/05/2023
				void AddNewInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with invalid Data");
					
					Methods.AddNewInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 251)
				void AddNewDHEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with empty File");
					
					Methods.AddNewDHEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 252)
				void AddNewClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - Close");
					
					Methods.AddNewClose(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 253) 
				void DHD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details");
					
					Methods.DHD(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
		//		@Test(priority = 254) 
				void DHDAddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New");
					
					Methods.DHDAddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				//@Test(priority = 255) 
				void DHDAddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New - with Empty Feilds ");
					
					Methods.DHDAddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 256) 
				void DHDAddNewClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New -Close Button ");
					
					Methods.DHDAddNewClose(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 257) //18/05/2023
				void DHDUpload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - Valid Data");
					
					Methods.DHDUpload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 258) 
				void DHDUploadED() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Existing data");
					
					Methods.DHDUploadED(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 259) 
				void DHDUploadInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Invalid data");
					
					Methods.DHDUploadInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 260) 
				void DHDUploadEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Empty File");
					
					Methods.DHDUploadEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 261) 
				void DHDUploadInvalidEx() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with invalid File type extension");
					
					Methods.DHDUploadInvalidEx(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 262) 
				void DHDUploadwithoutFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - withOut File");
					
					Methods.DHDUploadwithoutFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 263) 
				void DHUpload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with Valid Data File");
					
					Methods.DHUpload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 264) 
				void DHUploadInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with InValid Data File");
					
					Methods.DHUploadInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 265) 
				void DHUploadED() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with Existing Data ");
					
					Methods.DHUploadED(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 266) 
				void DHUploadEmptyFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with empty File ");
					
					Methods.DHUploadEmptyFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 267) 
				void DHUploadinvalidExten() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with invalid File type extension ");
					
					Methods.DHUploadinvalidExten(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 268) 
				void DHUploadWithOutFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - without File ");
					
					Methods.DHUploadWithOutFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	/*
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
	*/
	
//	@Test(priority = 16)
	void BankDetailInvalidSC() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add bank details with Special charecter");
		
		Methods.BankDetailInvalidSC(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
}
