package secretrial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DirectorLocator {

private static WebElement secretrial = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> secretrialList = null;		
	
	public static WebElement Director(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[2]/a"));
		return secretrial;
	}
	
	public static WebElement ClickDashboard(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='leftdashboardmenu']"));
		return secretrial;
	}
	
	public static WebElement DirectorAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnCreateNewDirector']"));
		return secretrial;
	}
	
	public static WebElement Salutation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement SalutationMS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Salutation_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement FirstName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FirstName']"));
		return secretrial;
	}
	
	public static WebElement MiddleName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MiddleName']"));
		return secretrial;
	}
	
	public static WebElement LastName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LastName']"));
		return secretrial;
	}
	
	public static WebElement Gender(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[1]/div/div[5]/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Female(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Gender_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement DateofBirth(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[1]/div/div[5]/div[2]/span[2]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DateofBirth1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("3"));
		return secretrial;
	}
	
	
	public static WebElement DIN(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DIN']"));
		return secretrial;
	}
	

	public static WebElement FatherFirstName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherFirstName']"));
		return secretrial;
	}
	
	public static WebElement FatherMiddleName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherMiddleName']"));
		return secretrial;
	}
	
	public static WebElement FatherLastName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherLastName']"));
		return secretrial;
	}
	
	public static WebElement PANofDirector(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN']"));
		return secretrial;
	}
	
	public static WebElement Adhaar(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Adhaar']"));
		return secretrial;
	}
	
	public static WebElement Resident(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[3]/div/div[1]/span[2]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement ResidentYes(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ResidentInIndia_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement MobileNo(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MobileNo']"));
		return secretrial;
	}
	
	public static WebElement EmailId(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EmailId']"));
		return secretrial;
	}
	
	public static WebElement EmailId_Official(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EmailId_Official']"));
		return secretrial;
	}
	
	public static WebElement DSCExpiryDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[3]/div/div[7]/span/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DSCExpiryDate1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("25"));
		return secretrial;
	}
	
	public static WebElement MotherName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MotherName']"));
		return secretrial;
	}
	
	public static WebElement Permenant_Address_Line1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Permenant_Address_Line1']"));
		return secretrial;
	}
	
	public static WebElement Country(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div[2]/div[2]/div[1]/span/span[1]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement CountryIndia(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlpercountry_listbox']/li[2]"));
		return secretrial;
	}
	
	
	public static WebElement State(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div[2]/div[2]/div[2]/span[2]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement Maharastra(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlPermenant_StateId_listbox']/li[29]"));
		return secretrial;
	}
	
	public static WebElement City(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div[2]/div[2]/div[3]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Ahmadnagar(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlPermenant_CityId_listbox']/li[3]"));
		return secretrial;                        
	}
	
	public static WebElement permanentRadio (WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[2]/div/div[2]/label[1]"));
		return secretrial;
	}
	
	public static WebElement EducationalQualification (WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[1]/span[2]/span[1]/span[2]"));
		return secretrial;
	}
	
	public static WebElement Graduation (WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EducationalQualification_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement Occupation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Professional(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Occupation_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement AreaofOccupation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[4]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Government(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AreaOfOccupation_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement Save(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnsub1']"));
		return secretrial;
	}
	
	public static WebElement SaveMsg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateDetails']/div[2]/div[2]/div/lable"));
		return secretrial;
	}
	
	public static WebElement SaveMsg1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDetailsNew']/div[2]/div[2]/div/lable"));
		return secretrial;
	}
	
	
	public static WebElement Close(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose1']"));
		return secretrial;
	}
	
	public static WebElement Close1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;
	}
	
	public static WebElement Search(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return secretrial;
	}
	
	public static WebElement Edit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement NameVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FirstName_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement FatherLastNameVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherLastName_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement ListofRelatives(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab2']"));
		return secretrial;
	}
	
	public static WebElement  CloseLR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
