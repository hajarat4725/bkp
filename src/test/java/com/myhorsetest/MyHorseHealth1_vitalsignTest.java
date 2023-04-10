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
import pom.myhorsepages.MyHorseHealth1_Vitalsign;
import pom.myhorsepages.MyHorseHealth2_Vaccination;
import pom.myhorsepages.MyHorseHealth3_ParasiteControl;
import pom.myhorsepages.MyHorseHealth4_Dental;
import pom.myhorsepages.MyHorseHealth5_VetclinicVisit;
import pom.myhorsepages.MyHorseHealth6_Treatment;
import pom.myhorsepages.MyHorseHealth7_Labtest;
import pom.myhorsepages.MyHorseHealth8_Xray;
import pom.myhorsepages.MyHorseNote;
import pom.myhorsepages.Myhorselisting;

public class MyHorseHealth1_vitalsignTest extends Base {
	
	LoginPage logpage = null;
	
	Myhorselisting  action = null;
	
	MyHorseHealth1_Vitalsign Healthaction_viatl = null;
	
	

	
	@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
	
		action = new Myhorselisting(driver);
		
		Healthaction_viatl = new MyHorseHealth1_Vitalsign(driver);
		
	
	
		
	}
	
	@BeforeMethod
	
	public void PreconditionForHealth() throws InterruptedException {
		Reporter.log("My horse health actions ", true);
		  
		
		
	}
	
	
	
  @Test
  public void MyHorseHealth_Vitalsign() throws AWTException, InterruptedException {
	  
	  
  // Object Of My horse listing POM Class
	  
	  action.ClickAljumanMyhorselisting();
	  action.ClickAljumanMyhorsAddHorseButton();
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
		
	  action.setAljumanMyhors_search();
	 
	 /*-----------------------------------------------------------------------------------------------------------*/ 
	  
	  
	  
	  Healthaction_viatl.ClickMyHorseRe();
	  
	
	  Healthaction_viatl.MyHorseHealth_VitalsignAddvital();
	  Healthaction_viatl.MyHorseHealth_VitalsignEditVital();
	  Healthaction_viatl.MyHorseHealth_VitalsignDeletVital();
	  
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
