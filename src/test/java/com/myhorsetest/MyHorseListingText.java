package com.myhorsetest;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myhorse.Framwork.Base;

import pom.myhorsepages.LoginPage;
import pom.myhorsepages.Myhorselisting;

public class MyHorseListingText extends Base{
	
	LoginPage logpage = null;
	Myhorselisting  action = null;
	
	@BeforeClass
	public void browserLaunch() throws AWTException, InterruptedException {
		Reporter.log("Browser open", true);
		
		browserInitialize();
		
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		
		action = new Myhorselisting(driver);
		
	}
	
	@BeforeMethod
	public void demo() {
		Reporter.log("before method", true);
		
	}
	
	 @Test(priority = 1)
  public void MyHorseListingaction () throws InterruptedException,AWTException   {
	//  Reporter.log("My horse Listing actions ", true);
	  
	//  Myhorselisting  action = new Myhorselisting(driver); // Object Of My horse listing POM Class
	  
		 Reporter.log("MyHorseListingaction", true);
     action.ClickAljumanMyhorselisting();  // Click on my horse tab from side bar
		  
	  action.ClickAljumanMyhorsStalliontab();  // Click on stallion tab of 3 box 
	
	  action.ClickAljumanMyhorsMaretab(); // Click on Mare  tab of 3 box 
	  
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	  action.ClickAljumanMyhorsAddHorseButton(); // Click on add button ,
	  
	  action.setAljumanMyhorsAddHorse_name();
	  action.setAljumanMyhorsAddHorse_Sex();
	  action.setAljumanMyhorsAddHorse_Status();
	  action.ClickAljumanMyhorsAddHorse_Addbutton();
	  
	  action.setAljumanMyhors_search();
	  
	  action.ClickAljumanMyhorSearch_Rclick();
	  
	  action.ClickAljumanMyhorSearch_REdit();
	  
	  
	  action.ClickAljumanMyhorSearch_ReDelete();
	  
	 
	  
  }
  
  @AfterMethod
  public void mydemo() {
	  Reporter.log("After method", true);
		
	}
  
  @AfterClass
	public void browserclose() {
		Reporter.log("Browserclose", true);
		
     driver.close();
	}
  
}
