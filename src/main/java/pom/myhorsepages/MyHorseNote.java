package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhorse.Framwork.Base;
import com.myhorse.Framwork.Common;

public class MyHorseNote {

	Base base = new Base();
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/button[10]") private WebElement ClickMyHorseNote;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/a") private WebElement ClickMyHorseAddNote;

	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseAddNote_titile;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[2]/div/label") private WebElement SetMyHorseAddNote_Upload;

	

	@FindBy(xpath="(//button[@type=\"button\"])[16]") private WebElement ClickMyHorseAddNote_AddButtan;

	
	/*------------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="//img[contains(@src,\"/static/media/pencil.57bd3ba114aee8a34476f6601a0b908d.svg\")]") private WebElement ClickMyHorseEditNote;

	//img[contains (@src, "/static/media/pencil.57bd3ba114aee8a34476f6601a0b908d.svg")]
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseEditNote_titile;

	@FindBy(xpath="(//button[@type=\"button\"])[16]") private WebElement ClickMyHorseAddNote_UpdateBotton;

	/*------------------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="//img[contains(@src,\"/static/media/bin.6cd0cfb6852aa803940cf847b9dc3fc5.svg\")]") private WebElement ClickMyHorseDeleteNote;

	@FindBy(xpath="(//button[@type=\"button\"])[15]") private WebElement ClickMyHorseDeleteNote_ConfirmButton;

	
	
	
	
	
	public MyHorseNote(WebDriver driver) {
		
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
		
		Thread.sleep(2000);
		
	}
	
public void MyHorseNoteAddNote() throws InterruptedException {
		
	Thread.sleep(2000);
	ClickMyHorseNote.click();
	Thread.sleep(2000);
	ClickMyHorseAddNote.click();
	Thread.sleep(2000);
	SetMyHorseAddNote_titile.sendKeys("ImportanT Note");
	
	Thread.sleep(2000);

          Common upload = new Common();
	  
	  	  upload.fileUpload(SetMyHorseAddNote_Upload, "C:\\Users\\Shree\\eclipse-workspace\\Aljuman\\Data\\groovy_tutorial.pdf");
	
	  	Thread.sleep(2000);
	ClickMyHorseAddNote_AddButtan.click();
	Thread.sleep(2000);
	}
	

public void MyHorseNoteEditNote() throws InterruptedException {
	Thread.sleep(2000);
	ClickMyHorseEditNote.click();
	Thread.sleep(3000);
	SetMyHorseEditNote_titile.sendKeys(" " +"Updated");
	Thread.sleep(2000);
	ClickMyHorseAddNote_UpdateBotton.click();
	Thread.sleep(2000);
	}
	
public void MyHorseNoteDeletNote() throws InterruptedException {
	
	Thread.sleep(2000);
	ClickMyHorseDeleteNote.click();
	Thread.sleep(2000);
	ClickMyHorseDeleteNote_ConfirmButton.click();
	Thread.sleep(2000);
	
	}
	



	


	
	
}
