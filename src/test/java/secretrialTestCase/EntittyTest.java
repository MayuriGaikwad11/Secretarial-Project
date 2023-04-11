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
		fis = new FileInputStream("C:\\Users\\Mayuri Gaikwad\\Desktop\\Secreterial\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Mayuri Gaikwad\\Desktop\\Secreterial\\Report\\Secretrial.html",true);
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
	
	//@Test(priority = 2)
	void AddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New ");
		
		Methods.BusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 3)
	void validationofsave() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New - To check validation of save button without entering a data");
		
		Methods.validationofsave(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4)
	void validationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit");
		
		Methods.validationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 5)
	void CheckInvaliddata() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit - Check Invalid Data");
		
		Methods.CheckInvaliddata(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 6)
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
	
//	@Test(priority = 8)
	void AddNewDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New ");
		
		Methods.DocumentsADD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 9)
	void WithoutDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Without Document ");
		
		Methods.WithoutDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 10)
	void DocumentsAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New  ");
		
		Methods.DocumentsAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 11)
	void DocumentDownload() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download  ");
		
		Methods.DocumentDownload(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 12)
	void DocumentView() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-View  ");
		
		Methods.DocumentView(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 13)
	void DocumentDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete  ");
		
		Methods.DocumentDelete(driver,test);
		
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
