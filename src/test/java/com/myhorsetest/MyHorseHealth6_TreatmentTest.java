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
import pom.myhorsepages.MyHorseHealth6_Treatment;
import pom.myhorsepages.Myhorselisting;

public class MyHorseHealth6_TreatmentTest  extends Base {
	LoginPage logpage = null;

	Myhorselisting  action = null;
	MyHorseHealth6_Treatment MyHorseHealth6_TreatmentAction =null;
	
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
	
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
	
		action = new Myhorselisting(driver);
		MyHorseHealth6_TreatmentAction = new MyHorseHealth6_Treatment(driver);
		
		
	
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
	 
	  MyHorseHealth6_TreatmentAction.ClickMyHorseRe(); 
	  

	  MyHorseHealth6_TreatmentAction.MyHorseHealth_Treatment_AddTreatment();
	  
	  MyHorseHealth6_TreatmentAction.MyHorseHealth_Treatment_EditTreatment();
	  MyHorseHealth6_TreatmentAction.MyHorseHealth_Treatment_DeletTreatment();
	  
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
