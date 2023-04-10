package pom.Boarding;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhorse.Framwork.Base;
import com.myhorse.Framwork.Common;

public class BoardingListing {
	
	
	
	public class MyHorseNote {

		Base base = new Base();
		
		
		@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
		
		@FindBy(xpath="") private WebElement ClickBoarding;

		@FindBy(xpath="") private WebElement v;
		
		
		
		
		
		
		
		public MyHorseNote(WebDriver driver) {
			
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
			
			Thread.sleep(2000);
			
		}
		
		public void AddBoardingPlan() throws InterruptedException {
			
		}
		
		
	public void AddBoarding() throws InterruptedException {
			
		Thread.sleep(2000);
		ClickMyHorseNote.click();
		Thread.sleep(2000);
		
		}
		
	public void StopBoarding() throws InterruptedException {
		
	}
	
	

	public void EditBoarding() throws InterruptedException {
		
		}
		
	public void DeletBoarding() throws InterruptedException {
		
		
		
		}
		



		


		
		
	}


}
