package com.myhorse.Framwork;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	
	public void browserInitialize() {
		
		ChromeOptions options = new ChromeOptions();
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Aljuman\\driver\\chromedriver111.exe");	
		driver  = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://aljuman-backend.magnetoinfotech.com/login");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	}	
	
	public void zoom() {
		
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
	}
	
public void Scrolldown() {
	
	//WebDriver driver = new FirefoxDriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
