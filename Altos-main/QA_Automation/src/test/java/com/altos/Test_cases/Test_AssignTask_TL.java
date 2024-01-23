package com.altos.Test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altos.Page_opject.BaseClass;
import com.altos.Page_opject.LogingTL_page;
import com.altos.Utility.ConfingLoginData;


public class Test_AssignTask_TL extends BaseClass 
{
	@Test
	public void AssignTask() 
	{
		logger=report.createTest(" TL Assign Task ");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		LogingTL_page Loging_page= PageFactory.initElements(driver, LogingTL_page.class);
		Loging_page.AssignTask(ConfigLogin.getTL_ID(), ConfigLogin.getPassword());
		logger.pass("The TL Assign Task shows Success shows Success");
		//Loging_page.CreateNew_WorkItem();
		
	}
	
}
