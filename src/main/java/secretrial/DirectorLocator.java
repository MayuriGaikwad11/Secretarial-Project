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
	
	public static WebElement  AddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnAddDetailsRelative']"));
		return secretrial;
	}
	
	
	public static WebElement  Relation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[3]/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  HUF(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  Spouse(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  Father(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  Mother(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement  Son(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[5]"));
		return secretrial;
	}
	
	public static WebElement  Daughter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[6]"));
		return secretrial;
	}
	
	public static WebElement  Brother(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[7]"));
		return secretrial;
	}
	
	public static WebElement  Sister(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Relation_listbox']/li[8]"));
		return secretrial;
	}
	
	
	public static WebElement  Name(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Name']"));
		return secretrial;
	}
	
	public static WebElement  MinorAdult(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divMinorAdult']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  Adult(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Minor_or_Adult_listbox']/li[3]"));
		return secretrial;
	}

	public static WebElement  MaritalStatus(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divMaritalStatus']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  Married(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MaritalStatus_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  SpouseName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Spouse']"));
		return secretrial;
	}
	
	public static WebElement  ChangeType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divChangeType']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  ChangeType1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChangeTypeId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  ChangeDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divChangeDate']/div/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  ChangeDate1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("1"));
		return secretrial;
	}
	
	public static WebElement  SaveLOR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[10]/div/button[1]"));
		return secretrial;
	}
	
	public static WebElement  SaveLORMSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  SaveLORMSg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[2]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  CloseLOR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncloseRelative']"));
		return secretrial;
	}
	
	public static WebElement  LOREdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  itemsperpage(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridRelative']/div[1]/span[1]/span"));
		return secretrial;
	}
	
	public static WebElement  DetailsOfInterest(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;
	}
	
	public static WebElement  DetailsofCommitteePositions(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return secretrial;
	}
	
	
	public static WebElement  DOCPAddnew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnAddDetailsOfCommittee']"));
		return secretrial;
	}
	
	
	public static WebElement  DOCPEntityName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[3]/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPEntityName1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[4]/div/div[2]/span[1]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteName1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCommitteelist_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteName2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCommitteelist_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteNameBlank(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCommitteelist-list']/div[1]"));
		return secretrial;
	}
	
	
	public static WebElement  DOCPPosition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[6]/div/div[2]/span[1]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPPosition1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlDesignation_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  DateofAppointment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[8]/div/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  DateofAppointment1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("2"));
		return secretrial;
	}
	
	
	public static WebElement  DateofCessation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[9]/div/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  DateofCessation1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("4"));
		return secretrial;
	}
	
	
	public static WebElement  SaveDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-primary k-grid-update']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsgDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblerrormsg']"));
		return secretrial;
	}
	
	public static WebElement  UpdateMsgDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divsuccess']"));
		return secretrial;
	}
	
	public static WebElement  CloseDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-grid-cancel']"));
		return secretrial;
	}
	
	
	public static WebElement  EntityNameVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Entity_Id_validationMessage']"));
		return secretrial;
	}
	
	
	public static WebElement  CommitteNameVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Committee_Id_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement  EditDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-edit k-grid-button']"));
		return secretrial;
	}

	public static WebElement  DeleteDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-delete k-grid-button']"));
		return secretrial;
	}
	
	
	public static WebElement  SecurityDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab5']"));
		return secretrial;
	}
	
	public static WebElement  SecurityDetailsEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  NumberofTransaction(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tblClassDShares']"));
		return secretrial;
	}
	
	public static WebElement  NumberofSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNoofSec_0']"));
		return secretrial;
	}
	
	public static WebElement  DescriptionofSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDescSec_0']"));
		return secretrial;
	}
	
	public static WebElement  NominalValueSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNominalValSec_0']"));
		return secretrial;
	}
	
	
	public static WebElement  Dateofacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDateOfAcqisition_0']"));
		return secretrial;
	}
	

	public static WebElement  Dateofdisposal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDateOfDisposal_0']"));
		return secretrial;
	}
	
	public static WebElement  Pricepaidforacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPricePaid_0']"));
		return secretrial;
	}
	
	public static WebElement  Otherconsiderationpaidforacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtOtherPaidAcq_0']"));
		return secretrial;
	}
	
	public static WebElement  Pricereceivedondisposal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPriceRec_0']"));
		return secretrial;
	}
	
	public static WebElement  Modeofacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtModeOfAcq_0']"));
		return secretrial;
	}
	
	public static WebElement  Otherconsiderationreceivedondisposal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtOtherDisposal_0']"));
		return secretrial;
	}
	
	public static WebElement  Cumulativebalance(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCumulativeBal_0']"));
		return secretrial;
	}
	
	public static WebElement  txtSecCurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtSecCurities_0']"));
		return secretrial;
	}
	
	public static WebElement  SaveSD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncompayDtls']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsgSD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='successmessage']"));
		return secretrial;
	}
	
	public static WebElement  CloseSD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncloseComdls']"));
		return secretrial;
	}
	
	public static WebElement  Profile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab6']"));
		return secretrial;
	} 
	
	public static WebElement  Profiletext(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("/html/body"));
		return secretrial;
	} 
	
	
	public static WebElement  ProfileSave(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnsavedirectorProfile']"));
		return secretrial;
	} 
	
	public static WebElement  ProfileFrame(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDirectorProfileDetails']/div[3]/div/table/tbody/tr[2]/td/iframe"));
		return secretrial;
	} 
	
	public static WebElement  ProfileTextMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblsuccess']"));
		return secretrial;
	} 
	
	public static WebElement  DirectorDIR8(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='generateDIR8']"));
		return secretrial;
	} 
	
	public static WebElement  DIR8Close(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[7]"));
		return secretrial;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
