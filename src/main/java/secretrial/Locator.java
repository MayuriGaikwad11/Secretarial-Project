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
	
	public static WebElement View(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
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
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[14]"));
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
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[3]"));
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
		secretrial = driver.findElement(By.xpath("//*[@class='k-formatted-value text-right txtAuthorizedCapital k-input k-valid valid']"));
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
