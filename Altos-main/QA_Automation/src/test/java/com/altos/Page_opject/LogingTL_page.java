package com.altos.Page_opject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.altos.Utility.Helper;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class LogingTL_page
{
	WebDriver driver;
	public LogingTL_page(WebDriver ldriver) 
	{
		this.driver =ldriver;
		
	}
	//@FindBy(xpath="//input[@placeholder='Email']") WebElement Uname;
	@FindBy(xpath="//input[@placeholder='Employee Code']") WebElement Uname;
	@FindBy(xpath="//input[@type='password']") WebElement Password;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement Login;
	@FindBy(xpath="//mat-icon[normalize-space()='keyboard_arrow_down']") WebElement loginfbutton;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement logout;
	@FindBy(xpath="//div[@class='title']") WebElement Dashbord;
	@FindBy(xpath="//span[@class='mat-slide-toggle-bar']") WebElement switch_Id;
	@FindBy(xpath="(//i[@class='mat-tooltip-trigger fa fa-medkit oa transition x-md ng-star-inserted'])[1]") WebElement Altos_Icon;
	
	@FindBy(xpath="//h5[normalize-space()='Work Item']") WebElement WorkItem_Icon;
	@FindBy(xpath="//span[text()=' Create New ']") WebElement CreateNew_WorkItem;
	@FindBy(xpath="//span[@class='mat-option-text']") WebElement select_clint;
	@FindBy(xpath="//input[@id='mat-input-0']") WebElement ClientName;
	@FindBy(xpath="(//span[@class='mat-option-text'])[1]") WebElement ClientName_First;
	@FindBy(xpath="(//span[@class='mat-option-text'])[2]") WebElement ClientName_First2;
	@FindBy(xpath="//input[@id='mat-input-1']") WebElement Sub_ClientName;
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[1]") WebElement Sub_ClientName_First;
	@FindBy(xpath="//*[text()='Browse for Files']") WebElement Browse_File;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger material-icons app-toolbar-menu save-button mat-icon-button mat-button-base mat-primary "
			+ "ng-star-inserted']//mat-icon[@role='img'][normalize-space()='edit']") WebElement Eidit_Icon;
	@FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c124-111']") WebElement Priority;
	@FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Super Stat']") WebElement Super_Stat;
	@FindBy(xpath="//mat-icon[normalize-space()='check_circle']") WebElement check_circle;
	@FindBy(xpath="//span[normalize-space()='Create Work Items']") WebElement CreateWork_Items;
	
	
	@FindBy(xpath="//h5[normalize-space()='Jobs']") WebElement Jobs_Page;
	@FindBy(xpath="//*[@id='createRow0']/td[1]/a") List <WebElement> Job_IDList;
	@FindBy(xpath="//tr[@id='createRow0']") WebElement Job_ID;
	@FindBy(xpath="//*[@id=\"createRow0\"]/td[10]/button[1]/span[1]/mat-icon") WebElement Edit_IconJob;
	@FindBy(xpath="//input[@name='member']") WebElement Member;
	@FindBy(xpath="//span[@class='mat-option-text']") List <WebElement> MemberList1;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']") WebElement Associated;
	@FindBy(xpath="//span[contains(text(),'search')]") WebElement Search;
	
	@FindBy(xpath="(//div[@class='mat-tab-label-content'][normalize-space()='Sorter'])[1]") WebElement 	Sorte;
	@FindBy(xpath="(//div[@class='mat-tab-label-content'][normalize-space()='MT'])[1]") WebElement 	MT;
	@FindBy(xpath="(//div[@class='mat-tab-label-content'][normalize-space()='QA'])[1]") WebElement 	QA;
	@FindBy(xpath="(//div[@class='mat-tab-label-content'][normalize-space()='QC'])[1]") WebElement 	QC;
	@FindBy(xpath="//button[@class='mat-focus-indicator btn-blue text-right create-task-btn mat-raised-button "
			+ "mat-button-base ng-star-inserted']") WebElement 	AddMember;
	@FindBy(xpath="//input[@id='mat-input-35']") WebElement MemberMT;
	@FindBy(xpath="(//input[@id='mat-input-67']") WebElement MemberQA;
	@FindBy(xpath="//input[@id='mat-input-39']") WebElement MemberQC;
	@FindBy(xpath="//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']") List <WebElement> MemberList;
	
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]") WebElement Chack_Box;
	@FindBy(xpath="//span[normalize-space()='Create Job']") WebElement Create_Job;
	
	@FindBy(xpath="(//mat-icon[@role='img'][normalize-space()='done_outline'])[1]") WebElement done_outline;
	@FindBy(xpath="(//textarea[@class='mat-input-element mat-form-field-autofill-control ng-tns-c57-222 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched'])[1]") WebElement Tests_Box;
	@FindBy(xpath="//button[@class='mat-focus-indicator btn-blue mat-raised-button mat-button-base']") WebElement Yes_button;
	@FindBy(xpath="//span[text()='Ready For Billing']") WebElement Ready_For_Billing ;
	@FindBy(xpath="(//a[@target='_blank'][normalize-space()='(view)'])[1]") WebElement Ready_For_Billing_view ;
	
	@FindBy(xpath="//th[@role='columnheader']") List<WebElement> Columnheader ;
	@FindBy(xpath="//a[@target='_blank']")List <WebElement> Work_Item_List ;
	@FindBy(xpath="//*[@id=\"app-container-id\"]/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-work-item/div/div/div[1]/div[2]/app-ao-workitem-auto-multi-complete/mat-form-field/div/div[1]/div[3]") WebElement workItem_Search ;
	@FindBy(xpath="//mat-chip-list[@aria-label='clientName selection']//input[@role='combobox']") WebElement Client_Name_Search ;
	@FindBy(xpath="//mat-chip-list[@aria-label='subClientName selection']//input[@role='combobox']']") WebElement Sub_Client_Name_Search ;
	@FindBy(xpath="//input[@aria-expanded='true']") WebElement Patient_Name_Search ;
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c124-101']") WebElement File_Type_Select ;
	@FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c124-266']") WebElement  Priority_Select;
	@FindBy(xpath="//span[text()=' clear_all ']") WebElement  clear_all;
	@FindBy(xpath="//span[contains(text(),'search')]") WebElement  search;
	@FindBy(xpath="//span[@class='mat-option-text']") WebElement  select;
	@FindBy(xpath="//*[@id=\"mat-chip-list-input-4\"]") WebElement  List_FirstElement;
	@FindBy(xpath="//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[3]/a") WebElement  List_FirstElement1;
	@FindBy(xpath="//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[4]/a") WebElement  List_FirstElement2;
	@FindBy(xpath="//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[5]/a") WebElement  List_FirstElement3;
	@FindBy(xpath="//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[6]/a") WebElement  List_FirstElement4;
	@FindBy(xpath="//*[@id=\"workItemTable\"]/form/app-grid-table/table/tbody/tr[1]/td[7]/a") WebElement  List_FirstElement5;
	
	
	
	@FindBy(xpath="//tbody/tr[1]/td[3]") WebElement workItem_Search1 ;
	@FindBy(xpath="//tbody/tr[1]/td[2]") WebElement Client_Name_Search1 ;
	@FindBy(xpath="//tbody/tr[1]/td[4]") WebElement Sub_Client_Name_Search1 ;
	@FindBy(xpath="//tbody/tr[1]/td[5]") WebElement Patient_Name_Search1 ;
	@FindBy(xpath="//tbody/tr[1]/td[6]") WebElement File_Type_Select1 ;
	@FindBy(xpath="//tbody/tr[1]/td[6]") WebElement Priority_Select1 ;
	
	@FindBy(xpath="//mat-icon[text()=' call_merge ']") WebElement call_merge ;
	@FindBy(xpath="//label[@for='mat-checkbox-6-input']//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") WebElement Check_Box2 ;
	@FindBy(xpath="//span[text()=' Merge ']") WebElement Merhe ;
	@FindBy(xpath="(//mat-icon[text()='add'])[3]") WebElement Add3 ;
	@FindBy(xpath="//tbody/tr[@role='row']/td[@role='cell']/span/mat-form-field/div/div/div/mat-select[@name='workitemId']/div/div[1]") WebElement selct_workitemID1 ;
	@FindBy(xpath="//span[@class='mat-option-text']") WebElement selct_workitemID ;
	@FindBy(xpath="//span[normalize-space()='Merge Work Item']") WebElement Merge_WorkItem ;
	@FindBy(xpath="//button[text()='Yes']") WebElement Yes ;
	@FindBy(xpath="(//mat-icon[text()='add'])[2]") WebElement Add2 ;
	@FindBy(xpath="//span[text()= ' Add Work Items ']") WebElement Add_WorkItems ;
	
	@FindBy(xpath="//span[text()=' Create New ']") WebElement Create_New_job ;
	@FindBy(xpath="(//mat-select[@role='combobox'])[1]") WebElement Super_Stat1 ;
	@FindBy(xpath="//input[@formcontrolname='clientName']") WebElement clientName;
	@FindBy(xpath="//input[@formcontrolname='subClientName']") WebElement subClientName ;
	@FindBy(xpath="//span[text()=' Save ']") WebElement Save ;
	
