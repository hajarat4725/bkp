package pom.myhorsepages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhorse.Framwork.Base;
import com.myhorse.Framwork.Common;

public class MyHorsePicVideo {
	
	

	Base base = new Base();
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/button[9]") private WebElement ClickMyHorsePicVideo;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/a") private WebElement ClickMyHorsePicVideo_AddPic;
	/*----------------------------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="(//input[@autocomplete=\"off\"])[2]") private WebElement SetMyHorsePicVideo_AddPicTitle;
	
	@FindBy(xpath="//label[@role=\"button\"]") private WebElement SetMyHorsePicVideo_AddPic_Upload;
	
	@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement SetMyHorsePicVideo_AddPic_AddButton;
	
	
	/*----------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/a[1]/img") private WebElement ClickMyHorsePicVideo_Edit;
	
	@FindBy(xpath="(//input[@type=\"text\"])[1]") private WebElement SetMyHorsePicVideo_EditPic_Title;
	
	@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement ClickMyHorsePicVideo_EditPic_UpdateButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/a[2]/img") private WebElement ClickMyHorsePicVideo_DeletePic;
	
	@FindBy(xpath="(//button[@type=\"button\"])[15]") private WebElement ClickMyHorsePicVideo_DeletePicConfirmButton;
	/*----------------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/a") private WebElement ClickMyHorsePicVideo_AddVideo;

	
	@FindBy(xpath="(//input[@type=\"text\"])[1]") private WebElement SetMyHorsePicVideo_AddVideoTitle;
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]") private WebElement SetMyHorsePicVideo_AddVideoYoutubeLink;
	
	
	
	@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement ClickMyHorsePicVideo_AddVideoButton;
	
	
	/*--------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/a[1]/img") private WebElement ClickMyHorsePicVideo_EditVideo;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[1]") private WebElement SetMyHorsePicVideo_EditVideoTitle;
	
	@FindBy(xpath="(//button[@type=\"button\"])[18]") private WebElement ClickMyHorsePicVideo_EditVideo_UpdateButton;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/a[2]/img") private WebElement ClickMyHorsePicVideo_DeleteVideo;
	
	
	@FindBy(xpath="(//button[@type=\"button\"])[15]") private WebElement ClickMyHorsePicVideo_DeleteVideo_ConfirmButton;
	
	
	/*--------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	
	
	
	
	public MyHorsePicVideo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickMyHorseRe() throws AWTException, InterruptedException {
		
		myhorse_searchRclick.click();
		Thread.sleep(3000);
//		base.zoom();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
	}
	
	
	public void ClickMyHorsePicVideoPictureVideo() throws InterruptedException {
		
		Thread.sleep(2000);
		ClickMyHorsePicVideo.click();
		
		
	}
	
	

	
	
	public void MyHorsePicVideoAddPicture() throws InterruptedException {
		Thread.sleep(3000);
		ClickMyHorsePicVideo_AddPic.click();
		Thread.sleep(3000);
		SetMyHorsePicVideo_AddPicTitle.sendKeys("Picture Title");
		
		
		
		Thread.sleep(2000);

	          Common upload = new Common();
		  
		  	  upload.fileUpload(SetMyHorsePicVideo_AddPic_Upload, "C:\\Users\\Shree\\eclipse-workspace\\Aljuman\\Data\\download (2).jpg");
		
		  	Thread.sleep(2000);
		
		  	
		  	SetMyHorsePicVideo_AddPic_AddButton.click(); 	
			Thread.sleep(2000);
		
		}
		
	
public void MyHorsePicVideoEditPicture() throws InterruptedException {
	Thread.sleep(2000);
	ClickMyHorsePicVideo_Edit.click();
	SetMyHorsePicVideo_EditPic_Title.sendKeys("Updated ");
		  	
	ClickMyHorsePicVideo_EditPic_UpdateButton.click();  	
	Thread.sleep(2000);
		
		}
		
public void MyHorsePicVideoDeletePicture() throws InterruptedException {
	
	
	ClickMyHorsePicVideo_DeletePic.click();
	Thread.sleep(3000);
	ClickMyHorsePicVideo_DeletePicConfirmButton.click();
	Thread.sleep(2000);
}

public void MyHorsePicVideoPrivatePicture() throws InterruptedException {
	
	
  	
	
}



/*----------------------------------------------------------Video Side------------------------------------------------*/
	
public void MyHorsePicVideoAddVideo() throws InterruptedException {
	
	
	
	
	Thread.sleep(3000);
	ClickMyHorsePicVideo.click();
	
	ClickMyHorsePicVideo_AddVideo.click();
	
	Thread.sleep(2000);
	SetMyHorsePicVideo_AddVideoTitle.sendKeys("Video Title ");
	
	Thread.sleep(2000);
	SetMyHorsePicVideo_AddVideoYoutubeLink.sendKeys("https://www.youtube.com/Horse");
	
	Thread.sleep(2000);
	ClickMyHorsePicVideo_AddVideoButton.click();

	Thread.sleep(2000);  	
	
	}
	

public void MyHorsePicVideoEditVideo() throws InterruptedException {
	Thread.sleep(2000);
	ClickMyHorsePicVideo_EditVideo.click();
	Thread.sleep(2000);
	SetMyHorsePicVideo_EditVideoTitle.sendKeys("Updated");
	  	
	ClickMyHorsePicVideo_EditVideo_UpdateButton.click();
	
	Thread.sleep(2000);
	
	}
	
public void MyHorsePicVideoDeleteVideo() throws InterruptedException {
	Thread.sleep(2000);
	ClickMyHorsePicVideo_DeleteVideo.click();
	Thread.sleep(3000);
	ClickMyHorsePicVideo_DeleteVideo_ConfirmButton.click();
	
}


public void MyHorsePicVideoPrivateVideo() throws InterruptedException {


	

}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
