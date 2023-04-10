package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyHorseHealth6_Treatment {
	
	

    @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth ;
	
	/*------------------------------------------------------------------------------------------------------------------------*/

	
	@FindBy(xpath="(//button[@type=\"button\"])[19]") private WebElement ClickMyHorseHealth_Treatment;
	
	@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddTreatment;
	@FindBy(xpath="//img[@class=\"plus-btn\"]") private WebElement ClickMyHorseAddTreatment_VetClinic;

	@FindBy(xpath="(//input[@value ])[2]") private WebElement SetMyHorseAddTreatment_VetClinic;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[2]/div[4]/div/select") private WebElement SetMyHorseAddTreatment_Route;
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]") private WebElement SetMyHorseAddTreatment_Doasage;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[3]/div[2]/div/select") private WebElement SetMyHorseAddTreatment_Frequency;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[3]/div[3]/div/select") private WebElement SetMyHorseAddTreatment_Time;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[3]/div[4]/div/select") private WebElement SetMyHorseAddTreatment_Days;
	
	
	
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddTreatment__AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/

	/*------------------------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[11]/div/button[1]/img") private WebElement ClickMyHorseEditTreatment;
	@FindBy(xpath="(//input[@type=\"text\"])[1]") private WebElement SetMyHorseEditTreatment_Productname;
	
	
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEditTreatment__UpdateButton;
/*------------------------------------------------------------------------------------------------------------------------*/
	
	
	
	
	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteTreatment;

	@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteTreatment_ConfirmButton;

	
/*------------------------------------------------------------------------------------------------------------------------*/	
	
	
	


	public MyHorseHealth6_Treatment(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_Treatment_AddTreatment() throws InterruptedException {
		
		Thread.sleep(5000);
		ClickMyHorseHealth.click();
		Thread.sleep(5000);
		ClickMyHorseHealth_Treatment.click();
		Thread.sleep(2000);
		ClickMyHorseAddTreatment.click();
		Thread.sleep(2000);
		ClickMyHorseAddTreatment_VetClinic.click();
		Thread.sleep(2000);
		SetMyHorseAddTreatment_VetClinic.sendKeys("Vet of add treatment");
		
		Thread.sleep(3000);
		Select oSel0 = new Select(SetMyHorseAddTreatment_Route);
		Thread.sleep(2000);
		oSel0.selectByValue("oral");
		Thread.sleep(2000);
		
		SetMyHorseAddTreatment_Doasage.sendKeys("2");
		
		Thread.sleep(3000);
		Select oSel1 = new Select(SetMyHorseAddTreatment_Frequency);
		Thread.sleep(2000);
		oSel1.selectByVisibleText("2 times a day");
		
		Thread.sleep(3000);
		Select oSel2 = new Select(SetMyHorseAddTreatment_Time);
		Thread.sleep(2000);
		oSel2.selectByVisibleText("2 hours");
		
		Thread.sleep(3000);
		Select oSel3 = new Select(SetMyHorseAddTreatment_Days);

		oSel3.selectByVisibleText("3");
		
		ClickMyHorseAddTreatment__AddButton.click();
		Thread.sleep(3000);
		}
		

	public void MyHorseHealth_Treatment_EditTreatment() throws InterruptedException {
		Thread.sleep(5000);
		
		
		ClickMyHorseEditTreatment.click();
		SetMyHorseEditTreatment_Productname.sendKeys("Treatment_productname");
		Thread.sleep(2000);
		ClickMyHorseEditTreatment__UpdateButton.click();
		Thread.sleep(3000);
		}
		
	public void MyHorseHealth_Treatment_DeletTreatment() throws InterruptedException {
		Thread.sleep(2000);
		ClickMyHorseDeleteTreatment.click();

		Thread.sleep(3000);
		ClickMyHorseDeleteTreatment_ConfirmButton.click();
		
		Thread.sleep(2000);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