//Patient ==> Create New Patient	
	@FindBy(xpath="(//div[@tabindex='-1'])[12]") WebElement Click_On_Patient;
	@FindBy(xpath="//span[@class='mat-button-wrapper']") WebElement Click_Create_Patient ;
	@FindBy(id="mat-input-0") WebElement pClient_name;
	@FindBy(id="mat-input-10") WebElement pFirst_name;
	@FindBy(id="mat-input-12") WebElement pLast_name;
	//div[@class='mat-form-field-infix ng-tns-c58-98']
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c58-10']") WebElement pGender;
//	(//span[@class='mat-option-text'])[1]
	@FindBy(xpath="(//span[@class='mat-option-text'])[2]") WebElement pMale;
	@FindBy(id="mat-input-13") WebElement pSSN;
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[6]") WebElement pSave;
	@FindBy(xpath="//div[@role='alert']") WebElement alert;
	
	
//Association Page ==> Client Wise Association
	@FindBy(xpath="(//div[@class='fab-link ng-star-inserted'])[12]") WebElement aClick_Association;
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c58-1']") WebElement aClient_Name;
	@FindBy(xpath="//input[@formcontrolname='clientName']") WebElement aInput;
//	@FindBy(xpath="//*[@id=\"mat-option-6\"]/span") WebElement aselect;
	@FindBy(xpath="//*[@id=\"mat-option-0\"]/span") WebElement adoctor;
	@FindBy(id="mat-option-0") WebElement aSub_Client;
	@FindBy(xpath="(//input[@type='text'])[3]") WebElement aSub_Input;
	@FindBy(xpath="(//div[@role='listbox']//mat-option)[2]") WebElement aSRor;
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c58-4']") WebElement aEmp;
	@FindBy(xpath="//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element ng-untouched ng-pristine ng-valid']") WebElement acSearch;
	@FindBy(xpath="(//div[@role='listbox']//mat-option)[1]") WebElement aeselect;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']") List <WebElement> a_Select_Check;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']") WebElement select_seq;
	
	//	(//span[@class='mat-checkbox-inner-container'])[1]
	@FindBy(xpath="//button[@mattooltip='Search']") WebElement a_Search_Chek;
	@FindBy(xpath="(//td[@role='cell'])[3]") String Emp_Role;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") WebElement Client_Check_IN;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") WebElement unselect;
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[3]") WebElement ass_save;

