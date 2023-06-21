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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import secretrial.DirectorMethod;

public class DirectorTest {

	
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
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
	
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);	

	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"Compnay Secretory");		//Method of Login class to login user.
		
	}
	
//	@Test(priority = 1) //20/06/2023
	void DirectorClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - clickable or not Verification  ");
		
		DirectorMethod.DirectorClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 2) 
	void DirectorAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - With Valid Data  ");
		
		DirectorMethod.DirectorAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 3) 
	void DirectorAddNewAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - With already exists Data  ");
		
		DirectorMethod.DirectorAddNewAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4) 
	void DirectorAddNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - Close ");
		
		DirectorMethod.DirectorAddNewClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5) 
	void DirectorEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - With Valid Data ");
		
		DirectorMethod.DirectorEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 6) 
	void DirectorEditBlank() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - Leave one or more required fields blank ");
		
		DirectorMethod.DirectorEditBlank(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 7) 
	void DirectorEditClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - Close ");
		
		DirectorMethod.DirectorEditClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 8) 
	void DirectorLOR() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' option is clickable or not");
		
		DirectorMethod.DirectorLOR(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(1000);
  		driver.close();
  	}	       
  		       		
  	@AfterTest
  	void Closing() throws InterruptedException
  	{
  		
  	}
}
