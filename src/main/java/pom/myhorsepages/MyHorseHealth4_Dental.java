package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHorseHealth4_Dental {
	
	

    @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth  ;
	
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickMyHorseHealth_Dental ;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	

@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddDental ;
	
	@FindBy(xpath="//img[@class=\"plus-btn\"]") private WebElement ClickMyHorseAddDental_Vetclinic;
	

	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div/div/input") private WebElement SetMyHorseAddDental_Vetclinic;
	
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseAddDental_Amount;
	
	
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddDental_AddButton;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/

	
	
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/div/button[1]/img") private WebElement ClickMyHorseEditDental ;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[3]/div/div/img") private WebElement ClickMyHorseEditDental_Vetclinic;
	

	@FindBy(xpath="(//input[@spellcheck=\"false\"])[1]") private WebElement SetMyHorseEditDental_Vetclinic;
	
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseEditDental_Amount;
	
	
   @FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorsEditDental_UpdateButton;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/


	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteDental;

	@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteDental_ConfirmButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	

	public MyHorseHealth4_Dental(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_DentalAddDental() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseHealth.click();
		Thread.sleep(2000);
		ClickMyHorseHealth_Dental.click();
		Thread.sleep(2000);
		ClickMyHorseAddDental.click();
		Thread.sleep(2000);
		ClickMyHorseAddDental_Vetclinic.click();
		Thread.sleep(2000);
		SetMyHorseAddDental_Vetclinic.sendKeys("add dental vet");
		Thread.sleep(2000);
		SetMyHorseAddDental_Amount.sendKeys("10.20");
		Thread.sleep(2000);
		ClickMyHorseAddDental_AddButton.click();
		Thread.sleep(2000);
		}
		

	public void MyHorseHealth_DentalEditDental() throws InterruptedException {
		Thread.sleep(5000);
		
		ClickMyHorseEditDental.click();
		Thread.sleep(2000);
	
		SetMyHorseEditDental_Amount.sendKeys("15.25");
		Thread.sleep(2000);
		
		ClickMyHorsEditDental_UpdateButton.click();
		
		Thread.sleep(2000);
		}
		
	public void MyHorseHealth_DentalDeletDental() throws InterruptedException {
		Thread.sleep(2000);
		ClickMyHorseDeleteDental.click();
		Thread.sleep(2000);
		ClickMyHorseDeleteDental_ConfirmButton.click();
		
		Thread.sleep(2000);
	}
	
	
	
	

}
