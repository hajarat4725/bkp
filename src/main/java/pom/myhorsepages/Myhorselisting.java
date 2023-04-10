package pom.myhorsepages;

import java.sql.Driver;

import javax.swing.text.html.parser.TagElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Myhorselisting {
	
	
	
	@FindBy(xpath="//p[text()='My Horses']") private WebElement MyHorse; // Xpath of my horse Listing tab
/*------------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="//p[text()='Stallions']") private WebElement Stallioncount ; // Xpath of my horse - Stallioncount  tab
	@FindBy(xpath="//p[text()='Mares']") private WebElement Marecount ; // Xpath of my horse - mare count   tab
	@FindBy(xpath="//p[text()='All']") private WebElement Allcount ; 
	
/*------------------------------------------------------------------------------------------------------------------------------*/	
	
	@FindBy(xpath="(//button[@type=\"button\"])[7]") private WebElement Addhorse ; // Xpath of my horse Add Button 
/*------------------------------------------Add Horse page ------------------------------------------------------------------------------------*/	
	
	@FindBy(xpath="(//input[@type=\"text\"])[1]") private WebElement Addhorse_name;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[1]/div[3]/div/select") private WebElement Addhorse_Sex;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[3]/div[3]/div/select") private WebElement Addhorse_Status;
	
	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium fill-btn css-1hw9j7s'])[3]") private WebElement AddButton ;
	
	
	/*------------------------------------------ Horse listing  page ------------------------------------------------------------------------------------*/	
		
	
	@FindBy(xpath="//input[@placeholder=\"Search Horse...\"]") private WebElement myhorse_search; // Xpath of my horse Listing tab
	@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div/a") private WebElement myhorse_searchRclick;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[9]/div/a[2]/img") private WebElement myhorse_searchREdit;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[1]") private WebElement Edithorse_name;
	
	@FindBy(xpath="(//button[@type=\"button\"])[12]") private WebElement Edithorse_Updatebutton;
	
	
	@FindBy(xpath="(//img[contains(@src,/static/medicf847b9dc3fc5.svg)])[16]") private WebElement myhorse_searchReDelete;
	
	@FindBy(xpath="(//button[@type=\"button\"])[9]") private WebElement myhorse_searchReDeleteConfirmButton;
	
	
	
public Myhorselisting(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
public void ClickAljumanMyhorselisting() throws InterruptedException {
	Thread.sleep(2000);
	MyHorse.click(); // Click on My horse tab 
	Thread.sleep(2000);
	
	String Text = MyHorse.getText();
	
	Thread.sleep(2000);
	
	if (Text.equals("My Horses")) {
		
		System.out.println("successfully land on My horse listing page ");
		
	}
	
	else {
		System.out.println("Fail");
	}
	
}

public void ClickAljumanMyhorsStalliontab() throws InterruptedException {
	
	Thread.sleep(2000);
	
	Stallioncount.click(); // Click on My horse listing page -  Stallion count tab of 3 box 
	Thread.sleep(2000);
	}


public void ClickAljumanMyhorsMaretab() throws InterruptedException {
	
	Thread.sleep(2000);
	
	Marecount.click(); // Click on My horse listing page -  Mare  count tab of 3 box 
	
	Thread.sleep(2000);
	}


	
public void ClickAljumanMyhorsAddHorseButton() throws InterruptedException {
	
	Thread.sleep(2000);
	
	Addhorse.click(); // Click on My horse listing page -  Mare  count tab of 3 box 
	Thread.sleep(2000);
	}
/*---------------------------------------Add Horse page action-----------------------------------------------------------------------------*/	

public void setAljumanMyhorsAddHorse_name() throws InterruptedException {
	
	Thread.sleep(2000);
	
	Addhorse_name.sendKeys("COLORADO"); // Click on My horse listing page -  Mare  count tab of 3 box 
	
	Thread.sleep(2000);
	}

public void setAljumanMyhorsAddHorse_Sex() throws InterruptedException {
	Thread.sleep(3000);
	Select oSel = new Select(Addhorse_Sex);


	oSel.selectByVisibleText("Male"); // Click on My horse listing page -  Mare  count tab of 3 box 
	
	}

public void setAljumanMyhorsAddHorse_Status() throws InterruptedException {
	Thread.sleep(3000);
	Select oSel = new Select(Addhorse_Status);


	oSel.selectByVisibleText("Active"); 
	
	}

public void ClickAljumanMyhorsAddHorse_Addbutton() throws InterruptedException {
	Thread.sleep(2000);
	AddButton.click();

	}
public void setAljumanMyhors_search() throws InterruptedException {                 // search colorado
	Thread.sleep(3000);
	
	Allcount.click();

	Thread.sleep(3000);
	myhorse_search.click();
	Thread.sleep(2000);
	myhorse_search.sendKeys("COLORADO");
	Thread.sleep(2000);
	
	}


public void ClickAljumanMyhorSearch_Rclick() throws InterruptedException {      // click on colorado search result
	Thread.sleep(2000);
	myhorse_searchRclick.click();
	
	Thread.sleep(3000);
	MyHorse.click();
	
	myhorse_search.sendKeys("COLORADO");
	Thread.sleep(3000);
	}


public void ClickAljumanMyhorSearch_REdit() throws InterruptedException { //  edit of search result 
	Thread.sleep(2000);
	
	
	myhorse_searchREdit.click();
	Thread.sleep(2000);
	Edithorse_name.sendKeys("UPDATED");
	Thread.sleep(2000);
	Edithorse_Updatebutton.click();
	
	Thread.sleep(3000);
	
	}

public void ClickAljumanMyhorSearch_ReDelete() throws InterruptedException { //  edit of search result 
	Thread.sleep(3000);
	myhorse_searchReDelete.click();
	Thread.sleep(2000);
	myhorse_searchReDeleteConfirmButton.click();
	Thread.sleep(2000);
	}


	
}














	
