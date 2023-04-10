package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myhorse.Framwork.Common;

public class MyHorseAchivement {
	
	
	

	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[10]") private WebElement ClickMyHorseAchivement;
	/*----------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="(//button[@type=\"button\"])[15]") private WebElement ClickMyHorseAchivement_AddButton;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[1]/div[2]/div/select") private WebElement SetAddAchivement_Discipline;
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetAddAchivement_Eventname;
	
	@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement ClickAddAchivement_AddButton;
	
	/*----------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[9]/div/a[1]/img") private WebElement ClickMyHorseAchivement_EditButton;

	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetAddAchivement_EditEventname;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[1]/div[5]/div/select") private WebElement SetAddAchivement_Ranking;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[2]/div/div/select") private WebElement SetAddAchivement_Medal;
	
	@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement ClickAddAchivement_UpdateButton;
	/*----------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[9]/div/a[2]/img") private WebElement ClickMyHorseAchivement_DeleteButton;
	
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickAddAchivement_ConfirmDelete;

	
	
	
	
	
	
public MyHorseAchivement(WebDriver driver) {
		
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
	
public void ClickMyHorseAchivement() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseAchivement.click();
	 	
		
		}
		
	
public void MyHorseAchivement_Add() throws InterruptedException {
		
	ClickMyHorseAchivement_AddButton.click();
	

	Thread.sleep(3000);
	Select oSel = new Select(SetAddAchivement_Discipline);
	oSel.selectByVisibleText("Arabian Horse Show"); 
	Thread.sleep(2000);
	
	
	SetAddAchivement_Eventname.sendKeys("New Event");
	Thread.sleep(2000);
	ClickAddAchivement_AddButton.click();
		  	
		}
		


public void MyHorseAchivement_Edit() throws InterruptedException {
	Thread.sleep(2000);
	
	ClickMyHorseAchivement_EditButton.click();
	Thread.sleep(2000);
	SetAddAchivement_EditEventname.sendKeys("Updated ");
	
	
	Thread.sleep(3000);
	Select oSel = new Select(SetAddAchivement_Ranking);
	oSel.selectByValue("1");
	
  	
	
	
	Thread.sleep(3000);
	Select oSele = new Select(SetAddAchivement_Medal);
	oSele.selectByValue("gold");
	Thread.sleep(2000);
	
	ClickAddAchivement_UpdateButton.click();
	
	
}

public void MyHorseAchivement_Delete() throws InterruptedException {
	
	Thread.sleep(2000);
	ClickMyHorseAchivement_DeleteButton.click();
	Thread.sleep(3000);
	ClickAddAchivement_ConfirmDelete.click();
	
	Thread.sleep(2000);
}
	
	

public void MyHorseAchivement_MedalRanking() throws InterruptedException {
	
  	
	
	
	Thread.sleep(2000);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
