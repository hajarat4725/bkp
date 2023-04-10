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
import pom.myhorsepages.MyHorseDiet;
import pom.myhorsepages.MyHorseFarrier;
import pom.myhorsepages.Myhorselisting;



public class MyHorseDieTest extends Base{
	
	

	LoginPage logpage = null;
	MyHorseDiet Dietaction = null;
	Myhorselisting  action = null;
	
	@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		Dietaction = new MyHorseDiet(driver);
		action = new Myhorselisting(driver);
		
		
		
	}
	
	@BeforeMethod
	
	public void PreconditionForFarrier () throws InterruptedException {
		Reporter.log("My horse diet Listing actions ", true);
		  
		
		
	}
	
	
	
	
  @Test
  public void MyHorseDie() throws AWTException, InterruptedException {
	  
	  

		// Object Of My horse listing POM Class
		  
		  action.ClickAljumanMyhorselisting();
		  action.ClickAljumanMyhorsAddHorseButton();
		  action.setAljumanMyhorsAddHorse_name();
		  action.setAljumanMyhorsAddHorse_Sex();
		  action.setAljumanMyhorsAddHorse_Status();
		  action.ClickAljumanMyhorsAddHorse_Addbutton();
			
		  action.setAljumanMyhors_search();
		 
		  
		 /*-----------------------------------------------------------------------------------------------------------*/ 
		  
		  Dietaction.ClickMyHorseRe();
		  Dietaction.MyHorseDietAddDiet();
	  
		  Dietaction.MyHorseDietEditDiet();
		  
		  Dietaction.MyHorseDietDeletDiet();
	  
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
