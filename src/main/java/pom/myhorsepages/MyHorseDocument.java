package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhorse.Framwork.Base;
import com.myhorse.Framwork.Common;

public class MyHorseDocument {

	

	Base base = new Base();
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[11]") private WebElement ClickMyHorseDocument;
	
	
	@FindBy(xpath="(//img[@alt=\"Upload\"])[1]") private WebElement ClickMyHorseDocument_UploadOwnershipCirtificate;
	
	@FindBy(xpath="(//img[@alt=\"Upload\"])[2]") private WebElement ClickMyHorseDocument_UploadPassport;
	
	@FindBy(xpath="(//img[@alt=\"Upload\"])[3]") private WebElement ClickMyHorseDocument_UploadVaccination;
	
	
	
	/*---------------------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/div/a[2]/img") private WebElement ClickMyHorseDocument_DownloadOwnershipCirtificate;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/div/a[1]/img") private WebElement ClickMyHorseDocument_ViewOwnershipCirtificate;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/div/a[3]/img") private WebElement ClickMyHorseDocument_DeleteOwnershipCirtificate;

	@FindBy(xpath="(//button[@type=\"button\"])[15]") private WebElement ClickMyHorseDocument_DeleteConfirmButton;
	/*---------------------------------------------------------------------------------------------------------------------------------*/
	
	public MyHorseDocument(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickMyHorseRe() throws AWTException, InterruptedException {
		
		myhorse_searchRclick.click();
		Thread.sleep(2000);
//		base.zoom();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
	}
	
	
	
	
public void MyHorseUploadDocument_Upload() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseDocument.click();
	
		
		Thread.sleep(2000);

	          Common upload = new Common();
		  
		  	  upload.fileUpload(ClickMyHorseDocument_UploadOwnershipCirtificate, "C:\\Users\\Shree\\eclipse-workspace\\Aljuman\\Data\\groovy_tutorial.pdf");
		
		  	Thread.sleep(2000);
		
		  	
		  	
		  	
		
		}
		
	
public void MyHorseUploadDocument_View() throws InterruptedException {
		
		
	Thread.sleep(2000);
		  	
	ClickMyHorseDocument_ViewOwnershipCirtificate.click();
	
	
	//Get the current window handle
//	  String windowHandle = driver.getWindowHandle();

	  //Get the list of window handles
	 // ArrayList tabs = new ArrayList (driver.getWindowHandles());
	//  System.out.println(tabs.size());
	  //Use the list of window handles to switch between windows
	//  driver.switchTo().window(tabs.get(0));
	//Switch back to original window
	 // driver.switchTo().window(mainWindowHandle);
	
	
	
	
	
	
	
		
		}
		
public void MyHorseUploadDocument_Download() throws InterruptedException {
	Thread.sleep(2000);
	
	ClickMyHorseDocument_DownloadOwnershipCirtificate.click();
  	
  
	Thread.sleep(2000);
}

public void MyHorseUploadDocument_Delete() throws InterruptedException {
	
  	
	Thread.sleep(3000);
	ClickMyHorseDocument_DeleteOwnershipCirtificate.click();
  	
	Thread.sleep(2000);
	
	ClickMyHorseDocument_DeleteConfirmButton.click();
	
	Thread.sleep(2000);
}
	
	
	
	
	
	
}
