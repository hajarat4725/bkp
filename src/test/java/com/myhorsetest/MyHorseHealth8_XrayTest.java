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
import pom.myhorsepages.MyHorseHealth8_Xray;
import pom.myhorsepages.Myhorselisting;

public class MyHorseHealth8_XrayTest  extends Base {
	LoginPage logpage = null;

	Myhorselisting  action = null;
	
	MyHorseHealth8_Xray MyHorseHealth8_XrayAction = null;
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
        Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
	
		action = new Myhorselisting(driver);
		
		MyHorseHealth8_XrayAction = new MyHorseHealth8_Xray(driver);
		
	
	}
	
	@BeforeMethod
	
	public void PreconditionForNote () throws InterruptedException {
		Reporter.log("My horse health actions ", true);
		  
		
		
	}
	
	
	
  @Test
  public void MyHorseHealth8_Xray () throws AWTException, InterruptedException {
	  
	  
// Object Of My horse listing POM Class
	  
	  action.ClickAljumanMyhorselisting();
	  action.ClickAljumanMyhorsAddHorseButton();
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
		
	  action.setAljumanMyhors_search();
	 
	 /*-----------------------------------------------------------------------------------------------------------*/ 
	 
	  MyHorseHealth8_XrayAction.ClickMyHorseRe(); 
	
	  MyHorseHealth8_XrayAction.MyHorseHealth_Xray_AddXray();
	  
	  MyHorseHealth8_XrayAction.MyHorseHealth_Xray_EditXray();
	  
	  MyHorseHealth8_XrayAction.MyHorseHealth_Xray_DeletXray();
	  
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
