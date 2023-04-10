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

public class MyHorseFarrier {
	
	

	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[08]") private WebElement ClickMyHorseFarrier;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/button") private WebElement ClickMyHorseAddFarrier;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/img") private WebElement ClickMyHorseFarrierAddFarrier_Farrier;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/input") private WebElement SetMyHorseFarrierAddFarrie_Farrier;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[3]/select") private WebElement SetMyHorseFarrierAddFarrie_ShoeingType;
	
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickMyHorseAddFarrier_AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/a[1]/img") private WebElement ClickMyHorseEditFarrier;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/img") private WebElement ClickMyHorseFarrierEditFarrier_Farrier;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/input") private WebElement SetMyHorseFarrierEditFarrier_Farrier;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[3]/select") private WebElement SetMyHorseFarrierEditFarrier_ShoeingType;
	
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickMyHorseEditFarrier_UpdateButton;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/a[2]/img") private WebElement ClickMyHorseFarrier_Delete;

	@FindBy(xpath="(//button[@type=\"button\"])[16]") private WebElement ClickMyHorsFarrier_DeleteConfirmButton;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	public MyHorseFarrier(WebDriver driver) {
		
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
	
	
	
	
	
	public void MyHorseFarrierAddFarrier() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseFarrier.click();
		ClickMyHorseAddFarrier.click();
		
		ClickMyHorseFarrierAddFarrier_Farrier.click();
		SetMyHorseFarrierAddFarrie_Farrier.sendKeys("Adding  Farrier");
		
		Thread.sleep(3000);
		Select oSel = new Select(SetMyHorseFarrierAddFarrie_ShoeingType);

		oSel.selectByVisibleText("Trimming");
		
		ClickMyHorseAddFarrier_AddButton.click();
		Thread.sleep(3000);
		}
		

	public void MyHorseFarrierEditFarrier() throws InterruptedException {
		
		ClickMyHorseEditFarrier.click();
		Thread.sleep(3000);
		ClickMyHorseFarrierEditFarrier_Farrier.click();
		SetMyHorseFarrierEditFarrier_Farrier.sendKeys("Updating Farrier");
		ClickMyHorseEditFarrier_UpdateButton.click();
		Thread.sleep(3000);
		}
		
	public void MyHorseFarrierDeletFarrier() throws InterruptedException {
		
		ClickMyHorseFarrier_Delete.click();
		Thread.sleep(3000);
		ClickMyHorsFarrier_DeleteConfirmButton.click();
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
