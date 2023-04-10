package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myhorse.Framwork.Base;

public class MyHorseMeasurement {
	
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[09]") private WebElement ClickMyHorseMeasurement;
	/*----------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="(//button[@type=\"button\"])[14]") private WebElement ClickMyHorseMeasurement_AddButton;
	
	@FindBy(xpath="(//input[@type=\"number\"])[1]") private WebElement SetAddMeasurment_Weight;
	
	
	@FindBy(xpath="(//input[@type=\"number\"])[2]") private WebElement SetAddMeasurment_Hight;
			
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickAddMeasurment_AddButton;
	
	/*----------------------------------------------------------------------------------------------------------------------*/
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/table/tbody/tr/td[7]/div/a[1]/img") private WebElement ClickMyHorseMeasurement_Edit;
	

     @FindBy(xpath="(//input[@type=\"number\"])[1]") private WebElement SetAddMeasurment_UpdateWeight;
	
	
	@FindBy(xpath="(//input[@type=\"number\"])[2]") private WebElement SetAddMeasurment_UpdateHight;
		
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickAddMeasurment_UpdateButton;
	
	/*----------------------------------------------------------------------------------------------------------------------*/
	
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/table/tbody/tr/td[7]/div/a[2]/img") private WebElement ClickAddMeasurment_DeleteButton;
	
	@FindBy(xpath="(//button[@type=\"button\"])[16]") private WebElement ClickAddMeasurment_ConfirmDelete;
	
	
public MyHorseMeasurement(WebDriver driver) {
		
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
	
public void ClickMyHorseMeasurement() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseMeasurement.click();
	 	
		Thread.sleep(3000);
		}
		
public void MyHorseMeasurement_Add() throws InterruptedException {
	
	ClickMyHorseMeasurement_AddButton.click();
	Thread.sleep(2000);
	SetAddMeasurment_Weight.sendKeys("200");
	
	SetAddMeasurment_Hight.sendKeys("200");
	
	ClickAddMeasurment_AddButton.click();
	Thread.sleep(4000);
		  	
		}
		
	
	
public void MyHorseMeasurement_Edit() throws InterruptedException, AWTException {
	
//	Base scroll = new Base();
//	
//	scroll.Scrolldown();
	
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_END);
	robot.keyRelease(KeyEvent.VK_END);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	Thread.sleep(3000);

	ClickMyHorseMeasurement_Edit.click();
	Thread.sleep(2000);
	SetAddMeasurment_UpdateWeight.clear();
	SetAddMeasurment_UpdateWeight.sendKeys("300");
	Thread.sleep(2000);
	SetAddMeasurment_UpdateHight.clear();
	SetAddMeasurment_UpdateHight.sendKeys("350");
	Thread.sleep(2000);
	ClickAddMeasurment_UpdateButton.click();
	
	
	Thread.sleep(2000);
	
}

public void MyHorseMeasurement_Delete() throws InterruptedException, AWTException {
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_END);
	robot.keyRelease(KeyEvent.VK_END);
	robot.keyRelease(KeyEvent.VK_CONTROL);


	Thread.sleep(2000);
	ClickAddMeasurment_DeleteButton.click();
	Thread.sleep(3000);
	ClickAddMeasurment_ConfirmDelete.click();
	
	Thread.sleep(2000);
	
}
	
	



	
	

}
