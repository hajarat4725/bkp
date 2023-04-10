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
import pom.myhorsepages.MyHorseAchivement;
import pom.myhorsepages.MyHorseMeasurement;
import pom.myhorsepages.Myhorselisting;



public class MyHorseMeasurementTest extends Base {
	
LoginPage logpage = null;
	
	Myhorselisting action = null;
	
	MyHorseMeasurement MeasurementAction = null;
	
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		
		action = new Myhorselisting(driver);
		
		MeasurementAction = new MyHorseMeasurement(driver);
		
		
		
		
	}
	
	@BeforeMethod
	
	public void PreconditionForPicVideo() throws InterruptedException {
		Reporter.log("My horse  Measurement  actions ", true);
		  
		
		
	}

	
	
	
  @Test
  public void MyHorseMeasurement() throws InterruptedException, AWTException {
	  
	// Object Of My horse listing POM Class
	  
	  action.ClickAljumanMyhorselisting();
	  action.ClickAljumanMyhorsAddHorseButton();
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
		
	  action.setAljumanMyhors_search();
	 
	  
	 /*-----------------------------------------------------------------------------------------------------------*/ 
	  
	  MeasurementAction.ClickMyHorseRe();
	  MeasurementAction.ClickMyHorseMeasurement();
	  
	  MeasurementAction.MyHorseMeasurement_Add();
	  
	  MeasurementAction.MyHorseMeasurement_Edit();
	  MeasurementAction.MyHorseMeasurement_Delete();
	  
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
		driver.close();
	}
  
  
  
  
  
  
  
  
  
}
