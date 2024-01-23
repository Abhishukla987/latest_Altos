package com.altos.Utility;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfingLoginData {

	Properties pro;
	public ConfingLoginData() {
		File src=new File(".\\Config\\Login.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		
		}
		catch (Exception e) 
		{
			System.out.println("Not able to load config file>>"+e.getMessage());
		}
		
		
	}
	
	public String getDataFromLogin(String KeyTosearch)
	{
		return pro.getProperty(KeyTosearch);
		
	}
	public String getTL_ID()
	{
		return pro.getProperty("TL_ID");
	}
	
	public String getSortar_ID()
	{
		return pro.getProperty("Sortar_ID");
		
		
	}
	public String getPassword()
	{
		return pro.getProperty("Password");
	}
	
	public String getMT_ID()
	{
		return pro.getProperty("MT_ID");
	}
	
	public String getQA_ID()
	{
		return pro.getProperty("QA_ID");
	}
	public String getQC_ID()
	{
		return pro.getProperty("QC_ID");
	}
	
	public String getPassword1()
	{
		return pro.getProperty("Password1");
	}

}
