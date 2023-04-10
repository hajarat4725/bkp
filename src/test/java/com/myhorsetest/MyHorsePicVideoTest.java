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
import pom.myhorsepages.MyHorseNote;
import pom.myhorsepages.MyHorsePicVideo;
import pom.myhorsepages.Myhorselisting;

public class MyHorsePicVideoTest extends Base{
	LoginPage logpage = null;
	
	Myhorselisting action = null;
	
	MyHorsePicVideo PicVideoAction = null;
	
	
@BeforeClass
	
	public void browserLaunch () throws AWTException, InterruptedException  {
		
		
Reporter.log("Browser open", true);
		
		browserInitialize();
		logpage = new LoginPage(driver);
		logpage.setAljumanloginPage();
		
		PicVideoAction = new MyHorsePicVideo(driver);
		action = new Myhorselisting(driver);
		
		
		
	}
	
	@BeforeMethod
	
	public void PreconditionForPicVideo() throws InterruptedException {
		Reporter.log("My horse PicVideo  actions ", true);
		  
		
		
	}
	
	
	
	
	
	
	
  @Test
  public void MyHorsePicVideo() throws AWTException, InterruptedException {
	  
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
	  PicVideoAction.ClickMyHorseRe();
	  
	  PicVideoAction.ClickMyHorsePicVideoPictureVideo();
	  Thread.sleep(2000);
	  PicVideoAction.MyHorsePicVideoAddPicture();
	  Thread.sleep(2000);
	  PicVideoAction.MyHorsePicVideoEditPicture();
	  Thread.sleep(2000);
	  PicVideoAction.MyHorsePicVideoDeletePicture();
	  
	//  PicVideoAction.MyHorsePicVideoPrivatePicture();
	  
	  
	  
	  PicVideoAction.MyHorsePicVideoAddVideo();
	  PicVideoAction.MyHorsePicVideoEditVideo();
	  
	  PicVideoAction.MyHorsePicVideoDeleteVideo();
	  
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


