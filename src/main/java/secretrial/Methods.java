package secretrial;

import java.io.File;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Methods {
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void BusinessActivityClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.BusinessActivity(driver).isEnabled()) {
		Locator.BusinessActivity(driver).click();
		test.log(LogStatus.PASS, " Business Activity  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Business Activity  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void BusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
	//	Locator.Entity(driver).click();
		Thread.sleep(4000);
		Locator.EntityEdit(driver).click();
		Thread.sleep(2000);
		Locator.BusinessActivity(driver).click();
		Thread.sleep(1000);
		Locator.AddNew(driver).click();
		Thread.sleep(1000);
		Locator.MainActivityCode(driver).click();
		Thread.sleep(1000);
		Locator.Agricultureforestryfishing(driver).click();
		Thread.sleep(1000);
		Locator.BusinessActivity1(driver).click();
		Thread.sleep(1000);
		Locator.Productionofcropsandanimals(driver).click();
		Thread.sleep(1000);
		Locator.Save(driver).click();
		Thread.sleep(1000);
		
		
		String msg = Locator.SaveMsg(driver).getText();
		if (msg.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.PASS,  "Business Activity -Add New -" +msg);
		} else {
			test.log(LogStatus.FAIL, " Business Activity -Add New -" +msg);
		}
		Locator.ClosePop(driver).click();
		Thread.sleep(1000);
		Locator.ClosePopEntity(driver).click();
		Thread.sleep(1000);
		Locator.ClickDashboard(driver).click();
		}
	
	public static void BusinessActivityValidation(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
String Msg=	Locator.ValidationBA(driver).getText();
	Thread.sleep(1000);
	if(Msg.equalsIgnoreCase("No data found.")) {
		
		test.log(LogStatus.PASS,  "Business activity' dropdown is not Activated" );
	} else {
		test.log(LogStatus.FAIL, "Business activity' dropdown is  Activated" );
	}
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);

	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}

	public static void validationofsave(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Add New -" +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Add New -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void validationofedit(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.EditBA(driver).click();
	Thread.sleep(1000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
	Locator.ExtractionofCrudePetroleumNaturalgas(driver).click();
	Thread.sleep(1000);
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.PASS,  "Business Activity -Edit -" +msg);
	} else {
		test.log(LogStatus.FAIL, " Business Activity -Edit -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }

	
	public static void CheckInvaliddata(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.EditBA(driver).click();
	Thread.sleep(1000);
	
	
	Locator.Percentage(driver).sendKeys("e");
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Edit - " +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Edit -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void DeleteBusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.DeleteBA(driver).click();
	Thread.sleep(2000);
	//Locator.YesBA(driver).click();
	By locator = By.xpath("//*[@id='yesBA']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	Thread.sleep(1000);
	String Msg=driver.switchTo().alert().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "Delete Business Activity :- " +Msg);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void CheckFilterWork(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(3000);
	Locator.ClickArrow(driver).click();
	Thread.sleep(2000);
	By locator = By.xpath("(//*[@class='k-item k-filter-item k-state-default k-last'])[5]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
//	Locator.ClickFilter(driver).click();
	Thread.sleep(1000);
	Locator.Search(driver).sendKeys("Agriculture, forestry, fishing");
	Thread.sleep(1000);
	Locator.CheckBox(driver).click();
	Thread.sleep(1000);
	Locator.ClickFilter1(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.Documents(driver).isEnabled()) {
		Locator.Documents(driver).click();
		test.log(LogStatus.PASS, " Document  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Document  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void DocumentsADD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(16);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,"To check whether user is able to add existing data or not. (For Type AOA) " + msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DocumentsADDMOA(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
//	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  " selecting a MOA option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDMOAAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
     if(msg1.equalsIgnoreCase("Viewer")) {
    	 test.log(LogStatus.PASS,  " document Type MOA :- View  successfully.");
     }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
    if(msg1.equalsIgnoreCase("Viewer")) {
   	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
    }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDCOI(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDCOIExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
   if(msg1.equalsIgnoreCase("Viewer")) {
  	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
   }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DocumentsADDPolicy(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(17);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDPolicyAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewPolicy(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
  if(msg1.equalsIgnoreCase("Viewer")) {
 	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
  }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadPolicy(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeletePolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeletePolicy(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDLicenseRegi(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDLicenseRegiED(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.LicenseNo(driver).sendKeys("13"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewLICENSE_REGISTRATION(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
 if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type LICENSE_REGISTRATION :- View  successfully.");
 }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadLicense(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeleteLICENSE(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DocumentsADDLicenseRegiInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.FAIL,  "Try to entering Last Renewal date is Greater than Next renewal Date :- " +msg1);
	}else {
		test.log(LogStatus.PASS,  "Try to entering Last Renewal date is Greater than Next renewal Date :-  " +msg1);
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDAnnualReport(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[10]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDAnnualReportED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[10]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDAnnualReportWD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[10]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	
	public static void ViewAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewAnnual(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type Annual Report :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadAR(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeleteAR(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	
	public static void WithoutDocument(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,   msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,   msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,   msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,   msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentLicense(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,   msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	Locator.Documents(driver).click();
	Thread.sleep(4000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	if(Locator.Close(driver).isEnabled()) {
		Locator.Close(driver).click();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  " close or exit button is working Successfully");
	}else {
		test.log(LogStatus.FAIL,  "close or exit button is not working");
	}
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void BankDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.BankDetails(driver).isEnabled()) {
		Locator.BankDetails(driver).click();
		test.log(LogStatus.PASS, " Bank Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, "Bank Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	
	
	public static void BankDetailAddnew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void BankDetailInvalidBName(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	row0 = sheet.getRow(8);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void BankDetailInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(6);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Locator.AccountNo(driver).sendKeys(c1.getStringCellValue());
//	int No = (int) c1.getNumericCellValue();
//	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void BankDetailInvalidIFC(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	

	public static void BankDetailInvalidSC(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(7);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Locator.AccountNo(driver).sendKeys(c1.getStringCellValue());

	Thread.sleep(1000);
	
	row0 = sheet.getRow(8);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	String	msg1=Locator.InvalidMsg1(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg +","+msg1);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void WithOutBankDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	String	msg1=Locator.InvalidMsg1(driver).getText();
	Thread.sleep(3000);
	String	msg2=Locator.InvalidMsg2(driver).getText();
	Thread.sleep(3000);
	String	msg3=Locator.InvalidMsg3(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "message Display " +msg +", "+msg1+", "+ msg2 +", "+msg3);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void BankDetailEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
//	Thread.sleep(5000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[19]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	Thread.sleep(4000);
	Locator.NameofBank(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(9);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void BankDetailEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[18]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.IFSC(driver).clear();
	Thread.sleep(1000);
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	
	public static void BankDetailDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	Locator.Yes(driver).click();
	Thread.sleep(2000);
	
	
	
	String	msg1=driver.switchTo().alert().getText();
	
	test.log(LogStatus.PASS, msg1);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
  Locator.ClosePopEntity(driver).click();
  Thread.sleep(1000);
  Locator.ClickDashboard(driver).click();
  Thread.sleep(1000);
	 }
	
	public static void BankDetailDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	if(Locator.No(driver).isEnabled()) {
	Locator.No(driver).click();
	Thread.sleep(2000);
	test.log(LogStatus.PASS,  "user deletes an item and cancels deletion Successfully");
	}
	
 Locator.ClosePopEntity(driver).click();
 Thread.sleep(1000);
 Locator.ClickDashboard(driver).click();
 Thread.sleep(1000);
	 }
	
	
	public static void EntityView(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.EntityView(driver).click();
	Thread.sleep(3000);
/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='windowReportViewer']/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[6]/div"))); 
	Thread.sleep(3000);
	if(Locator.CompanyMasterDetails(driver).isDisplayed()) {
		
		test.log(LogStatus.PASS,  "view Entity details Successfully");
		}*/
	//Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-icon k-i-close'])[54]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	//Locator.CloseView(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void EntityMoreOption(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	if(Locator.RelatedCompaniesVali(driver).isDisplayed()) {
		test.log(LogStatus.PASS,  "user is able to clicks on the More action dropdown and selects a valid option Successfully");
	}
	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void EntityMoreOptionRC(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	
	if(Locator.RelatedCompanies(driver).isEnabled()) {
		Locator.RelatedCompanies(driver).click();
		test.log(LogStatus.PASS,  " 'More Actions > Related Companies' option is working  Successfully");
	}
	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void EntityMoreOption1(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	
	if(Locator.Capital(driver).isEnabled()) {
		Locator.Capital(driver).click();
		test.log(LogStatus.PASS,  "More Actions > Capital' option is working Successfully");
	}
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	
	Locator.AddNewRC(driver).click();
	Thread.sleep(2000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(12);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.CIN(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.NameOfCompany(driver).click();
	Thread.sleep(2000);
	Locator.SaveRC(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.SaveRCMsg(driver).getText();
	test.log(LogStatus.PASS, msg1);

	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	
	public static void RCSharesHeld(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	Locator.SharesHeld(driver).click();
	Thread.sleep(2000);
	Locator.SharesHeldText(driver).clear();
	Thread.sleep(2000);
	Locator.SharesHeld(driver).click();
	Thread.sleep(2000);
	Locator.SharesHeldText(driver).sendKeys("ad");
	Thread.sleep(2000);
	Locator.SaveRC(driver).click();
	Thread.sleep(3000);
	String	msg1=Locator.validationRC(driver).getText();
	test.log(LogStatus.PASS, msg1);
	Thread.sleep(2000);
	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	
	if(Locator.RelatedCompaniesClose(driver).isEnabled()) {
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Related Companies window -  close button working Successfully.");
	}
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCSearchField(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	Locator.search(driver).sendKeys("U45200MH1981PTC025832",Keys.ENTER);
	Thread.sleep(2000);
String text=Locator.searchText(driver).getText();
	Thread.sleep(2000);
	if(text.equalsIgnoreCase("U45200MH1981PTC025832")) {
		test.log(LogStatus.PASS, "Related Companies- search Field  working Successfully.");
	}else {
		test.log(LogStatus.FAIL, "Related Companies- search Field not working");
	}
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	Locator.DeleteRc(driver).click();
	Thread.sleep(2000);
	String Msg=driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	test.log(LogStatus.PASS,Msg );
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
	
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void Capital(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
		Locator.Capital(driver).click();
		Thread.sleep(4000);
		Locator.AuthorizedCapital(driver).click();
		Thread.sleep(2000);
	
		
		Locator.SaveC(driver).click();
		Thread.sleep(2000);
		String text=Locator.SaveCMsg(driver).getText();
		Thread.sleep(2000);
		test.log(LogStatus.PASS,"Adding 'Authorized Capital in INR' with the help of 'increase value' value' button :- "+text );
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void CapitalA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
		Locator.Capital(driver).click();
		Thread.sleep(4000);
	//	Locator.AuthorizedCapital(driver).sendKeys("300000002");
		Thread.sleep(2000);
		By locator = By.xpath("//input[@type='text']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
	//	Thread.sleep(4000);
	//	ViewButton.clear();
		Thread.sleep(2000);
		ViewButton.sendKeys(Keys.BACK_SPACE);
		ViewButton.sendKeys(Keys.BACK_SPACE);
		ViewButton.sendKeys(Keys.BACK_SPACE);
		//ViewButton.sendKeys(Keys.DELETE);
		//String s = Keys.chord(Keys.CONTROL, "300000002");
	//	ViewButton.sendKeys(s);
		
		Thread.sleep(2000);
		Locator.SaveC(driver).click();
		Thread.sleep(2000);
		String text=Locator.SaveCMsg(driver).getText();
		Thread.sleep(2000);
		test.log(LogStatus.PASS,"Adding 'Authorized Capital in INR' with the help of 'increase value' value' button :- "+text );
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	
	
	public static void  PreferenceShareCapital(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
		Locator.Capital(driver).click();
		Thread.sleep(4000);
		Locator.PreferenceShareCapital(driver).click();
		Thread.sleep(4000);
		Locator.PreferenceShareCapitalYes(driver).click();
		Thread.sleep(4000);
		Locator.ClassofSecurities(driver).clear();
		Thread.sleep(1000);
		Locator.ClassofSecurities(driver).sendKeys("1",Keys.ENTER);
		Thread.sleep(4000);
	/*	Locator.PreferancecapitalType(driver).click();
		Thread.sleep(1000);
	//	Locator.OptionallyConvertible(driver).click();
		Thread.sleep(1000);
		By locator = By.xpath("(//*[@class='k-item'])[3]");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);*/
		Locator.AuthorisedCapital(driver).clear();
		Thread.sleep(1000);
		Locator.AuthorisedCapital(driver).sendKeys("2");
		Thread.sleep(1000);
	 }
	
	
	public static void  ApplicabilityClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
		if(Locator.ApplicabilityClick(driver).isEnabled()) {
			Locator.ApplicabilityClick(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS,  " 'More Actions > Applicability' option is Clickable  Successfully");
		}
		Locator.ApplicabilityClose(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ApplicabilityClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.ApplicabilityClick(driver).click();
	Thread.sleep(3000);
		if(Locator.ApplicabilityClose(driver).isEnabled()) {
			Locator.ApplicabilityClose(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  " The window should close when the close button is clicked.");
		}
		
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  Applicability(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
			Locator.ApplicabilityClick(driver).click();
			Thread.sleep(3000);
		/*	Locator.AmountinINR(driver).click();
		//	Thread.sleep(3000);
			//Locator.Lakh(driver).click();
			Thread.sleep(2000);
			By locator = By.xpath("(//*[@data-offset-index='1'])[63]");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//	Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
		//	Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			*/
			 Select select = new Select(Locator.AmountinINR1(driver));
		      // select an item with text visible
			 Thread.sleep(4000);
		      select.selectByIndex(1);
		      Thread.sleep(4000);
		Locator.ApplicabilityClose(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  Shareholding(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
		if(Locator.Shareholding(driver).isEnabled()) {
			Locator.Shareholding(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS,  " 'More Actions > Shareholding' option is Clickable  Successfully");
		}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  Shareholdingnew(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
			Locator.ShareholdingNew(driver).click();
			Thread.sleep(5000);
			Locator.FOLIONO(driver).sendKeys("10");
			Thread.sleep(3000);
			Locator.Classofshares(driver).click();
			Thread.sleep(1000);
			Locator.EquityShares(driver).click();
			Thread.sleep(3000);
			
			Locator.TypeS(driver).click();
			Thread.sleep(1000);
			Locator.Individual(driver).click();
			Thread.sleep(3000);
			Locator.Nameofthemember(driver).sendKeys("Mayuri");
			Thread.sleep(3000);
			Locator.Address(driver).sendKeys("Abcd");
			Thread.sleep(3000);
			Locator.Nationality(driver).click();
			Thread.sleep(1000);
			Locator.Indian(driver).click();
			Thread.sleep(3000);
			Locator.Email(driver).sendKeys("Abcd@gmail.com");
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript("window.scrollBy(0,600)");
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	js.executeScript("window.scrollBy(0,-600)");
		 	  String text =Locator.SaveMsgS(driver).getText();
			    Thread.sleep(2000);
			    test.log(LogStatus.PASS,  text);
			    Thread.sleep(1000);
				Locator.CloseS(driver).click();
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ShareholdingValidation(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
			Locator.ShareholdingNew(driver).click();
			Thread.sleep(5000);
			Locator.FOLIONO(driver).sendKeys("10");
			Thread.sleep(3000);
			Locator.Classofshares(driver).click();
			Thread.sleep(1000);
			Locator.EquityShares(driver).click();
			Thread.sleep(3000);
			
			
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	
		 	  String text =Locator.ErrorMsg1(driver).getText();
			    Thread.sleep(2000);
			    String text1 =Locator.ErrorMsg2(driver).getText();
			    Thread.sleep(2000);
			    String text2 =Locator.ErrorMsg3(driver).getText();
			    Thread.sleep(2000);
			    test.log(LogStatus.PASS, "Error messages reflected in Other mandatory field :-"+ text+", "+text1 +", "+text2);
			    Thread.sleep(1000);
				Locator.CloseS(driver).click();
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ShareholdingValidationEmpty(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
	Locator.ShareholdingNew(driver).click();
	Thread.sleep(5000);
			
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	
		 	  String text =Locator.Validation(driver).getText();
			    Thread.sleep(2000);
			    String text1 =Locator.Validation1(driver).getText();
			    Thread.sleep(2000);
			    String text2 =Locator.Validation2(driver).getText();
			    Thread.sleep(2000);
			    String text3 =Locator.Validation3(driver).getText();
			    Thread.sleep(2000);
			    String text4 =Locator.Validation4(driver).getText();
			    Thread.sleep(2000);
			    test.log(LogStatus.PASS, "Error messages reflected mandatory field :-"+ text+", "+text1 +", "+text2+", "+text3 +", "+text4);
			    Thread.sleep(1000);
				Locator.CloseS(driver).click();
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void BranchDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	if(Locator.BranchDetails(driver).isEnabled()) {
		Locator.BranchDetails(driver).click();
		test.log(LogStatus.PASS, " Branch Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Branch Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(21);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(22);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.ContactNumber(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(23);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.EmailBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("Details Save Successfully")) {
		test.log(LogStatus.PASS, Msg);
	}else {
		test.log(LogStatus.FAIL, Msg);
	}
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsinvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ContactPerson(driver).sendKeys("123$"); // Writing Task title
	Thread.sleep(2000);
	
	
	Locator.ContactNumber(driver).sendKeys("11111111"); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.EmailBD(driver).sendKeys("123@"); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS, Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsMandatoryfield(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsWithOutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(4000);
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		if(Locator.CloseBranchD(driver).isEnabled()) {
			Locator.CloseBranchD(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS," close or exit button is working");
			
		}else {
			test.log(LogStatus.PASS," close or exit button is not working");
		}

		Thread.sleep(3000);
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void EditBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.EditBranchD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Name(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(25);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void UploadBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
	//	Locator.SelectFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
String Msg=	Locator.UploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File Upload successfully")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void UploadBranchDetailsInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
	
		
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void UploadBranchDetailsMulInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Secretrial.html");
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	
	String Msg1=Locator.InvalidUploadMsg1(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.") && Msg1.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"multiple invalid file extensions upload Same  Message Displayed :-  1)"+ Msg+", 2)"+Msg1);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void UploadBranchDetailsMulvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
		String Msg=	Locator.UploadMsg(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("File Upload successfully")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void UploadBranchDetailsWF(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(4000);
		String Msg=	Locator.UploadMsg1(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("Please select file to upload")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	
	
	
}
