package com.myhorsetest;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myhorse.Framwork.Base;
import com.myhorse.Framwork.Common;

import bsh.Capabilities;
import pom.myhorsepages.LoginPage;
import pom.myhorsepages.MyHorseNote;
import pom.myhorsepages.Myhorselisting;

public class MyhorseNoteTest extends Base  {
	
	LoginPage logpage = null;
	MyHorseNote action1 = null;
	Myhorselisting  action = null;
	
	@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		action1 = new MyHorseNote(driver);
		action = new Myhorselisting(driver);
		
		
		
	}
	
	@BeforeMethod
	
	public void PreconditionForNote () throws InterruptedException {
		Reporter.log("My horse Listing actions ", true);
		  
		
		
	}
	
	
	
	
  @Test(priority = 1)
  public void MyHorseNote() throws InterruptedException, AWTException {
	  
	  
	  // Object Of My horse listing POM Class
	  
	  action.ClickAljumanMyhorselisting();
	  action.ClickAljumanMyhorsAddHorseButton();
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
		
	  action.setAljumanMyhors_search();
	 
	 /*-----------------------------------------------------------------------------------------------------------*/ 
	  
	  
	  
	  action1.ClickMyHorseRe();
	  
	  action1.MyHorseNoteAddNote();
	  action1.MyHorseNoteEditNote();  
	  action1.MyHorseNoteDeletNote();
	  
	  /*-------------------------------------------------------------------------------------------------------------*/  
	  action.ClickAljumanMyhorselisting(); 
	  action.setAljumanMyhors_search();
	  action.ClickAljumanMyhorSearch_ReDelete();      //Delete Horse 
	  
     /*-------------------------------------------------------------------------------------------------------------*/   
	  
	  
	   
	  
	  
	  
	  
	  
	  
	  
  }
  
//  @Test(priority = 2)
//  public void MyHorseAddNote() throws InterruptedException {
//	  
//
//	  
//	  MyHorseNote action1 = new MyHorseNote(driver);
//	  action1.MyHorseNoteAddNote();
//	 
//	  
//	 
//	  
//	  
//  }
  
//  @Test(priority = 3)
//  public void MyHorseEditNote() throws InterruptedException {
//	  
//	  MyHorseNote action1 = new MyHorseNote(driver);
//	  action1.MyHorseNoteEditNote();
//	 
//	  
//  }
  
// @Test(priority = 4)
//  public void MyHorseDeletNote() throws InterruptedException {
//	  
//
//	  
//	  MyHorseNote action1 = new MyHorseNote(driver);
//	  action1.MyHorseNoteDeletNote();
//	  
//  }
//  
  
  
  
  
  
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
