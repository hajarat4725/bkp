package com.myhorsetest;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myhorse.Framwork.Base;

import pom.myhorsepages.LoginPage;
import pom.myhorsepages.MyHorseFarrier;
import pom.myhorsepages.MyHorseNote;
import pom.myhorsepages.Myhorselisting;


public class MyHorseFarrierTest extends Base{
	
	
	
	LoginPage logpage = null;
	MyHorseFarrier Farrieraction = null;
	Myhorselisting  action = null;
	
	@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		Farrieraction = new MyHorseFarrier(driver);
		action = new Myhorselisting(driver);
		
		
		
	}
	
	@BeforeMethod
	
	public void PreconditionForFarrier () throws InterruptedException {
		Reporter.log("My horse farrier Listing actions ", true);
		  
		
		
	}
	
	
	
	
	
	
	
	
	
	
  @Test
  public void MyHorseFarrier() throws AWTException, InterruptedException {
	  
	  
	  
		// Object Of My horse listing POM Class
		  
		  action.ClickAljumanMyhorselisting();
		  action.ClickAljumanMyhorsAddHorseButton();
		  action.setAljumanMyhorsAddHorse_name();
		  action.setAljumanMyhorsAddHorse_Sex();
		  action.setAljumanMyhorsAddHorse_Status();
		  action.ClickAljumanMyhorsAddHorse_Addbutton();
			
		  action.setAljumanMyhors_search();
		 
		  
		 /*-----------------------------------------------------------------------------------------------------------*/ 
		  
		  Farrieraction.ClickMyHorseRe();
	  
		  Farrieraction.MyHorseFarrierAddFarrier();
	  
		  Farrieraction.MyHorseFarrierEditFarrier();
	  
		  Farrieraction.MyHorseFarrierDeletFarrier();
	  
		  /*-------------------------------------------------------------------------------------------------------------*/  
		  action.ClickAljumanMyhorselisting(); 
		  action.setAljumanMyhors_search();
		  action.ClickAljumanMyhorSearch_ReDelete();
		  
	    /*-------------------------------------------------------------------------------------------------------------*/   
	  
	  
	  
	  
  }
  
  @AfterMethod
  public void mydemo() {
	  Reporter.log("before method", true);
		
	}
  
  @AfterClass
	public void browserclose() {
		Reporter.log("Browserclose", true);
		
		driver.close();
	}
  
  
  
  
  
  
  
  
  
}