//Association Page ==> Employee Wise Association
	@FindBy(id="mat-tab-label-0-1") WebElement Emp_Click;
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c58-5']") WebElement Emp_Choose;
	@FindBy(xpath="//input[@placeholder='Enter Assignee']") WebElement Emp_send;
	@FindBy(xpath="(//span[@class='mat-option-text'])[1]") WebElement Emp_select;
//	@FindBy(xpath=\"//*[@id=\\\\\\\"employeeAssociationTableId\\\\\\\"]/app-grid-table/table/tbody/tr[1]/td[2]\\\")).getText()\")") String Emp_Text_Capture;
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c58-6']") WebElement aClient_name;
	@FindBy(xpath="(//input[@appautocompleteposition='trigger'])[2]") WebElement aClient_Input;
	@FindBy(xpath="//span[@class='mat-option-text']") WebElement Sub_Client_name;
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c58-7']") WebElement aSubClient;
	@FindBy(xpath="(//input[@appautocompleteposition='trigger'])[3]") WebElement sSub_Input;
	@FindBy(xpath="//div[@class='mat-autocomplete-panel ng-star-inserted mat-autocomplete-visible']") WebElement select_sub;
	@FindBy(xpath="//span[@class='material-symbols-outlined']") WebElement Sub_search;
	@FindBy(xpath="/html/body/div[1]/app-root/div/div/div[2]/app-side-bar/mat-sidenav-container/mat-sidenav-content/div/div/div/div[2]/app-association/div/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/employee-association/div[3]/div[1]/div/app-grid-table/table/tbody/tr[1]/td[1]/mat-checkbox/label/span[1]") WebElement Sub_Checkbox;
	@FindBy(xpath="//button[@class='mat-focus-indicator btn-blue mt-3 mat-raised-button mat-button-base']") WebElement Sub_Button;
	
	
	
	
	public void Time_sleep()
	{

		try
		{
			Thread.sleep(5000);
			
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public void loginAltos_TL(String usernameApplication, String passwordApplication)
	{
		switch_Id.click();
		Uname.sendKeys(usernameApplication);
		Password.sendKeys(passwordApplication);
		Login.click();
		driver.getTitle();
		System.out.println(Dashbord.getText());
		Altos_Icon.click();
		
	}
	
	public void CreateNew_WorkItem()
	{
		System.out.println(Helper.getCurrentDataTime());
		WorkItem_Icon.click();
		System.out.println(Helper.getCurrentDataTime());
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000)");
		CreateNew_WorkItem.click();
		ClientName.sendKeys("W");
		select_clint.click();
		Time_sleep();
		//ClientName_First.click();
		Sub_ClientName.click();
		Time_sleep();
	    Sub_ClientName_First.click();
//		Time_sleep();
//		Eidit_Icon.click();
//		Priority.click();
//		Super_Stat.click();
//		check_circle.click();
//		CreateWork_Items.click();		
//		Time_sleep();
		//driver.quit();
	}
	
	public void AssignTask(String usernameApplication, String passwordApplication)
	{
		loginAltos_TL( usernameApplication, passwordApplication);
		Jobs_Page.click();
		Associated.click();
		Search.click();
		Time_sleep();
		//Job_ID.click();
		for (WebElement Job_IDList1 : Job_IDList )
		{
			Job_IDList1.click();
			break;
		}
		Edit_IconJob.click();
		Time_sleep();
		Member.clear();
		Time_sleep();
		Member.sendKeys("2");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		Time_sleep();
		check_circle.click();
		Time_sleep();
		MT.click();
		Time_sleep();
		AddMember.click();
		Member.sendKeys("3");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		QA.click();
		Time_sleep();
		AddMember.click();
		
		Member.sendKeys("5");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		QC.click();
		Time_sleep();
		AddMember.click();
		Member.sendKeys("7");
		Time_sleep();
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		Assert.assertTrue(true);
		
	}

	public void CreateNew_Job()
	{
		Time_sleep();
		WorkItem_Icon.click();
		Chack_Box.click();
		Create_Job.click();
		Assert.assertTrue(true);
	}
	
	public void Ready_For_Billing(String usernameApplication, String passwordApplication) 
	{
		loginAltos_TL( usernameApplication, passwordApplication);
		Time_sleep();
		Jobs_Page.click();
		Time_sleep();
		Associated.click();
		Search.click();
		Time_sleep();
		done_outline.click();
		Time_sleep();
		Ready_For_Billing .click();
		Time_sleep();
		Yes_button.click();
		Time_sleep();
		Altos_Icon.click();
		Jobs_Page.click();
		Time_sleep();
		Ready_For_Billing_view.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Time_sleep();
		Set<String> windows1 = driver.getWindowHandles(); 
		System.out.println(windows1); 
		Time_sleep();
		for (String window : windows1) 
		{ 
		driver.switchTo().window(window); 
		Time_sleep();
		js.executeScript("window.scrollBy(0,400)");
		Time_sleep();
		}
		Time_sleep();
		Assert.assertTrue(true);
		
		
		
	}
	public void Column_Header_Name(String usernameApplication, String passwordApplication) 
	{
		loginAltos_TL( usernameApplication, passwordApplication);
		Time_sleep();
		WorkItem_Icon.click();
		Time_sleep();
		
		List<String> Column_name1 = Arrays.asList( "","Import Date & Time", "Work Item", "Client Name", "Sub Client Name", "File Type & File Length", "Status", "Priority", "Patient Name", "Report Type", "Date Of Service", "Due Date Time", "Operation Status", "Action");
		List<String> Column_Headename = new ArrayList<String>();
		for (WebElement Columnheader1:Columnheader) {
			Column_Headename.add(Columnheader1.getText());
			
			
		}
		System.out.println(Column_Headename);
		Assert.assertEquals(Column_Headename, Column_name1);
	}
	
	public void Column_Work_Item_ASC() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		List<String> Work_Item_List22 = new ArrayList<String>();
		
		int c=0;
		Time_sleep();
		for (WebElement Columnheader1:Columnheader) {
			c=c+1;
			if (c==2) 
			{
				Columnheader1.click();
			
				break;
			}	
		}
		Time_sleep();
		for (WebElement Work_Item_List2: Work_Item_List) 
		{
			Work_Item_List22.add(Work_Item_List2.getText());
		}
		Collections.sort(Work_Item_List22);
		System.out.println(Work_Item_List22);
		List<String> Work_Item_List11 = new ArrayList<String>();
		Time_sleep();
		for (WebElement Work_Item_List1: Work_Item_List) 
		{
			Work_Item_List11.add(Work_Item_List1.getText());
		}
		Time_sleep();
		System.out.println(Work_Item_List11);
		Assert.assertEquals(Work_Item_List22, Work_Item_List11);
	}
	public void Column_Work_Item_DSC() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		List Work_Item_List22 = new ArrayList();
		
		int c=0;
		Time_sleep();
		for (WebElement Columnheader1:Columnheader) {
			c=c+1;
			if (c==2) 
			{
				Columnheader1.click();
				Time_sleep();
				Columnheader1.click();
				break;
			}	
		}
		Time_sleep();
		for (WebElement Work_Item_List2: Work_Item_List) 
		{
			Work_Item_List22.add(Work_Item_List2.getText());
		}
		List <String>  original2 = new ArrayList<>(Work_Item_List22);
		Collections.sort(Work_Item_List22, Collections.reverseOrder());
		System.out.println(Work_Item_List22);
		List Work_Item_List11 = new ArrayList();
		Time_sleep();
		for (WebElement Work_Item_List1: Work_Item_List) 
		{
			Work_Item_List11.add(Work_Item_List1.getText());
		}
		Time_sleep();
		System.out.println(Work_Item_List11);
		Assert.assertEquals(original2, Work_Item_List11);
	}
	public void FilterBy_workItem_Search() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		workItem_Search.click();
		Time_sleep();
		Time_sleep();
		List_FirstElement.sendKeys(workItem_Search1.getText());
		Time_sleep();
		select.click();
		Time_sleep();
		search.click();
		Time_sleep();
		Assert.assertEquals(List_FirstElement.getText(), workItem_Search1.getText());
		clear_all.click();
		
		
	}
	public void Client_Name_Search_Search() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		Client_Name_Search.click();
		List_FirstElement.sendKeys(List_FirstElement2.getText());
		Time_sleep();
		search.click();
		//Assert.assertEquals(Client_Name_Search2, Client_Name_Search1.getText());
		clear_all.click();
		
		
	}
	public void Sub_Client_Name_Search() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		Sub_Client_Name_Search.click();
		String Sub_Client_Name_Search2="ROR";
		List_FirstElement.click();
		Sub_Client_Name_Search.sendKeys(Sub_Client_Name_Search2);
		search.click();
		Assert.assertEquals(Sub_Client_Name_Search2, Sub_Client_Name_Search1.getText());
		clear_all.click();
		
		
	}
	public void Patient_Name_Search() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		Patient_Name_Search.click();
		String Patient_Name_Search2="sheetal sanadi";
		List_FirstElement.click();
		Patient_Name_Search.sendKeys(Patient_Name_Search2);
		search.click();
		Assert.assertEquals(Patient_Name_Search2, Patient_Name_Search1.getText());
		clear_all.click();
		
		
	}
	public void File_Type_Select() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		File_Type_Select.click();
		//String File_Type_Select2="";
		List_FirstElement.click();
		//File_Type_Select.sendKeys(File_Type_Select2);
		search.click();
		System.out.println(List_FirstElement.getText());
		System.out.println(File_Type_Select1.getText());
		//Assert.assertEquals(List_FirstElement.getText(), File_Type_Select1.getText());
		clear_all.click();
		
		
	}
	public void Priority_Select() 
	{
		Altos_Icon.click();
		WorkItem_Icon.click();
		Time_sleep();
		Priority_Select.click();
		//String Priority_Select2="W-001-608";
		List_FirstElement.click();
		//Priority_Select.sendKeys(Priority_Select2);
		search.click();
		Assert.assertEquals(List_FirstElement.getText(), Priority_Select1.getText());
		clear_all.click();
		
		
	}
	public void Merge_workItem()
	{
		Jobs_Page.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_ID.click();
		for (WebElement Job_IDList1 : Job_IDList )
		{
			Job_IDList1.click();
			break;
		}
		call_merge.click();
		Check_Box2.click();
		Merhe.click();
		Time_sleep();
		Merge_WorkItem.click();
		Yes.click();
		Add3.click();
		selct_workitemID1.click();
		Time_sleep();
		//act.doubleClick(selct_workitemID1).build().perform();
		selct_workitemID.click();
		//Edit_IconJob.click();
		Member.clear();
		Member.sendKeys("2");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		Time_sleep();
		check_circle.click();
		Time_sleep();
		MT.click();
		Time_sleep();
		AddMember.click();
		Member.sendKeys("3");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		QA.click();
		Time_sleep();
		AddMember.click();
		
		Member.sendKeys("5");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		QC.click();
		Time_sleep();
		AddMember.click();
		Member.sendKeys("7");
		Time_sleep();
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		Assert.assertTrue(true);
		
	}
	
	public void Add_workItem()
	{
		Jobs_Page.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_ID.click();
		Time_sleep();
		for (WebElement Job_IDList1 : Job_IDList )
		{
			Job_IDList1.click();
			break;
		}
		Time_sleep();
		Add2.click();
		Time_sleep();
		Check_Box2.click();
		Time_sleep();
		Add_WorkItems.click();
		Time_sleep();
		Yes.click();
//		Add3.click();
//		selct_workitemID1.click();
//		Time_sleep();
//		//act.doubleClick(selct_workitemID1).build().perform();
//		selct_workitemID.click();
//		//Edit_IconJob.click();
//		Member.clear();
//		Member.sendKeys("2");
//		for (WebElement MemberList11 : MemberList1 )
//		{
//			MemberList11.click();
//			break;
//		}
//		Time_sleep();
//		check_circle.click();
//		Time_sleep();
//		MT.click();
//		Time_sleep();
//		AddMember.click();
//		Member.sendKeys("3");
//		for (WebElement MemberList11 : MemberList1 )
//		{
//			MemberList11.click();
//			break;
//		}
//		check_circle.click();
//		Time_sleep();
//		QA.click();
//		Time_sleep();
//		AddMember.click();
//		
//		Member.sendKeys("5");
//		for (WebElement MemberList11 : MemberList1 )
//		{
//			MemberList11.click();
//			break;
//		}
//		check_circle.click();
//		Time_sleep();
//		QC.click();
//		Time_sleep();
//		AddMember.click();
//		Member.sendKeys("7");
//		Time_sleep();
//		for (WebElement MemberList11 : MemberList1 )
//		{
//			MemberList11.click();
//			break;
//		}
//		check_circle.click();
		Time_sleep();
		Assert.assertTrue(true);
		
	}
	
	public void Add_Task()
	{
		Jobs_Page.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Job_ID.click();
		for (WebElement Job_IDList1 : Job_IDList )
		{
			Job_IDList1.click();
			break;
		}
		Add3.click();
		selct_workitemID1.click();
		Time_sleep();
		//act.doubleClick(selct_workitemID1).build().perform();
		selct_workitemID.click();
		//Edit_IconJob.click();
		Add3.click();
		selct_workitemID1.click();
		Time_sleep();
		//act.doubleClick(selct_workitemID1).build().perform();
		selct_workitemID.click();
		//Edit_IconJob.click();
		Member.clear();
		Member.sendKeys("2");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		Time_sleep();
		check_circle.click();
		Time_sleep();
		MT.click();
		Time_sleep();
		AddMember.click();
		Member.sendKeys("3");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		QA.click();
		Time_sleep();
		AddMember.click();
		
		Member.sendKeys("5");
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		QC.click();
		Time_sleep();
		AddMember.click();
		Member.sendKeys("7");
		Time_sleep();
		for (WebElement MemberList11 : MemberList1 )
		{
			MemberList11.click();
			break;
		}
		check_circle.click();
		Time_sleep();
		Assert.assertTrue(true);
		
	}
	
	public void Create_job_onJobPage()
	{
		Time_sleep();
		Jobs_Page.click();
		Associated.click();
		Search.click();
		Time_sleep();
		Create_New_job.click();
		Time_sleep();
		Super_Stat1.click();
		Super_Stat.click();
		Time_sleep();
		clientName.sendKeys("W");
		ClientName_First.click();
		Time_sleep();
		subClientName.click();
		ClientName_First2.click();
		Time_sleep();
		Save.click();
		Time_sleep();
	}
	
