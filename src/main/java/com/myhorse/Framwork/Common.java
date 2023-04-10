package com.myhorse.Framwork;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;



public class Common  {

	
	
	private static final File TakeScreenshot = null;
	protected WebDriver driver;

	public Common() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	
	
	
	
	 public void takescreenshot(String testCase) 
	 {

		
		 try {
				String date = new SimpleDateFormat("MMDDYYYY").format(new Date());

				String filename = testCase;

				File filedrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
//				FileUtils.copyFile()
				Files.copy(filedrc, new File(System.getProperty("user.dir") + "\\screenshots\\" + date + "\\" + filename + ".png"));
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		 
		 
		 
		 
	 }
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void fileUpload(WebElement element, String fileLocation){
		
		try {
			Robot robot = new Robot();
			robot.delay(2000);
			element.click();
			
			StringSelection stringselection = new StringSelection(fileLocation);
			
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
			
			
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.delay(1000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			 
			robot.delay(1000);
			
			
			
		}catch (Exception exp) {
			// TODO: handle exception
			
			System.out.println(exp.getMessage());
			
			
			
		}
		
		
		
	}
	
	
}
