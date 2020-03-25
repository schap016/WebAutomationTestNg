package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

//Home page operations and actions
public class DashboardHomePage {

	/*
	 * HomePage(WebDriver driver) { super(driver); // TODO Auto-generated
	 * constructor stub }
	 */

	WebDriver driver;

	// Home Page locators

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search Term']")
	public WebElement searchBox;

	@FindBy(how = How.ID, using = "dice-login-customer-name")
	public WebElement toggle;

	@FindBy(how = How.XPATH, using = "//button[@data-automation-id='logout-button']")
	public WebElement logoutButton;

	@FindBy(how = How.ID, using = "submitSearch-button")
	public WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Third Party')]/i")
	public WebElement filterCheckBox;
	
	@FindBy(how = How.ID, using = "applybtn-2")
	public WebElement applyButton;
	

	public DashboardHomePage(WebDriver driver) {

		this.driver = driver;
	}

	// extended super class CommonOperations driver variable = d

	public boolean dashboardPageWebElementIsDisplayed(WebElement element) {

		// WebElement element2;
		boolean a = false;

		// a = webElementIsDisplayed(element);

		if (element.isDisplayed() == true) {
			a = true;
			return a;
		}
		return a;

	}

	public void dashbpardPageElementClick(WebElement element) {

		// driver.findElement((By) element);
		element.click();

	}

	public void dashPageSendText(WebElement element, String keys) {
		element.sendKeys(keys);

	}
	
	public void dashPageSendTextAndSubmit(WebElement element, String keys) {
		element.sendKeys(keys);
		element.submit();

	}


	public boolean isButtonDisabled(WebElement element) {
		
		
		if(element.isEnabled()==false) {
			
			return true;
		}
		return false;
	}
	
	
	public String getText(WebElement element) {
		
		
		String val = element.getText();
		
		
		return val;
		
	}

}