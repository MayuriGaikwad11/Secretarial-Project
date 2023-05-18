package secretrial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {
	
 

private static WebElement secretrial = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> secretrialList = null;		
	

	public static WebElement Master(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/a/img"));
		return secretrial;
	}
	
	public static  List<WebElement> EditPL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])"));
		return secretrialList;
	}
	
	public static  List<WebElement> DeletePL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])"));
		return secretrialList;
	}
	
	public static WebElement Entity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[3]/a/span"));
		return secretrial;
	}
	
	public static WebElement EntityEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return secretrial;
	}

	public static WebElement BusinessActivity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytabBA']/a"));
		return secretrial;
	}

	public static WebElement AddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnAddActivity']"));
		return secretrial;
	}
	
	public static WebElement MainActivityCode(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[1]/div/span[2]/span/span[1]"));
		return secretrial;
	}

	public static WebElement  Agricultureforestryfishing(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MainActivityCode_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  BusinessActivity1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[2]/div/span[2]/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement  Productionofcropsandanimals(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  Save(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[1]/div/div/lable"));
		return secretrial;                      
	}
	
	public static WebElement  ClosePop(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[13]"));
		return secretrial;
	}
	
	public static WebElement  ClosePopEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[5]"));
		return secretrial;
	}
	
	public static WebElement  EditBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[11]"));
		return secretrial;
	}
	
	public static WebElement  EditBAPL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[6]"));
		return secretrial;
	}
	
	public static WebElement  ExtractionofCrudePetroleumNaturalgas(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  Percentage(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Percentages']"));
		return secretrial;
	}
	
	public static WebElement  DeleteBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Delete k-grid-delete hoverCircle k-grid-button']"));
		return secretrial;                        
	}
	
	public static WebElement  YesBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yesBA']"));
		return secretrial;
	}
	
	public static WebElement  ClickArrow(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-more-vertical'])[5]"));
		return secretrial;
	}
	
	public static WebElement  ClickFilter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-item k-filter-item k-state-default k-last'])[5]"));
		return secretrial;
	}
	
	public static WebElement  Search(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-textbox k-space-right'])[5]"));
		return secretrial;
	}
	
	public static WebElement  CheckBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-item k-state-focused']/label/input"));
		return secretrial;
	}
	
	public static WebElement  ClickFilter1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-primary'])[5]"));
		return secretrial;
	}
	
	public static WebElement  Documents(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab2']"));
		return secretrial;
	}
	
	
	public static WebElement AddNewDocuments(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommand1']"));
		return secretrial;
	}
	
	public static WebElement Type(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[3]/div/div[1]/div/div[2]/span/span"));
		return secretrial;
	}
	
	public static WebElement TypeAOA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement TypeMOA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement TypeCOI(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement TypePolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[4]"));
		return secretrial;
	}
	
	
	public static WebElement LicenseRegistration(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[5]"));
		return secretrial;
	}
	
	public static WebElement AnnualReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[6]"));
		return secretrial;
	}
	
	public static WebElement LicenseNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LicenceNo']"));
		return secretrial;
	}
	
	public static WebElement LastRenewDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BMDate']"));
		return secretrial;
	}
	
	public static WebElement UpcomingRenewDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GMDate']"));
		return secretrial;
	}
	
	
	public static WebElement Description(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Discription']"));
		return secretrial;
	}
	
	public static WebElement Upload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='files1']"));
		return secretrial;
	}
	
	public static WebElement SaveDoc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[10]"));
		return secretrial;
	}
	
	public static WebElement SaveDoc1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[11]"));
		return secretrial;
	}
	
	public static WebElement SaveDocMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement SaveDocMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return secretrial;
	}
	
	
	public static WebElement Close(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[18]"));
		return secretrial;
	}
	
	public static WebElement Download(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement DownloadPolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[5]"));
		return secretrial;
	}
	
	public static WebElement DownloadLicense(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[8]"));
		return secretrial;
	}
	
	public static WebElement DownloadLicense1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[5]"));
		return secretrial;
	}
	
	public static WebElement DownloadAR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement DownloadAR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[6]"));
		return secretrial;
	}
	
	public static WebElement View(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement ViewPolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[5]"));
		return secretrial;
	}
	
	public static WebElement ViewLICENSE_REGISTRATION(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[8]"));
		return secretrial;
	}
	
	public static WebElement ViewLICENSE_REGISTRATION1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[5]"));
		return secretrial;
	}
	
	
	public static WebElement ViewAnnual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement ViewAnnual1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[6]"));
		return secretrial;
	}
	
	public static WebElement ViewMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndDocViewer_wnd_title']"));
		return secretrial;
	}
	
	public static WebElement Viewclose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[14]"));
		return secretrial;
	}
	
	public static WebElement DocDelete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Delete k-grid-delete k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement DocDeletePolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[5]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteLICENSE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[8]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteLICENSE1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[5]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteAR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[11]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteAR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[6]"));
		return secretrial;
	}
	
	public static WebElement DocDeletemsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='modalWindow']/h5"));
		return secretrial;
	}
	
	public static WebElement DocDeleteYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;
	}
	
	public static WebElement ClickDashboard(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='leftdashboardmenu']"));
		return secretrial;
	}
	
	public static WebElement BankDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return secretrial;
	}
	
	public static WebElement New(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CreateNewAccount']"));
		return secretrial;
	}
	
	public static WebElement AccountNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AccNo']"));
		return secretrial;
	}
	
	public static WebElement  NameofBank(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BankName']"));
		return secretrial;
	}
	
	public static WebElement  TypeOfAccount(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[3]/div[3]/div/div[2]/span/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement  Savingsaccount(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  OpeningDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='dpOpenDate']"));
		return secretrial;
	}
	
	public static WebElement  SaveBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return secretrial;
	}
	
	public static WebElement  SaveBDMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  CloseBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error']"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[2]"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[3]"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[4]"));
		return secretrial;
	}
	
	public static WebElement  EditBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[16]"));
		return secretrial;
	}
	
	public static WebElement  IFSC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Ifsc']"));
		return secretrial;
	}
	
	public static WebElement  DeleteBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-delete k-grid-cancel hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  Yes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;
	}
	
	public static WebElement  No(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='no']"));
		return secretrial;
	}
	
	public static WebElement  EntityView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  CompanyMasterDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='windowReportViewer']/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[6]/div"));
		return secretrial;
	}
	
	public static WebElement  CloseView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-close'])[54]"));
		return secretrial;
	}
	
	public static WebElement  MoreAction(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-dropdown-wrap k-state-default']"));
		return secretrial;
	}
	
	public static WebElement  RelatedCompanies(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  RelatedCompaniesClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncloseCompanySubType']"));
		return secretrial;
	}
	
	public static WebElement  RelatedCompaniesVali(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndCompanySubTpe_wnd_title']"));
		return secretrial;
	}
	
	public static WebElement  Capital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  AddNewRC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndCompanySubTpe']/div/div/div[2]/div/div[3]/button"));
		return secretrial;
	}
	
	public static WebElement  CIN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CIN']"));
		return secretrial;
	}
	
	public static WebElement  NameOfCompany(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr[1]/td[2]"));
		return secretrial;
	}
	
	public static WebElement  NameOfCompanyText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='SubCompanyName']"));
		return secretrial;
	}
	
	public static WebElement  SaveRC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnSaveCompanySubType']"));
		return secretrial;
	}
	
	public static WebElement  SaveRCMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divgridNewMessage']/div/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  SharesHeld(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr[1]/td[4]"));
		return secretrial;
	}
	
	public static WebElement  SharesHeldText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PersentageofShareholding']"));
		return secretrial;
	}
	
	public static WebElement  validationRC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PersentageofShareholding_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement  search(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterassosiate']"));
		return secretrial;
	}
	
	public static WebElement  searchText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr/td[1]"));
		return secretrial;
	}
	
	public static WebElement  DeleteRc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr[1]/td[5]/a"));
		return secretrial;
	}
	
	public static WebElement  AuthorizedCapitalIn (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAuthorizedCapital']/div/div/div/div[2]/span[1]/span/span[2]/span[1]"));
		return secretrial;
	}
	
	public static WebElement  SaveC (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']"));
		return secretrial;
	}
	
	public static WebElement  SaveCMsg (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divfrmUpdateAuthorizedCapital']/div/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  EntityCap (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='main-content']/header/div[1]/ul/li[1]/a"));
		return secretrial;
	}
	
	public static WebElement  AuthorizedCapital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-link k-link-increase']"));
		return secretrial;
	}
	
	public static WebElement  PreferenceShareCapital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;
	}
	
	public static WebElement  PreferenceShareCapitalYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmPrif']/div[3]/div/div[2]/label[1]"));
		return secretrial;
	}
	
	public static WebElement  ClassofSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tblClassPShares']"));
		return secretrial;
	}
	
	public static WebElement  PreferancecapitalType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-dropdown-wrap k-state-default'])[2]"));
		return secretrial;
	}
	
	public static WebElement  OptionallyConvertible(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-item k-state-selected k-state-focused'])[2]"));
		return secretrial;
	}
	
	public static WebElement  AuthorisedCapital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-formatted-value text-right txtpAuthorisedCapital1Equ k-input k-valid valid']"));
		return secretrial;
	}
	
	public static WebElement  PageAuthorizationTab(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Page Authorization"));
		return secretrial;
	}
	
	public static WebElement  MasterMenu(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']"));
		return secretrial;
	}
	
	public static WebElement  SelectRole(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-down'])[1]"));
		return secretrial;
	}
	
	public static List<WebElement>  SelectDropdownOption(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("//*[@id='RoleId_listbox']/li"));
		return secretrialList;
	}
	
	public static WebElement  SelectUser(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-down'])[2]"));
		return secretrial;
	}
	
	public static List<WebElement>  SelectUserDropdownOption(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("//*[@id='UserId_listbox']/li[2]"));
		return secretrialList;
	}
	
	public static WebElement  viewIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		return secretrial;
	}
	
	public static WebElement  addIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		return secretrial;
	}
	
	public static WebElement  editIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		return secretrial;
	}
	
	public static WebElement  deleteIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		return secretrial;
	}
	
	public static WebElement  SavePA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//button[@name='submitButton']"));
		return secretrial;
	}
	
	public static WebElement  SavePAmsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='success']/div/div/strong"));
		return secretrial;
	}
	
	public static WebElement  UserEntityAssignmenMaster(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[10]"));
		return secretrial;
	}
	
	public static WebElement  NewBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Createnewuserassignment']"));
		return secretrial;
	}
	
	public static WebElement  SelectUserUE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityUserMaster']/div[1]/div/div[2]/span/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement  UserSelectDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlState_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  SelectEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityUserMaster']/div[2]/div[2]/div[1]/div"));
		return secretrial;
	}
	
	public static WebElement  EntitySelectDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  BtnSave(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnsave']"));
		return secretrial;
	}
	
	public static WebElement  BtnSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  closepopup(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnuserassinmentclose']"));
		return secretrial;
	}
	
	public static WebElement  ClickEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  ClickAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Meetings k-grid-compliance']"));
		return secretrial;
	}
	
	public static WebElement  Meeting(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityUserMaster']/div[1]/div[2]/div/div"));
		return secretrial;
	}
	
	public static WebElement  Meeting1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlMeetingType_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement  delete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-delete k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  YesUE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;
	}
	
	public static WebElement  Notes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[12]"));
		return secretrial;
	}
	
	public static WebElement  TextArea(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@autocorrect='off']"));
		return secretrial;
	}
	
	public static WebElement  SaveNotes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNotesFormate']/div[4]/div/button"));
		return secretrial;
	}
	
	public static WebElement  ValidationMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNotesFormate']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  ApplicabilityClick(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  ApplicabilityClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose1']"));
		return secretrial;
	}
	
	public static WebElement  AmountinINR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-dropdown-wrap k-state-default'])[12]"));
		return secretrial;
	}
	
	public static WebElement  AmountinINR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='col-md-6']"));
		return secretrial;
	}
	
	public static WebElement  Lakh(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-item k-state-selected k-state-focused'])[8]"));
		return secretrial;
	}
	
	public static WebElement  Shareholding(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[4]"));
		return secretrial;
	}

	public static WebElement  ShareholdingNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommand']"));
		return secretrial;
	}

	public static WebElement  FOLIONO(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtfollioNo']"));
		return secretrial;
	}
	
	public static WebElement  Classofshares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-dropdown-wrap k-state-default'])[2]"));
		return secretrial;
	}
	
	public static WebElement  EquityShares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlShares_Class_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  Totalsharesheld(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.id("txttotshareheld"));
		return secretrial;
	}
	
	public static WebElement  TypeS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div/span[2]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement  Individual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddltype_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  Nameofthemember(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtmemberName']"));
		return secretrial;
	}
	
	public static WebElement  Address(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return secretrial;
	}
	
	public static WebElement  Nationality(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[4]/div/div[5]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  Indian(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NationalityId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  SaveS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateDetailsofShareHolding1']/div[2]/div/button[1]"));
		return secretrial;
	}
	
	public static WebElement  Email(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEmail_Id']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsgS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tabe1']/div[1]/div[2]/div/lable"));
		return secretrial;
	}
	
	public static WebElement  CloseS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose4']"));
		return secretrial;
	}
	
	public static WebElement  ErrorMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error']"));
		return secretrial;
	}
	
	public static WebElement  ErrorMsg2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[2]"));
		return secretrial;
	}
	
	public static WebElement  ErrorMsg3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[3]"));
		return secretrial;
	}
	
	public static WebElement  Validation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error']"));
		return secretrial;
	}
	
	public static WebElement  Validation1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[2]"));
		return secretrial;
	}
	
	public static WebElement  Validation2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[3]"));
		return secretrial;
	}
	
	public static WebElement  Validation3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[4]"));
		return secretrial;
	}
	
	public static WebElement  Validation4(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[5]"));
		return secretrial;
	}
	
	public static WebElement  ValidationBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode-list']/div[4]/div"));
		return secretrial;
	}
	
	
	public static WebElement  ClickTriangle(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-more-vertical'])[8]"));
		return secretrial;
	}
	
	public static WebElement  ClickTriangleBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-more-vertical'])[5]"));
		return secretrial;
	}
	
	
	public static WebElement  Filter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow']"));
		return secretrial;
	}
	
	public static WebElement  FilterBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow'])[2]"));
		return secretrial;
	}
	
	public static WebElement  SearchBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-textbox k-space-right']"));
		return secretrial;
	}
	
	public static WebElement  CheckBoxMoa(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-label'])[2]"));
		return secretrial;
	}
	
	public static WebElement  ClickFiter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-primary']"));
		return secretrial;
	}
	
	public static WebElement  CheckBoxAoa(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-label'])[3]"));
		return secretrial;
	}
	
	public static WebElement  CheckBoxCOI(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-label'])[4]"));
		return secretrial;
	}
	
	public static WebElement  ClickPolicies(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PolicesDocument']"));
		return secretrial;
	}
	
	public static WebElement  LICENSE_REGISTRATION(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LICENSE_REGISTRATION']"));
		return secretrial;
	}
	
	
	public static WebElement  FY(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divFY']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  FY2223(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  StartTime(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divStartTime']/div/div[2]/span/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  StartTime8(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='startTiming_timeview']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  EndTime(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divEndTime']/div/div[2]/span/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  EndTime8(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EndTiming_timeview']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  Annual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Annual']"));
		return secretrial;
	}
	
	public static WebElement  BranchDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;
	}
	
	public static WebElement  AddNewBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[7]"));
		return secretrial;
	}
	
	public static WebElement  Name(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxName']"));
		return secretrial;
	}
	
	
	public static WebElement  Status(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCustomerStatus_chosen']"));
		return secretrial;
	}
	
	public static WebElement  ACtive(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCustomerStatus_chosen']/div/ul/li[2]"));
		return secretrial;
	}
	
	public static WebElement  BranchType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlType_chosen']"));
		return secretrial;
	}
	
	public static WebElement  HeadOffice(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlType_chosen']/div/ul/li[4]"));
		return secretrial;
	}
	
	public static WebElement ContactPerson(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxContactPerson']"));
		return secretrial;
	}
	
	public static WebElement ContactNumber(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxLandline']"));
		return secretrial;
	}
	
	public static WebElement EmailBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxEmail']"));
		return secretrial;
	}
	
	public static WebElement AddressBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxAddressLine1']"));
		return secretrial;
	}
	
	public static WebElement State(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlState_chosen']"));
		return secretrial;
	}
	
	public static WebElement Maharashtra(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlState_chosen']/div/ul/li[23]"));
		return secretrial;
	}
	
	public static WebElement City(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCity_chosen']"));
		return secretrial;
	}
	
	
	public static WebElement Ahmadnagar(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCity_chosen']/div/ul/li[3]"));
		return secretrial;
	}
	
	public static WebElement ClickSave(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnSave']"));
		return secretrial;
	}
	
	public static WebElement ClickSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='vsEntityBranchPage']/ul/li"));
		return secretrial;
	}
	
	public static WebElement CloseBranchD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[28]"));
		return secretrial;
	}
	
	public static WebElement ClickSaveMsgInvalid(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='vsEntityBranchPage']/ul"));
		return secretrial;
	}
	
	public static WebElement EditBranchD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[15]"));
		return secretrial;
	}
	
	public static WebElement EditBranchD1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[3]"));
		return secretrial;
	}
	
	
	public static WebElement UploadBranchD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Upload k-grid-upload hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement SelectFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-upload-button']"));
		return secretrial;
	}
	
	public static WebElement UploadBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/p[2]/button"));
		return secretrial;
	}
	
	public static WebElement UploadMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/label"));
		return secretrial;                        
	}
	
	public static WebElement UploadMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/lable"));
		return secretrial;                        
	}
	
	public static WebElement UploadClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[19]"));
		return secretrial;
	}
	
	public static WebElement InvalidUploadMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/div/ul/li/span[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement InvalidUploadMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/div/ul/li[2]/span[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement AddNewEP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='btn btn-primary add-button']"));
		return secretrial;
	}
	
	public static WebElement EntityType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div[1]/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement PublicLimitedSelect(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement ListedCompanySelect(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement CloseEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;
	}
	
	
	public static WebElement EntityName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEntityName']"));
		return secretrial;
	}
	
	public static WebElement CINEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCIN']"));
		return secretrial;
	}
	
	public static WebElement CalendorIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[1]/div[4]/span[2]/span/span/span"));
		return secretrial;
	}
	
	
	public static WebElement Date(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("5"));
		return secretrial;
	}
	
	public static WebElement PAN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPan']"));
		return secretrial;
	}
	
	public static WebElement Roc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[2]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Ahmedabad(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Ahmedabad"));
		return secretrial;
	}
	
	
	public static WebElement CompanyCategory(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[2]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Companylimitedbyshares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Company limited by shares"));
		return secretrial;
	}
	
	public static WebElement EmailE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEmailId']"));
		return secretrial;
	}
	
	public static WebElement FinancialYear(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[4]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement JAnDec(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FY_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement AddressE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtRegAddress1']"));
		return secretrial;
	}
	
	public static WebElement StateE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div/div[1]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement MaharashtraS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='stateId_listbox']/li[28]"));
		return secretrial;
	}
	
	public static WebElement CityE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div/div[1]/div/div[4]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement AhmadnagarE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlreg_cityId_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement SaveE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='saveppcom']"));
		return secretrial;
	}
	
	public static WebElement SaveEMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[1]/div/div/lable"));
		return secretrial;                       
	}
	
	public static WebElement SaveEMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[2]/div/div/lable"));
		return secretrial;   //Entity/Company with same CIN already exists                     
	}
	
	public static WebElement Searche(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-textbox'])[31]"));
		return secretrial;                       
	}
	
	public static WebElement InvalidMsgName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityName_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgePan(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeCIN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CIN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='IncorporationDate_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeEmail(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Email_Id_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement DateBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='dpIncdate']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeRoc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ROC_Code_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeFY(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FY_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeAddress(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Regi_Address_Line1_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeState(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Regi_StateId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgecity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Regi_CityId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement SearchFilter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return secretrial;                     
	}
	
	public static WebElement UpdateMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement RegisteredADD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return secretrial;                     
	}
	
	public static WebElement Pan(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPAN']"));
		return secretrial;                     
	}
	
	public static WebElement Noofshares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtshares_abeyance']"));
		return secretrial;                     
	}
	
	public static WebElement ValiPan(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement ValiShaAb(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='shares_abeyance_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement DebentureHolding(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[5]"));
		return secretrial;                     
	}
	
	public static WebElement SearchDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return secretrial;                     
	}
	
	public static WebElement FolioNoValue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr/td[3]"));
		return secretrial;                     
	}
	
	public static WebElement NoDataFound(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch-list']/div[3]/div"));
		return secretrial;                     
	}
	
	public static WebElement ClassAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div/div/div[2]/div/div[2]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement ClassAllNCD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Non Convertible Debentures"));
		return secretrial;                     
	}
	
	public static WebElement NCDText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr/td[1]"));
		return secretrial;                     
	}
	
	public static WebElement ClearFilter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='clearfillter']"));
		return secretrial;                     
	}
	
	public static WebElement AddNewDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommand']"));
		return secretrial;                     
	}
	
	public static WebElement Follio_No(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtfollioNo']"));
		return secretrial;                     
	}
	
	public static WebElement  ClassofDebenture(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li[1]/div/div/div/div[2]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  CouponRate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCouponrate']"));
		return secretrial;                     
	}
	
	public static WebElement  TotalDebentureheld(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li[1]/div/div/div/div[5]/span[2]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement  TypeDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  NameDebentureHolder(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtmemberName']"));
		return secretrial;                     
	}
	
	public static WebElement  AddressDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return secretrial;                     
	}
	
	public static WebElement  CINDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCIN']"));
		return secretrial;                     
	}
	
	public static WebElement  EmailId(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEmail_Id']"));
		return secretrial;                     
	}
	
	public static WebElement  NationalityDh(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[3]/div/div[5]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  SaveBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateDetailsofShareHolding1']/div[2]/div/button[1]"));
		return secretrial;                     
	}
	
	public static WebElement  SaveMsgDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tabe1']/div[1]/div[2]/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement  CloseDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose4']"));
		return secretrial;                     
	}
	
	public static WebElement  TypeVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Type_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  AddressVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='bodycorporate_Address_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  Email_IdVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Email_Id_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  PanDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPAN']"));
		return secretrial;                     
	}
	
	public static WebElement  PanDHVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  FOLIOVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Follio_No_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  DebentureVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Debenture_Class_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  DHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  CloseDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;                     
	}
	
	public static WebElement  DHDAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Addshareholdingdetails']"));
		return secretrial;                     
	}
	
	public static WebElement  AllotmentNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtAllotmentNo']"));
		return secretrial;                     
	}
	
	public static WebElement   Dateofallotment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])[5]"));
		return secretrial;                     
	}
	
	public static WebElement   DateDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("10"));
		return secretrial;                     
	}
	
	public static WebElement  NoofDebentures(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNoOfShareTransfered']"));
		return secretrial;                     
	}
	
	public static WebElement  Nameofthetransferor(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNameOfTransferor']"));
		return secretrial;                     
	}
	
	public static WebElement   Dateofissue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])[6]"));
		return secretrial;                     
	}
	
	public static WebElement   CertificateNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCertificateNo']"));
		return secretrial;                     
	}
	
	public static WebElement   SaveDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmupdateshareholdindetails']/div[2]/div/button[1]"));
		return secretrial;                     
	}
	
	public static WebElement   CloseADDDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclosesharedetilas']"));
		return secretrial;                     
	}
	
	public static WebElement   CloseADDDHDC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[8]"));
		return secretrial;                     
	}
	
	public static WebElement   SavehdMsgDhd(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblsuccessI_sub']"));
		return secretrial;                     
	}
	
	public static WebElement   DNFrom(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDistinctiveFroms']"));
		return secretrial;                     
	}
	
	public static WebElement   DNTo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DistinctiveTo']"));
		return secretrial;                     
	}
	
	public static WebElement   Foliooftransferor(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtFolioOfTransferor']"));
		return secretrial;                     
	}
	
	public static WebElement   issuedforconsideration(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtThereof']"));
		return secretrial;                     
	}
	
	public static WebElement   Dateoftransfer(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])[7]"));
		return secretrial;                     
	}
	
	public static WebElement  	NoofDebenturestransferred(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNumberOfShares']"));
		return secretrial;                     
	}
	
	
	public static WebElement   DNFromT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDistinctiveFrom1']"));
		return secretrial;                     
	}
	
	public static WebElement   DNToT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDistinctiveTo']"));
		return secretrial;                     
	}
	
	public static WebElement   txtFolioOfTransferee(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtFolioOfTransferee']"));
		return secretrial;                     
	}
	
	public static WebElement  txtNameOfTransferee(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNameOfTransferee']"));
		return secretrial;                     
	}
	
	public static WebElement  txtBalanceShare(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtBalanceShare']"));
		return secretrial;                     
	}
	
	public static WebElement  Remark(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtRemarks']"));
		return secretrial;                     
	}
	
	public static WebElement  Authentication(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDebAuthentication']"));
		return secretrial;                     
	}
	
	public static WebElement  uploadButton(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnShareDetails']"));
		return secretrial;                 
	}
	
	public static WebElement  DownloadFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divShareDtls']/img"));
		return secretrial;                     
	}
	
	public static WebElement  ChooseFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='File']"));
		return secretrial;                     
	}
	
	public static WebElement  UploadFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[10]"));
		return secretrial;                     
	}
	
	public static WebElement  UploadFileDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[8]"));
		return secretrial;                     
	}
	
	public static WebElement  UploadMSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement  InvalidUploadMSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul/li/label"));
		return secretrial;                    
	}
	
	public static WebElement  UploadClosed(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[9]"));
		return secretrial;                     
	}
	
	public static WebElement  UploadClosedDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;                     
	}
	
	public static WebElement  uploadButtonDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDebentureHolding']"));
		return secretrial;                     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
