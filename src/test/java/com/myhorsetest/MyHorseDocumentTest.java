package com.myhorsetest;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myhorse.Framwork.Base;

import pom.myhorsepages.LoginPage;


import pom.myhorsepages.Myhorselisting;




public class MyHorseDocumentTest extends Base{
	
	LoginPage	logpage = null;

	Myhorselisting action = null;
	
	pom.myhorsepages.MyHorseDocument  DocumentAction = null;
	
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		
		
		action = new Myhorselisting(driver);
		
		DocumentAction = new pom.myhorsepages.MyHorseDocument(driver);
		
	}



	
	@BeforeMethod
	
	public void PreconditionForPicVideo() throws InterruptedException {
		Reporter.log("My horse MyHorseUploadDocument actions ", true);
		  
		
		
	}
	
	
	
	
	
	
  @Test
  public void MyHorseDocument() throws AWTException, InterruptedException {
	  
	  
	  
 // Object Of My horse listing POM Class
	  
	  action.ClickAljumanMyhorselisting();
	  action.ClickAljumanMyhorsAddHorseButton();
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
		
	  action.setAljumanMyhors_search();
	 
	 /*-----------------------------------------------------------------------------------------------------------*/ 
	  
	  
	  Thread.sleep(3000);
	  DocumentAction.ClickMyHorseRe();
	  
	  
	  DocumentAction.MyHorseUploadDocument_Upload();
	  
	  DocumentAction.MyHorseUploadDocument_View();
	
	

	  
	  DocumentAction.MyHorseUploadDocument_Download();
	  DocumentAction.MyHorseUploadDocument_Delete();
	  
	  /*-------------------------------------------------------------------------------------------------------------*/  
	  action.ClickAljumanMyhorselisting(); 
	  action.setAljumanMyhors_search();
	  action.ClickAljumanMyhorSearch_ReDelete();      //Delete Horse 
	  
     /*-------------------------------------------------------------------------------------------------------------*/   
	  
	 
	  
	  
  }
  
  
  @AfterMethod
  public void mydemo() {
	  Reporter.log("before method", true);
		
	}
  
  @AfterClass
	public void browserclose() {
		Reporter.log("Browserclose", true);
		driver.quit();
	}
  
  
  
  
  
  
  
  
  
}
