package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHorseHealth7_Labtest {
	
	

    @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[06]") private WebElement ClickMyHorseHealth ;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="(//button[@type=\"button\"])[20]") private WebElement ClickMyHorseHealth_Labtest;
	
	@FindBy(xpath="(//button[@type=\"button\"])[22]") private WebElement ClickMyHorseAddLabtest;
	
	@FindBy(xpath="//img[@class=\"plus-btn\"]") private WebElement ClickMyHorseAddLabtest_VetClinic;

	@FindBy(xpath="(//input[@value])[2]") private WebElement SetMyHorseAddLabtest_VetClinic;
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseAddLabtest_Testname;
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseAddLabtest_AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/div/button[1]/img") private WebElement ClickMyHorseEditLabtest;
	
	@FindBy(xpath="//input[@type=\"text\"]") private WebElement SetMyHorseEditLabtest_Testname;
	
	@FindBy(xpath="(//button[@type=\"button\"])[25]") private WebElement ClickMyHorseEditLabtest__UpdateButton;
/*------------------------------------------------------------------------------------------------------------------------*/

	
	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[13]") private WebElement ClickMyHorseDeleteLabtest;

	@FindBy(xpath="(//button[@type=\"button\"])[24]") private WebElement ClickMyHorseDeleteLabtest_ConfirmButton;

	
/*------------------------------------------------------------------------------------------------------------------------*/	
	
	
	

	public MyHorseHealth7_Labtest(WebDriver driver) {
		
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
	
	
	public void MyHorseHealth_Labtest_AddLabtest() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseHealth.click();
		Thread.sleep(2000);
		ClickMyHorseHealth_Labtest.click();
		Thread.sleep(2000);
		ClickMyHorseAddLabtest.click();
		Thread.sleep(2000);
		ClickMyHorseAddLabtest_VetClinic.click();
		Thread.sleep(2000);
		
		SetMyHorseAddLabtest_VetClinic.sendKeys("Vet of add lab");
		Thread.sleep(2000);
		
		SetMyHorseAddLabtest_Testname.sendKeys("Demo testname ");
		Thread.sleep(2000);
		
		ClickMyHorseAddLabtest_AddButton.click();
		Thread.sleep(2000);
		
		
		
		}
		

	public void MyHorseHealth_Labtest_EditLabtest() throws InterruptedException {
		Thread.sleep(5000);
		
		ClickMyHorseEditLabtest.click();
		Thread.sleep(2000);
		SetMyHorseEditLabtest_Testname.sendKeys("Updated TEST name ");
		Thread.sleep(2000);
		ClickMyHorseEditLabtest__UpdateButton.click();
		Thread.sleep(2000);
		
		
		}
		
	public void MyHorseHealth_Labtest_DeletLabtest() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseDeleteLabtest.click();
		Thread.sleep(2000);
		
		ClickMyHorseDeleteLabtest_ConfirmButton.click();
		Thread.sleep(2000);
		
		}
	
	

}