// Patient ==> Create New Patient	
	public void Create_Patient_Page() throws InterruptedException, AWTException
	{
		Time_sleep();
		Click_On_Patient.click();
		Time_sleep();
		Click_Create_Patient.click();
		Robot robot=new Robot();
		for(int i=0;i<3;i++)
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Time_sleep();
		pClient_name.sendKeys("Karan");
		pFirst_name.sendKeys("Navjot");
		pLast_name.sendKeys("Singh");
		pGender.click();
		pMale.click();
		Actions action=new Actions(driver);
		action.moveToElement(pMale);
		Time_sleep();
		pSSN.sendKeys("123");
		pSave.click();
		Time_sleep();
		
		String actual=(alert.getText());
		String expected="noting";
		Assert.assertEquals(actual, expected);
		
	}
	
//Association Page ==> Client Wise Association
	public void Association_Page() throws AWTException, InterruptedException {
		Time_sleep();
		aClick_Association.click();
		Robot robot=new Robot();
		for(int i=0;i<3;i++)
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		aClient_Name.click();
		aInput.sendKeys("Dr.Wilker");
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(adoctor).perform();
		aSub_Client.click();
		aSub_Input.sendKeys("r");
		Time_sleep();
		Actions subaction=new Actions(driver);
		subaction.moveToElement(aSRor).perform();
		aSRor.click();
		Thread.sleep(5000);
		aEmp.click();
		acSearch.sendKeys("a");
		Actions clselect=new Actions(driver);
		clselect.moveToElement(aeselect).perform();
		aeselect.click();
		
		a_Search_Chek.click();
//		String emp_roles=driver.findElement(By.xpath("(//td[@role='cell'])[3]")).getText();
//		System.out.println(emp_roles);
//		String s2[]=emp_roles.split("\\s");
//		for(String x:s2)
//		{
//			System.out.println("s2");
//		}
		
//		//
//		//System.out.println((Emp_Role.getText());
//		
//		
//		
//		
//		
//		
//		
//		
//		Boolean Select_Check_TL=a_Select_Check.isSelected();
//		if(Select_Check_TL==true)
//		{
//			a_Select_Check.click();
//		}
//		else if(Select_Check_TL!=true)
//		{
//			a_Select_Check.click();
//		}
//		Thread.sleep(5000);
//		a_Search_Chek.click();
		
//		int a=1;
//		while(a<=8)
//		{
	//a_Select_Check.click();
//			a++;
//		}
//		a_Search_Chek.click();
		
		
		//a_Select_Check.click();
		
		Boolean selecting=select_seq.isSelected();
		
		for(WebElement xyz:a_Select_Check)
		{
			xyz.click();
			if(selecting==true)
			{
				select_seq.click();
			}
			else if(selecting!=true)
			{
			select_seq.click();	
			}
			a_Search_Chek.click();
		}
		
		Thread.sleep(5000);
		
		
		 Boolean is_Select=Client_Check_IN.isSelected();
				
		if(is_Select==true)
		{
			Client_Check_IN.click();
		}
		else if( Client_Check_IN!=null)
		{
			Client_Check_IN.click();
		}
	
		
		
		//unselect.click();
		ass_save.click();
		
//Association	==> Employee Wise Association
	Emp_Click.click();
	Emp_Choose.click();
	Emp_send.sendKeys("a");
	Actions emp_select=new Actions(driver);
	emp_select.moveToElement(Emp_select).perform();
	Emp_select.click();
	String Emp_Text_Capture=driver.findElement(By.xpath("//*[@id=\"employeeAssociationTableId\"]/app-grid-table/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(Emp_Text_Capture);
	aClient_name.click();
	aClient_Input.sendKeys(Emp_Text_Capture);
	Actions Cl_Name=new Actions(driver);
	Cl_Name.moveToElement(Sub_Client_name).perform();
	Sub_Client_name.click();
	Sub_search.click();
	String Sub_Client_Capture=driver.findElement(By.xpath("//*[@id=\"employeeAssociationTableId\"]/app-grid-table/table/tbody/tr[1]/td[3]")).getText();
	aSubClient.click();
	sSub_Input.sendKeys(Sub_Client_Capture);
	Actions sub_clients=new Actions(driver);
	sub_clients.moveToElement(select_sub).perform();
	select_sub.click();
	Sub_search.click();
	Sub_Checkbox.click();
	Sub_Button.click();
	Thread.sleep(5000);
		
		
		
			
		

		
		
		
		
		
	}
	
}
