package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyHorseDiet {

	
	
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="(//button[@type=\"button\"])[07]") private WebElement ClickMyHorseDiet;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/button") private WebElement ClickMyHorseAddDiet;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/select") private WebElement SetMyHorseDietAddDiet_Category;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[1]/input") private WebElement SetMyHorseDietAddDiet_QTY;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[2]/select") private WebElement SetMyHorseDietAddDiet_UNIT;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/input") private WebElement SetMyHorseDietAddDiet_Amount;

	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickMyHorseAddDiet_AddButton;
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/a[1]/img") private WebElement ClickMyHorseEditDiet;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/select") private WebElement SetMyHorseDiet_EditDiet_Category;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[1]/input") private WebElement SetMyHorseDiet_EditDiet_QTY;
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[2]/select") private WebElement SetMyHorseDiet_EditDiet_UNIT;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/input") private WebElement SetMyHorseDiet_EditDiet_Amount;
	
	@FindBy(xpath="(//button[@type=\"button\"])[17]") private WebElement ClickMyHorseEditFarrier_UpdateButton;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/a[2]/img") private WebElement ClickMyHorseDiet_Delete;

	@FindBy(xpath="(//button[@type=\"button\"])[16]") private WebElement ClickMyHorsDiet_DeleteConfirmButton;
	
	
	/*------------------------------------------------------------------------------------------------------------------------*/
	
	
	
	
	
	public MyHorseDiet(WebDriver driver) {
		
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
	
	
	
	
	
	public void MyHorseDietAddDiet() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorseDiet.click();
		ClickMyHorseAddDiet.click();
		
		
		Thread.sleep(3000);
		Select oSel = new Select(SetMyHorseDietAddDiet_Category);

		oSel.selectByVisibleText("Grain");
		
		Thread.sleep(2000);
		SetMyHorseDietAddDiet_QTY.sendKeys("1");
		
		
		Thread.sleep(3000);
		Select oSelect = new Select(SetMyHorseDietAddDiet_UNIT);

		oSelect.selectByVisibleText("Pounds");
		Thread.sleep(3000);
		
		SetMyHorseDietAddDiet_Amount.sendKeys("1.5");
		
		Thread.sleep(2000);
		ClickMyHorseAddDiet_AddButton.click();
		Thread.sleep(3000);
		}
		

	public void MyHorseDietEditDiet() throws InterruptedException {
		
		
		ClickMyHorseEditDiet.click();
		Thread.sleep(2000);
		SetMyHorseDiet_EditDiet_QTY.clear();
		SetMyHorseDiet_EditDiet_QTY.sendKeys("2");
		
		Thread.sleep(2000);
		SetMyHorseDiet_EditDiet_Amount.clear();
		SetMyHorseDiet_EditDiet_Amount.sendKeys("2");
		Thread.sleep(2000);
		
		ClickMyHorseEditFarrier_UpdateButton.click();
		
		Thread.sleep(2000);
		
		}
		
	public void MyHorseDietDeletDiet() throws InterruptedException {
		
		
		ClickMyHorseDiet_Delete.click();
		Thread.sleep(3000);
		ClickMyHorsDiet_DeleteConfirmButton.click();
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
