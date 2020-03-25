package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pageObjects.CommonOperations;

//Home page operations and actions
public class HomePage extends CommonOperations{

	/*
	 * HomePage(WebDriver driver) { super(driver); // TODO Auto-generated
	 * constructor stub }
	 */

	WebDriver driver2;
	CommonOperations commops;
	
	//Home Page locators	


	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Login/Register')]")
		public WebElement loginOrRegisterLink;
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/dashboard/login')]")
		public WebElement loginLink;

	/*
	 * @FindBy(how = How.ID, using = "email") public WebElement emailId;
	 */	
	public HomePage(WebDriver driver2) {
		
		
		//super(driver);
		this.driver2 = driver2;
	}


	// extended super class CommonOperations driver variable  = d

	
	public boolean homePagewebElementIsDisplayed(WebElement element) {
		  
		//WebElement element2;
		//boolean a = false;
		
	//	a = webElementIsDisplayed(element);
		
		
//		if (element.isDisplayed()==true) {
//			a = true;
//			return a;
//		}
//		return a;
//			
		
		return super.webElementIsDisplayed(element, driver2);
	}
	
	
	
	public void homePageElementClick(WebElement element) {
		
		//driver.findElement((By) element);
		element.click();
	
		
		
	}
	
	public void homePageSendText(WebElement element, String keys) {
		element.sendKeys(keys);
		
	}
	
	@Override
	public String getPageTitle(WebDriver driver2) {
		
		//return driver.getTitle();
		
		return commops.getPageTitle(driver2);
		
	}
	@Override
	public void sendText(WebElement element,String text, WebDriver driver2) {
		
		//driver.findElement((By) element).sendKeys(text);
		//element.sendKeys(text);
		commops.sendText(element, text,driver2);
		
	}
	
	@Override
	public void elementClick(WebElement element, WebDriver driver2) {
		
		//driver.findElement((By) element).click();
		//element.click();
		commops.elementClick(element, driver2);
	}
	
	@Override
	 public boolean webElementIsDisplayed(WebElement element, WebDriver driver2) {
		  
		/*
		 * WebElement a = null; // = driver.findElement(element);
		 * 
		 * if(a.isDisplayed()) {
		 * 
		 * return true;
		 * 
		 * } return false;
		 */
		
		boolean a = commops.webElementIsDisplayed(element, driver2);
		return a;
	}
	

}