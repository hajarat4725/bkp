package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyHorseHealth2_Vaccination {
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth ;
	
	@FindBy(xpath="(//button[@type=\"button\"])[15]") private WebElement ClickMyHorseHealth_Vaccination;
	/*------------------------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddVaccination;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div/select") private WebElement SetMyHorseAddVaccination_Vaccine;
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseAddVaccination_Product;
	@FindBy(xpath="//input[@type=\"number\"]") private WebElement SetMyHorseAddVaccination_Amount;
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddVaccination_AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	
@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/div/button[1]/img") private WebElement ClickMyHorseEditVaccination;
	
@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div/select") private WebElement SetMyHorseEditVaccination_Vaccine;
@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseEditVaccination_Product;
@FindBy(xpath="//input[@type=\"number\"]") private WebElement SetMyHorseEditVaccination_Amount;
@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEditVaccination_UpdateButton;
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteVaccination;

	@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteVaccination_ConfirmButton;

	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	

	public MyHorseHealth2_Vaccination(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_VaccinationAddVaccination() throws InterruptedException {
		
	Thread.sleep(2000);
	ClickMyHorseHealth.click();
		Thread.sleep(2000);
		ClickMyHorseHealth_Vaccination.click();
		Thread.sleep(2000);
		ClickMyHorseAddVaccination.click();
		
		Thread.sleep(3000);
		Select oSel = new Select(SetMyHorseAddVaccination_Vaccine);

		oSel.selectByVisibleText("Adenitis");
		Thread.sleep(2000);
		SetMyHorseAddVaccination_Product.sendKeys("Product Name for vaccination");
		Thread.sleep(3000);
		SetMyHorseAddVaccination_Amount.sendKeys("10.20");
		Thread.sleep(3000);
		ClickMyHorseAddVaccination_AddButton.click();
		Thread.sleep(3000);
		}
		

	public void MyHorseHealth_VaccinationEditVaccination() throws InterruptedException {
		Thread.sleep(5000);
		
		ClickMyHorseEditVaccination.click();
		Thread.sleep(3000);
	//	SetMyHorseEditVaccination_Vaccine
		
		SetMyHorseEditVaccination_Product.sendKeys("Updated name of product ");
		Thread.sleep(3000);
		ClickMyHorseEditVaccination_UpdateButton.click();
		Thread.sleep(3000);
		}
		
	public void MyHorseHealth_VaccinationDeletVaccination() throws InterruptedException {
		Thread.sleep(2000);
		
		ClickMyHorseDeleteVaccination.click();
		Thread.sleep(3000);
		ClickMyHorseDeleteVaccination_ConfirmButton.click();
		Thread.sleep(3000);
		}
		

	
	
	

}
