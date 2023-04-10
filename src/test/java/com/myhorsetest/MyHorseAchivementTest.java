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
import pom.myhorsepages.MyHorsePicVideo;
import pom.myhorsepages.Myhorselisting;

public class MyHorseAchivementTest extends Base {
	
	
LoginPage logpage = null;
	
	Myhorselisting action = null;
	
	MyHorseAchivement AchivementAction = null;
	
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		
		AchivementAction = new MyHorseAchivement(driver);
		action = new Myhorselisting(driver);
		
		
		
	}
	
	@BeforeMethod
	
	public void PreconditionForPicVideo() throws InterruptedException {
		Reporter.log("My horse  Achivement  actions ", true);
		  
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  
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
		  AchivementAction.ClickMyHorseRe(); 
		  AchivementAction.ClickMyHorseAchivement();
		  AchivementAction.MyHorseAchivement_Add();
		  AchivementAction.MyHorseAchivement_Edit();
		  AchivementAction.MyHorseAchivement_Delete();
		//AchivementAction.MyHorseAchivement_MedalRanking();
	  
	  
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
