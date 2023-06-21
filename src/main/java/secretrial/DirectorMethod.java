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
	
	
}
