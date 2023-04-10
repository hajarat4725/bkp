package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyHorseHealth3_ParasiteControl {
	
	
	
	  @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
		
			@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth ;
			
	/*------------------------------------------------------------------------------------------------------------------------*/
			@FindBy(xpath="(//button[@type=\"button\"])[16]") private WebElement ClickMyHorseHealth_ParasiteControl;
			
			@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddParasiteControl;
			@FindBy(xpath="(//div[@class=\"ant-select-item-option-content\"])[1]") private WebElement SetMyHorseAddParasiteControl_DewormerActiveINGREDIENT;

			@FindBy(xpath="//div[@class=\"ant-select-selector\"]") private WebElement ClickAddParasiteControl_Dropdownoption;
			
			
			@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseAddParasiteControl_Product;
			@FindBy(xpath="//input[@type=\"number\"]") private WebElement SetMyHorseAddParasiteControl_Amount;
			@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddParasiteControl_AddButton;
			
	/*------------------------------------------------------------------------------------------------------------------------*/

			@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/div/button[1]/img") private WebElement ClickMyHorseEditParasiteControl;
			
			@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div/select") private WebElement SetMyHorseEditParasiteControl_DewormerActiveIngreadient;
			@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseEditParasiteControl_Product;
			@FindBy(xpath="//input[@type=\"number\"]") private WebElement SetMyHorseEditParasiteControl_Amount;
			@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEdiParasiteControl_UpdateButton;
	/*------------------------------------------------------------------------------------------------------------------------*/
			@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteParasiteControl;

			@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteParasiteControl_ConfirmButton;
		
			
			

	public MyHorseHealth3_ParasiteControl(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_ParasiteControlAddParasiteControl() throws InterruptedException {
		
		Thread.sleep(5000);
	
	ClickMyHorseHealth.click();
	Thread.sleep(2000);
		ClickMyHorseHealth_ParasiteControl.click();
		Thread.sleep(4000);
		ClickMyHorseAddParasiteControl.click();
		Thread.sleep(2000);

	Thread.sleep(3000);
//		Select oSel = new Select(SetMyHorseAddParasiteControl_DewormerActiveINGREDIENT);
////
//		oSel.
////		
//	//	SetMyHorseAddParasiteControl_DewormerActiveINGREDIENT.sendKeys(null);
//		//Thread.sleep(2000);
	
	ClickAddParasiteControl_Dropdownoption.click();
	Thread.sleep(4000);
	SetMyHorseAddParasiteControl_DewormerActiveINGREDIENT.click();

	Thread.sleep(4000);
		SetMyHorseAddParasiteControl_Product.sendKeys("Add parasite product ");
		Thread.sleep(3000);
	
		SetMyHorseAddParasiteControl_Amount.sendKeys("100.20");
		Thread.sleep(2000);
		ClickMyHorseAddParasiteControl_AddButton.click();
		Thread.sleep(2000);
		}
		

	public void MyHorseHealth_ParasiteControlEditParasiteControl() throws InterruptedException {
		Thread.sleep(5000);
		
		
		ClickMyHorseEditParasiteControl.click();
		
	//	SetMyHorseEditParasiteControl_DewormerActiveIngreadient.click();
		
		SetMyHorseEditParasiteControl_Product.clear();
		
		Thread.sleep(2000);
		SetMyHorseEditParasiteControl_Product.sendKeys("Updated product name ");
		Thread.sleep(2000);
		ClickMyHorseEdiParasiteControl_UpdateButton.click();
		
		Thread.sleep(5000);
		}
		
	public void MyHorseHealth_ParasiteControlDeletParasiteControl() throws InterruptedException {
		Thread.sleep(5000);
		
		ClickMyHorseDeleteParasiteControl.click();
		
		Thread.sleep(3000);
		ClickMyHorseDeleteParasiteControl_ConfirmButton.click();	
		
		Thread.sleep(5000);
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
