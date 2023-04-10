package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHorseHealth8_Xray {
	
	
	

    @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="(//button[@type=\"button\"])[21]") private WebElement ClickMyHorseHealth_Xrayt;
	
	@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddXray;
	
	@FindBy(xpath="//img[@class=\"plus-btn\"]") private WebElement ClickMyHorseAddXray_VetClinic;

	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/input") private WebElement SetMyHorseAddXray_VetClinic;
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseAddXray_XrayType;
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddXray_AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/div/button[1]/img") private WebElement ClickMyHorseEditXray;
	
@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseEditXray_XrayType;
	
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEditXray__UpdateButton;
/*------------------------------------------------------------------------------------------------------------------------*/

	
	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteXray;

	@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteXray_ConfirmButton;

	
/*------------------------------------------------------------------------------------------------------------------------*/	
	
	
	
	
	
	
	
	

	public MyHorseHealth8_Xray(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_Xray_AddXray() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseHealth.click();
		Thread.sleep(2000);
		ClickMyHorseHealth_Xrayt.click();
		Thread.sleep(3000);
		ClickMyHorseAddXray.click();
		Thread.sleep(3000);
		ClickMyHorseAddXray_VetClinic.click();
		Thread.sleep(3000);
		SetMyHorseAddXray_VetClinic.sendKeys("Vet of XRAY ");
		Thread.sleep(2000);
		SetMyHorseAddXray_XrayType.sendKeys(" Add XRAY type");
		ClickMyHorseAddXray_AddButton.click();
		Thread.sleep(5000);
		}
		

	public void MyHorseHealth_Xray_EditXray() throws InterruptedException {
		Thread.sleep(5000);
		
		
		ClickMyHorseEditXray.click();
		Thread.sleep(2000);
		SetMyHorseEditXray_XrayType.sendKeys("UPDATED xray TYPE");
		
		ClickMyHorseEditXray__UpdateButton.click();
		Thread.sleep(5000);
		
		}
		
	public void MyHorseHealth_Xray_DeletXray() throws InterruptedException {
		Thread.sleep(2000);
		
		ClickMyHorseDeleteXray.click();
		Thread.sleep(5000);
		ClickMyHorseDeleteXray_ConfirmButton.click();
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
