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
	
	
	//@Test(priority = 9) //28/06/2023
	void DirectorLORAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -HUF - with valid data");
		
		DirectorMethod.DirectorLORAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 10) 
	void DirectorLORAddNewAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- HUF - with the same details as an existing entry");
		
		DirectorMethod.DirectorLORAddNewAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 11) 
	void DirectorLORAddNewEmpty() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -HUF - without entering data");
		
		DirectorMethod.DirectorLORAddNewEmpty(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 12) 
	void DirectorLORAddNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- HUF -'Close' button is clickable or Not verification.");
		
		DirectorMethod.DirectorLORAddNewClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 13) 
	void DirectorLORAddNewSpo() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Spouse - with valid data");
		
		DirectorMethod.DirectorLORAddNewSpo(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 14) 
	void DirectorLORAddNewSpoAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Spouse - with the same details as an existing entry");
		
		DirectorMethod.DirectorLORAddNewSpoAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 15) 
		void DirectorLORAddNewSpoEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Spouse - without entering data");
			
			DirectorMethod.DirectorLORAddNewSpoEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
//		@Test(priority = 16) 
		void DirectorLORAddNewCloseSpo() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Spouse -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseSpo(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	//	@Test(priority = 17) 
		void DirectorLORAddNewFather() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Father - with valid data");
			
			DirectorMethod.DirectorLORAddNewFather(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 18) 
		void DirectorLORAddNewFatherAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Father - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewFatherAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
	//	@Test(priority = 19) 
		void DirectorLORAddNewFathEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Father - without entering data");
			
			DirectorMethod.DirectorLORAddNewFathEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 20) 
		void DirectorLORAddNewCloseFath() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Father -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseFath(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	//	@Test(priority = 21) 
		void DirectorLORAddNewMother() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Mother - with valid data");
			
			DirectorMethod.DirectorLORAddNewMother(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 22) 
		void DirectorLORAddNewMotherAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Mother - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewMotherAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 23) 
		void DirectorLORAddNewMothEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Mother - without entering data");
			
			DirectorMethod.DirectorLORAddNewMothEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 24) 
		void DirectorLORAddNewCloseMoth() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Mother -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseMoth(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 25) 
		void DirectorLORAddNewSon() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - with valid data");
			
			DirectorMethod.DirectorLORAddNewSon(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 26) 
		void DirectorLORAddNewSonAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewSonAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		//@Test(priority = 27) 
			void DirectorLORAddNewEmptySon() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptySon(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 28) 
			void DirectorLORAddNewCloseSon() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseSon(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 29) //29/06/2023
			void DirectorLORAddNewDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Daughter - with valid data");
				
				DirectorMethod.DirectorLORAddNewDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
		//	@Test(priority = 30) 
			void DirectorLORAddNewDaughterAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Daughter - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewDaughterAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 31) 
			void DirectorLORAddNewEmptyDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptyDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 32) 
			void DirectorLORAddNewCloseDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 33) 
			void DirectorLORAddNewBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Brother - with valid data");
				
				DirectorMethod.DirectorLORAddNewBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
		//	@Test(priority = 34) 
			void DirectorLORAddNewBrotherAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Brother - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewBrotherAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
	//		@Test(priority = 35) 
			void DirectorLORAddNewEmptyBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Brother - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptyBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 36) 
			void DirectorLORAddNewCloseBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Brother -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 37) 
			void DirectorLORAddNewSister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Sister - with valid data");
				
				DirectorMethod.DirectorLORAddNewSister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
		//	@Test(priority = 38) 
			void DirectorLORAddNewSisterAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Sister - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewSisterAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 39) 
			void DirectorLORAddNewEmptySister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Sister - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptySister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 40) 
			void DirectorLORAddNewCloseSister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Sister -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseSister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 41) 
			void DirectorLOREdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Edit - with valid data");
				
				DirectorMethod.DirectorLOREdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 42) 
			void DirectorLOREditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Edit - Close");
				
				DirectorMethod.DirectorLOREditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 43) 
			void DirectorLORDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Delete");
				
				DirectorMethod.DirectorLORDelete(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 44) 
			void DirectorLORDeleteCan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Delete -Cancel");
				
				DirectorMethod.DirectorLORDeleteCan(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 45) 
			void DirectorLORipp() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Items per page - Displayed or not Verification");
				
				DirectorMethod.DirectorLORipp(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 46)//30/06/2023 
			void DirectorDOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details Of Interest' option is clickable or not");
				
				DirectorMethod.DirectorDOI(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 47)
			void DirectorDOCP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' option is clickable or not");
				
				DirectorMethod.DirectorDOCP(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 48)
			void DirectorDOCPAddNew() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New - With Valid Data");
				
				DirectorMethod.DirectorDOCPAddNew(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 49)
			void DirectorDOCPAddNewVal() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -without providing all the required information.");
				
				DirectorMethod.DirectorDOCPAddNewVal(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 50)
			void DirectorDOCPAddNewEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -without filling data.");
				
				DirectorMethod.DirectorDOCPAddNewEmpty(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 51)
			void DirectorDOCPAddNewAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -  with the same details as an existing entry");
				
				DirectorMethod.DirectorDOCPAddNewAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			
		//	@Test(priority = 52)
			void DirectorDOCPAddNewClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -  Close");
				
				DirectorMethod.DirectorDOCPAddNewClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 53)
			void DirectorDOCPEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit");
				
				DirectorMethod.DirectorDOCPEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 54)
			void DirectorDOCPEditBlank() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit -Leave one  required fields blank. ");
				
				DirectorMethod.DirectorDOCPEditBlank(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 55)
			void DirectorDOCPEditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit - Close ");
				
				DirectorMethod.DirectorDOCPEditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 56)
			void DirectorDOCPDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Delete ");
				
				DirectorMethod.DirectorDOCPDelete(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 57)
			void DirectorSD() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' option is clickable or not");
				
				DirectorMethod.DirectorSD(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 58) //03/07/2023
			void DirectorSDEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' - Edit- with Valid Data");
				
				DirectorMethod.DirectorSDEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 59) 
			void DirectorSDclose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' - Edit- Close");
				
				DirectorMethod.DirectorSDclose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 60)
			void DirectorProfile() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Profile' option is clickable or not");
				
				DirectorMethod.DirectorProfile(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 61)
			void DirectorProfileAdd() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Profile' - Add");
				
				DirectorMethod.DirectorProfileAdd(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 62)
			void DirectorDIR8() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'DIR-8' option is clickable or not");
				
				DirectorMethod.DirectorDIR8(driver,test,workbook);
				
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
