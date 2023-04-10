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
import pom.myhorsepages.MyHorseHealth4_Dental;
import pom.myhorsepages.Myhorselisting;

public class MyHorseHealth4_DentalTest   extends Base {

	LoginPage logpage = null;

	Myhorselisting  action = null;
	MyHorseHealth4_Dental HealthAction_denatl = null;
	
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
	
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
	
		action = new Myhorselisting(driver);
		HealthAction_denatl = new  MyHorseHealth4_Dental(driver);
		
		
	
	}
	
	@BeforeMethod
	
	public void PreconditionForNote () throws InterruptedException {
		Reporter.log("My horse health actions ", true);
		  
		
		
	}
	
	
	
	
	
	

	
	
  @Test
  public void MyHorseHealth4_Dental () throws AWTException, InterruptedException {
	  
	  
// Object Of My horse listing POM Class
	  
	  action.ClickAljumanMyhorselisting();
	  action.ClickAljumanMyhorsAddHorseButton();
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
		
	  action.setAljumanMyhors_search();
	 
	 /*-----------------------------------------------------------------------------------------------------------*/ 
	 
	  HealthAction_denatl.ClickMyHorseRe(); 
	  
	  
  /*-----------------------------------------------------------------------------------------------------------*/ 
	  
	  HealthAction_denatl.MyHorseHealth_DentalAddDental();
	  HealthAction_denatl.MyHorseHealth_DentalEditDental();
	  HealthAction_denatl.MyHorseHealth_DentalDeletDental();
	  
  /*-----------------------------------------------------------------------------------------------------------*/   
	  
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
