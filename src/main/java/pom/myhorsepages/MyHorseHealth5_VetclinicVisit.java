package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyHorseHealth5_VetclinicVisit {
	
	
	
	
	  @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
		
		@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth ;
		
/*------------------------------------------------------------------------------------------------------------------------*/
		@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement ClickMyHorseHealth_VetclinicVisit;
		
		@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddVetclinicVisit;
		@FindBy(xpath="//img[@class=\"plus-btn\"]") private WebElement ClickMyHorseAddVetclinicVisit_VetClinic;

		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div/div/input") private WebElement SetMyHorseAddVetclinicVisit_VetClinic;

		@FindBy(xpath="//input[@type=\"number\"]") private WebElement SetMyHorseAddVetclinicVisit_Amount;
		@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddVetclinicVisit_AddButton;
		
		
		
/*------------------------------------------------------------------------------------------------------------------------*/

		@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/div/button[1]/img") private WebElement ClickMyHorseEditVetclinicVisit;
		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[4]/div/textarea") private WebElement SetMyHorseEditVetclinicVisit_comment ;
		
		@FindBy(xpath="//input[@type=\"number\"]") private WebElement SetMyHorseEditVetclinicVisit_Amount;
		@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEdiVetclinicVisit_UpdateButton;
/*------------------------------------------------------------------------------------------------------------------------*/
		
		
		@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteVetclinicVisit;

		@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteVetclinicVisit_ConfirmButton;
	
		
		
		
		
		
		
		
		
		
		
		

		public MyHorseHealth5_VetclinicVisit(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		public void ClickMyHorseRe() throws AWTException, InterruptedException {
			
			myhorse_searchRclick.click();
			Thread.sleep(2000);
//			base.zoom();
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			
			
		}
		
		
		public void MyHorseHealth_VetclinicVisit_AddVetclinicVisit() throws InterruptedException {
			
			Thread.sleep(3000);
			ClickMyHorseHealth.click();
			Thread.sleep(2000);
			ClickMyHorseHealth_VetclinicVisit.click();
			Thread.sleep(3000);
			ClickMyHorseAddVetclinicVisit.click();
			
			
			Thread.sleep(3000);
			
			ClickMyHorseAddVetclinicVisit_VetClinic.click();
			Thread.sleep(3000);
			SetMyHorseAddVetclinicVisit_VetClinic.sendKeys("Vetclicnic of add vet");
			Thread.sleep(3000);
			SetMyHorseAddVetclinicVisit_Amount.sendKeys("10.20");
			Thread.sleep(3000);
			ClickMyHorseAddVetclinicVisit_AddButton.click();
			
			Thread.sleep(5000);
			}
			

		public void MyHorseHealth_VetclinicVisit_EditVetclinicVisit() throws InterruptedException {
			Thread.sleep(5000);
			
			ClickMyHorseEditVetclinicVisit.click();
			Thread.sleep(3000);
			SetMyHorseEditVetclinicVisit_comment.sendKeys("Update Vet clinic ");
			
			Thread.sleep(5000);
			ClickMyHorseEdiVetclinicVisit_UpdateButton.click();
			Thread.sleep(3000);
			}
			
		public void MyHorseHealth_VetclinicVisit_DeletVetclinicVisit() throws InterruptedException {
			
			ClickMyHorseDeleteVetclinicVisit.click();
			Thread.sleep(3000);
			ClickMyHorseDeleteVetclinicVisit_ConfirmButton.click();
			
			Thread.sleep(2000);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	

}
