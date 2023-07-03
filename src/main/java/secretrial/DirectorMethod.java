package secretrial;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DirectorMethod {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void DirectorClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		if(DirectorLocator.Director(driver).isEnabled()) {
			DirectorLocator.Director(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Directot/KMP' page ");
		}else {
			test.log(LogStatus.FAIL, " User should be redirected to the new window of 'Directot/KMP' page");
			
		}
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorAddNew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			DirectorLocator.Salutation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.SalutationMS(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(0);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(1);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(2);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.LastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Gender(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Female(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			DirectorLocator.DIN(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherFirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherMiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherLastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.PANofDirector(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		/*	row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.Adhaar(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);*/
			
			DirectorLocator.Resident(driver).click();
			Thread.sleep(1000);
			DirectorLocator.ResidentYes(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.MobileNo(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(11);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId_Official(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.DSCExpiryDate(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DSCExpiryDate1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MotherName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(7000);
			
		//	 WebElement job = driver.findElement(By.id("divDetailsNew"));
			
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
	            
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.Permenant_Address_Line1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Country(driver).click();
			Thread.sleep(1000);
			DirectorLocator.CountryIndia(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.State(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Maharastra(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.City(driver).click();
			Thread.sleep(3000);
		//	DirectorLocator.Ahmadnagar(driver).click();
			By locator = By.xpath("//*[@id='ddlPermenant_CityId_listbox']/li[3]");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			Thread.sleep(8000);
			
			DirectorLocator.permanentRadio(driver).click();
			Thread.sleep(4000);
			
			DirectorLocator.EducationalQualification(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Graduation(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Occupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Professional(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.AreaofOccupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Government(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			 try {
			String	msg1=DirectorLocator.SaveMsg(driver).getText();
			Thread.sleep(4000);
			test.log(LogStatus.PASS,  msg1);
			Thread.sleep(4000);
			 act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
			DirectorLocator.Close1(driver).click();
			Thread.sleep(4000);
			 }catch(Exception e) {
				 String	msg1=DirectorLocator.SaveMsg1(driver).getText();
					Thread.sleep(4000);
					test.log(LogStatus.PASS,   msg1);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(7000);
					DirectorLocator.Close(driver).click();
					Thread.sleep(4000);
			 }
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorAddNew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			DirectorLocator.Salutation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.SalutationMS(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(0);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(1);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(2);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.LastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Gender(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Female(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			DirectorLocator.DIN(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherFirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherMiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherLastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.PANofDirector(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		/*	row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.Adhaar(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);*/
			
			DirectorLocator.Resident(driver).click();
			Thread.sleep(1000);
			DirectorLocator.ResidentYes(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.MobileNo(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(11);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId_Official(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.DSCExpiryDate(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DSCExpiryDate1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MotherName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(7000);
			
		//	 WebElement job = driver.findElement(By.id("divDetailsNew"));
			
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
	            
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.Permenant_Address_Line1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Country(driver).click();
			Thread.sleep(1000);
			DirectorLocator.CountryIndia(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.State(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Maharastra(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.City(driver).click();
			Thread.sleep(3000);
		//	DirectorLocator.Ahmadnagar(driver).click();
			By locator = By.xpath("//*[@id='ddlPermenant_CityId_listbox']/li[3]");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			Thread.sleep(8000);
			
			DirectorLocator.permanentRadio(driver).click();
			Thread.sleep(4000);
			
			DirectorLocator.EducationalQualification(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Graduation(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Occupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Professional(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.AreaofOccupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Government(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			 try {
					String	msg1=DirectorLocator.SaveMsg(driver).getText();
					Thread.sleep(4000);
					test.log(LogStatus.PASS,  msg1);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(7000);
					DirectorLocator.Close1(driver).click();
					Thread.sleep(4000);
					 }catch(Exception e) {
						 String	msg1=DirectorLocator.SaveMsg1(driver).getText();
							Thread.sleep(4000);
							test.log(LogStatus.PASS,   msg1);
							Thread.sleep(4000);
							 act.sendKeys(Keys.PAGE_DOWN).build().perform();
					            Thread.sleep(7000);
							DirectorLocator.Close(driver).click();
							Thread.sleep(4000);
					 }
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorAddNew(driver).click();
			Thread.sleep(3000);
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
	            
	            if(DirectorLocator.Close(driver).isEnabled()) {
	    			DirectorLocator.Close(driver).click();
	    			Thread.sleep(1000);
	    			test.log(LogStatus.PASS, "the system should close the 'Add Director/KMP' form without adding the Director/KMP to the system ");
	    		}else {
	    			test.log(LogStatus.FAIL, " the system should not close the 'Add Director/KMP' ");
	    			
	    		}
			
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
			DirectorLocator.FirstName(driver).clear();
			Thread.sleep(3000);
			row0 = sheet.getRow(0);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Actions act =new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(7000);
			
		
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			 try {
					String	msg1=DirectorLocator.SaveMsg(driver).getText();
					Thread.sleep(4000);
					test.log(LogStatus.PASS,  msg1);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(5000);
					DirectorLocator.Close1(driver).click();
					Thread.sleep(4000);
					 }catch(Exception e) {
						 String	msg1=DirectorLocator.SaveMsg1(driver).getText();
							Thread.sleep(4000);
							test.log(LogStatus.PASS,   msg1);
							Thread.sleep(4000);
							 act.sendKeys(Keys.PAGE_DOWN).build().perform();
					            Thread.sleep(5000);
							DirectorLocator.Close(driver).click();
							Thread.sleep(4000);
					 }
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorEditBlank(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
			DirectorLocator.FirstName(driver).clear();
			Thread.sleep(3000);
			DirectorLocator.FatherLastName(driver).clear();
			Thread.sleep(3000);
			
			Actions act =new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(7000);
			
		
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			
					String	msg1=DirectorLocator.NameVal(driver).getText();
					Thread.sleep(4000);
					String	msg2=DirectorLocator.FatherLastNameVal(driver).getText();
					Thread.sleep(4000);
					test.log(LogStatus.PASS, "Message Displayed : -"+ msg1+" ,"+msg2);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(5000);
					DirectorLocator.Close1(driver).click();
					Thread.sleep(4000);
					
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
			
			
			Actions act =new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(7000);
			
		
			
		
            if(DirectorLocator.Close1(driver).isEnabled()) {
    			DirectorLocator.Close1(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "The system should close the 'Edit Director/KMP' form without adding the Director/KMP to the system ");
    		}else {
    			test.log(LogStatus.FAIL, " The system should not close the 'Edit Director/KMP' ");
    			
    		}
					
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLOR(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.ListofRelatives(driver).isEnabled()) {
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'List of relative' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'List of relative' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.HUF(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.HUF(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorLORAddNewSpo(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSpoAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
        			}catch(Exception e) {
        				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
            			Thread.sleep(3000);
            			
            				test.log(LogStatus.PASS,   msg);
            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSpoEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
        			}catch(Exception e) {
        				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
            			Thread.sleep(3000);
            			
            				test.log(LogStatus.FAIL,   msg);
            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseSpo(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewFather(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewFatherAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			
    				test.log(LogStatus.FAIL,   msg);
    			
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.PASS,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewFathEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
        			}catch(Exception e) {
        				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
            			Thread.sleep(3000);
            			
            				test.log(LogStatus.FAIL,   msg);
            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseFath(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewMother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewMotherAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			
    				test.log(LogStatus.FAIL,   msg);
    			
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.PASS,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewMothEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
        			}catch(Exception e) {
        				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
            			Thread.sleep(3000);
            			
            				test.log(LogStatus.FAIL,   msg);
            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseMoth(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSon(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSonAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptySon(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseSon(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewDaughter(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewDaughterAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptyDaughter(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseDaughter(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewBrother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewBrotherAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    		
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptyBrother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseBrother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSister(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSisterAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    		
    			
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptySister(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseSister(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLOREdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    			DirectorLocator.Name(driver).clear();
    			Thread.sleep(2000);
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Updated Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLOREditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    			DirectorLocator.Name(driver).clear();
    			Thread.sleep(2000);
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " The user should be able to cancel the editing process without saving any changes. The data should remain unchanged.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORDelete(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//*[@class='k-grid-Delete k-grid-delete hoverCircle k-grid-button'])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    		String msg=	driver.switchTo().alert().getText();
    			
    			Thread.sleep(2000);
    			test.log(LogStatus.PASS,   msg);
    			driver.switchTo().alert().accept();
    			Thread.sleep(2000);
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORDeleteCan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//*[@class='k-grid-Delete k-grid-delete hoverCircle k-grid-button'])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    		
    			driver.switchTo().alert().dismiss();
    			test.log(LogStatus.PASS, "The item should not be deleted. The confirmation prompt should be dismissed Clicking on Cancel Button.");
    			Thread.sleep(2000);
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORipp(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		
    		
    			if(DirectorLocator.itemsperpage(driver).isDisplayed()) {
    				
    				test.log(LogStatus.PASS, " The 'Items per page' option should be visible on the right corner of the page.");
    			}else {
    				test.log(LogStatus.FAIL, " The 'Items per page' option is not Visible.");
    				
    			}
    			Thread.sleep(4000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOI(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.DetailsOfInterest(driver).isEnabled()) {
    			DirectorLocator.DetailsOfInterest(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Details Of Interest' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Details Of Interest' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCP(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.DetailsofCommitteePositions(driver).isEnabled()) {
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Details of Committee Positions' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Details of Committee Positions' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPPosition1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofAppointment(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofAppointment1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofCessation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofCessation1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveMsgDOCP(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewVal(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    		
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveMsgDOCP(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Please Select Position.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.EntityNameVal(driver).getText();
    			Thread.sleep(3000);
    			String msg1 = DirectorLocator.CommitteNameVal(driver).getText();
    			Thread.sleep(3000);
    			
    				test.log(LogStatus.PASS, "Message Displayed : -" + msg+", "+msg1);
    				
    			
    			Thread.sleep(4000);
    			
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPPosition1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofAppointment(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofAppointment1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofCessation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofCessation1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveMsgDOCP(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Director already Present in Committee.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPPosition1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofAppointment(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofAppointment1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofCessation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofCessation1(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if (DirectorLocator.CloseDOCP(driver).isEnabled()) {
    				DirectorLocator.CloseDOCP(driver).click();
        			Thread.sleep(3000);
        			
    				test.log(LogStatus.PASS,   "The system should close the 'Details of committee position' form without adding the comittee position to the system");
    			} else {
    				test.log(LogStatus.FAIL, "Page not Close");
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.EditDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName2(driver).click();
    			Thread.sleep(4000);
    	
    			
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.UpdateMsgDOCP(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Update Successfully")) {
    				test.log(LogStatus.PASS, "Message Displayed :-" + msg);
    			} else {
    				test.log(LogStatus.FAIL,"Message not Displayed :-"+ msg);
    			}
    			Thread.sleep(4000);
    			
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPEditBlank(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.EditDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteNameBlank(driver).click();
    			Thread.sleep(4000);
    	
    			
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.CommitteNameVal(driver).getText();
    			Thread.sleep(3000);
    			
    				test.log(LogStatus.PASS, "Message Displayed :-" + msg);
    			
    			Thread.sleep(4000);
    			
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.EditDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			if (DirectorLocator.CloseDOCP(driver).isEnabled()) {
    				DirectorLocator.CloseDOCP(driver).click();
        			Thread.sleep(3000);
        			
    				test.log(LogStatus.PASS,   "The system should close the 'Details of committee position' form without adding the comittee position to the system");
    			} else {
    				test.log(LogStatus.FAIL, "Page not Close");
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPDelete(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DeleteDOCP(driver).click();
    			Thread.sleep(3000);
    			
    		String msg=	driver.switchTo().alert().getText();
    			
    		Thread.sleep(1000);
    				test.log(LogStatus.PASS,msg );
    				driver.switchTo().alert().accept();
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorSD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.SecurityDetails(driver).isEnabled()) {
    			DirectorLocator.SecurityDetails(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Security Details' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Security Details' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorSDEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
          
    			DirectorLocator.SecurityDetails(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.SecurityDetailsEdit(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.NumberofTransaction(driver).clear();
    			
    			row0 = sheet.getRow(18);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NumberofTransaction(driver).sendKeys("" + No + "",Keys.ENTER);
    			Thread.sleep(5000);
    			DirectorLocator.NumberofSecurities(driver).clear();
    			row0 = sheet.getRow(19);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NumberofSecurities(driver).sendKeys("" + No + "");
    			Thread.sleep(5000);
    			
    			DirectorLocator.DescriptionofSecurities(driver).clear();
    			row0 = sheet.getRow(20);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.DescriptionofSecurities(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.NominalValueSecurities(driver).clear();
    			row0 = sheet.getRow(21);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NominalValueSecurities(driver).sendKeys("" + No + "");
    			Thread.sleep(5000);
    			
    		//	row0 = sheet.getRow(22);
    		//	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    		//	 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Dateofacquisition(driver).sendKeys("02-03-2023");
    			Thread.sleep(5000);
    			
    		//	row0 = sheet.getRow(23);
    		//	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    		//	 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Dateofdisposal(driver).sendKeys("02-03-2023");
    			Thread.sleep(5000);
    			DirectorLocator.Pricepaidforacquisition(driver).clear();
    			row0 = sheet.getRow(24);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Pricepaidforacquisition(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			DirectorLocator.Otherconsiderationpaidforacquisition(driver).clear();
    			
    			row0 = sheet.getRow(25);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Otherconsiderationpaidforacquisition(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			DirectorLocator.Pricereceivedondisposal(driver).clear();
    			row0 = sheet.getRow(26);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Pricereceivedondisposal(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			DirectorLocator.Modeofacquisition(driver).clear();
    			row0 = sheet.getRow(27);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Modeofacquisition(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			
                DirectorLocator.Otherconsiderationreceivedondisposal(driver).clear();
    			row0 = sheet.getRow(28);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Otherconsiderationreceivedondisposal(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			  DirectorLocator.Cumulativebalance(driver).clear();
    			row0 = sheet.getRow(29);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Cumulativebalance(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			  DirectorLocator.txtSecCurities(driver).clear();
    			
    			row0 = sheet.getRow(30);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.txtSecCurities(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.SaveSD(driver).click();
    			Thread.sleep(4000);	
    			
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			String msg= 	DirectorLocator.SaveMsgSD(driver).getText();
    			if (msg.equalsIgnoreCase("Security Details Update Successfully")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(2000);
    			  DirectorLocator.CloseSD(driver).click();
    				Thread.sleep(5000);	
    						
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorSDclose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
          
    			DirectorLocator.SecurityDetails(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.SecurityDetailsEdit(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.NumberofTransaction(driver).clear();
    			
    			row0 = sheet.getRow(18);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NumberofTransaction(driver).sendKeys("" + No + "",Keys.ENTER);
    			Thread.sleep(5000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			
                if (DirectorLocator.CloseSD(driver).isEnabled()) {
    				DirectorLocator.CloseSD(driver).click();
        			Thread.sleep(3000);
        			
    				test.log(LogStatus.PASS,   "he system should close the 'Security Details' form without adding the Details to the system");
    			} else {
    				test.log(LogStatus.FAIL, "Page not Close");
    			}
    			Thread.sleep(2000);
    			 
    						
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorProfile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.Profile(driver).isEnabled()) {
    			DirectorLocator.Profile(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Profile' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Profile' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorProfileAdd(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.Profile(driver).click();
    			Thread.sleep(3000);
    			
driver.switchTo().frame(DirectorLocator.ProfileFrame(driver));	
Thread.sleep(3000);
    			DirectorLocator.Profiletext(driver).sendKeys("a");
    			Thread.sleep(3000);
    			driver.switchTo().parentFrame();
    			 DirectorLocator.ProfileSave(driver).click();
    				Thread.sleep(5000);	
    				String msg= 	DirectorLocator.ProfileTextMsg(driver).getText();
        			if (msg.equalsIgnoreCase("Profile Details Saved successfully")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDIR8(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
		
            if(DirectorLocator.DirectorDIR8(driver).isEnabled()) {
    			DirectorLocator.DirectorDIR8(driver).click();
    			Thread.sleep(4000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'DIR-8' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'DIR-8' page");
    			
    		}
            DirectorLocator.DIR8Close(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
}
