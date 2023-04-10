package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhorse.Framwork.Common;

public class MyHorseHealth1_Vitalsign {

	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth_Vitalsign ;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddVitalsign;
	
	@FindBy(xpath="(//input[@type=\"number\"])[1]") private WebElement SetMyHorseAddVitalsign_Temp;
	@FindBy(xpath="(//input[@type=\"number\"])[2]") private WebElement SetMyHorseAddVitalsign_HeartRate;
	@FindBy(xpath="(//input[@type=\"number\"])[3]") private WebElement SetMyHorseAddVitalsign_RespiRate;
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddVitalsign_AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[5]/div/button[1]/img") private WebElement ClickMyHorseEditVitalsign;
	
	@FindBy(xpath="(//input[@type=\"number\"])[1]") private WebElement SetMyHorseEdititalsign_Temp;
	@FindBy(xpath="(//input[@type=\"number\"])[2]") private WebElement SetMyHorseEditVitalsign_HeartRate;
	@FindBy(xpath="(//input[@type=\"number\"])[3]") private WebElement SetMyHorseEditVitalsign_RespiRate;
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEditVitalsign_UpdateButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[16]") private WebElement ClickMyHorseDeleteViatlsign;

	@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteVital_ConfirmButton;

	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	
	
	

	public MyHorseHealth1_Vitalsign(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_VitalsignAddvital() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseHealth_Vitalsign.click();
		Thread.sleep(2000);
		ClickMyHorseAddVitalsign.click();
		Thread.sleep(2000);
		SetMyHorseAddVitalsign_Temp.sendKeys("30");
		SetMyHorseAddVitalsign_HeartRate.sendKeys("40");
		SetMyHorseAddVitalsign_RespiRate.sendKeys("50");
		Thread.sleep(2000);
		ClickMyHorseAddVitalsign_AddButton.click();
		Thread.sleep(2000);
		}
		

	public void MyHorseHealth_VitalsignEditVital() throws InterruptedException {
		Thread.sleep(5000);
		
		ClickMyHorseEditVitalsign.click();
		Thread.sleep(5000);
		SetMyHorseEdititalsign_Temp.sendKeys("35");
		SetMyHorseEditVitalsign_HeartRate.sendKeys("45");
		SetMyHorseEditVitalsign_RespiRate.sendKeys("55");
		Thread.sleep(5000);
		ClickMyHorseEditVitalsign_UpdateButton.click();
		Thread.sleep(2000);
		}
		
	public void MyHorseHealth_VitalsignDeletVital() throws InterruptedException {
		
		ClickMyHorseDeleteViatlsign.click();

		Thread.sleep(5000);
		ClickMyHorseDeleteVital_ConfirmButton.click();
		Thread.sleep(2000);
		
		}
		



		
	
	
	
	
	
	
	
	
}
