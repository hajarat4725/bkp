package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(xpath="//*[@id=\"email\"]") private WebElement emailId;
	@FindBy(xpath="//*[@id=\"password\"]") private WebElement Pass;
	@FindBy(xpath="//*[@id=\"submitButton\"]") private WebElement Login;
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void setAljumanloginPage() throws AWTException, InterruptedException {
		
		emailId.sendKeys("aljuman.premium@gmail.com");
		Pass.sendKeys("aljumanAdmin@");
		Login.click();
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		
		
		
	}

	
	
}
