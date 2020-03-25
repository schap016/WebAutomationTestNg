package tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
//import org.apache.commons
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.DashboardHomePage;
import pageObjects.CommonOperations;
import utils.SetUp;

public class TestHomePage {

	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	DashboardHomePage dashPage;
	//CommonOperations commOps;

	WebDriverWait driverwait;
	SetUp setUp = new SetUp();
	static JavascriptExecutor js;

	// List<String> searchResults = null;

	//@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() throws Exception {

		// homePage = new HomePage(driver);
		
		//homePage = new HomePage(driver);
		driver = setUp.SetUp(driver);
		
		js = (JavascriptExecutor) driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashPage = PageFactory.initElements(driver, DashboardHomePage.class);
		//commOps = new CommonOperations(driver);
		

		driverwait = new WebDriverWait(driver, 5);
		
	}

	@Test(priority = 0)
	public void search_QAAutomation_Engineer() throws InterruptedException {

		try {
			String homePagetitle = homePage.getPageTitle(driver);
			System.out.println(homePagetitle);

			// Assert that naviagtion to Dice homepage is successful
			Assert.assertEquals(homePagetitle, "Find Jobs in Tech | Dice.com | Find Jobs in Tech");
			
			Thread.sleep(7000);
			//driverwait.until(ExpectedConditions.visibilityOf(homePage.loginOrRegisterLink));
			// Assert that Login/Register link is displayed
			
			System.out.println(homePage.webElementIsDisplayed(homePage.loginOrRegisterLink, driver));
			Assert.assertEquals(true, homePage.webElementIsDisplayed(homePage.loginOrRegisterLink, driver));

			// action to click on Login/register link
			//homePage.homePageElementClick(homePage.loginOrRegisterLink);

			// Assert that Login link has been displayed
			//driverwait.until(ExpectedConditions.visibilityOf(homePage.loginLink));
			//Assert.assertEquals(true, homePage.homePagewebElementIsDisplayed(homePage.loginLink));

			// action to click on Login link
			//homePage.homePageElementClick(homePage.loginLink);

			// get sign in page title
			//String loginPageTitle = loginPage.loginGetPageTitle();

			// Assert that navigation to sign in page is successful
			//Assert.assertEquals(loginPageTitle, "Sign In");

			//driverwait.until(ExpectedConditions.visibilityOf(loginPage.emailId));
			//Assert.assertEquals(true, loginPage.loginPagewebElementIsDisplayed(loginPage.emailId));
			//Assert.assertEquals(true, loginPage.loginPagewebElementIsDisplayed(loginPage.password));

			// action to enter email in email text box on sign in page
			//loginPage.loginPageSendText(loginPage.emailId, "samantha.c@selectiva.com");
			//loginPage.loginPageSendText(loginPage.password, "Welcome@2020");
			//loginPage.loginPageElementClick(loginPage.signInButton);

			//driverwait = new WebDriverWait(driver, 20);
			//driverwait.until(ExpectedConditions.visibilityOf(dashPage.searchBox));
			//Assert.assertEquals(true, dashPage.dashboardPageWebElementIsDisplayed(dashPage.searchBox));

			//dashPage.dashPageSendTextAndSubmit(dashPage.searchBox, "QA Automation Engineer");
			//dashPage.dashbpardPageElementClick(dashPage.searchButton);
			//Thread.sleep(5000);
			//js.executeScript("window.scrollBy(0,250)");

			//driverwait.until(ExpectedConditions.visibilityOf(dashPage.filterCheckBox));
			//dashPage.dashbpardPageElementClick(dashPage.filterCheckBox);
			//Thread.sleep(5000);
			// get results and store links in a list

			/*
			 * js.executeScript("window.scrollBy(0,-250)"); List<String> searchResults = new
			 * ArrayList<String>();
			 */
			/*
			 * String xpath1 = "/div/div[1]/div/div[2]/div[1]/h5/a"; String xpath2 =
			 * "//dhi-search-card";
			 * 
			 * for (int i = 1; i < 4; i++) {
			 * 
			 * String newXpath = xpath2 + "[" + Integer.toString(i) + "]" + xpath1;
			 * WebElement element = driver.findElement(By.xpath(newXpath));
			 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 * element.click(); driver.manage().timeouts().implicitlyWait(5,
			 * TimeUnit.SECONDS); //Thread.sleep(4000); boolean applyNowIsPresent =
			 * dashPage.dashboardPageWebElementIsDisplayed(dashPage.applyButton);
			 * 
			 * if (applyNowIsPresent) {
			 * System.out.println(dashPage.getText(dashPage.applyButton));
			 * if(dashPage.getText(dashPage.applyButton).equalsIgnoreCase("Apply Now")) {
			 * 
			 * searchResults.add(driver.getCurrentUrl());
			 * 
			 * }
			 * 
			 * 
			 * 
			 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 * driver.navigate().back(); driver.manage().timeouts().implicitlyWait(5,
			 * TimeUnit.SECONDS);
			 * 
			 * }
			 * 
			 * System.out.println(searchResults); for( int i1 =
			 * 0;i1<searchResults.size();i1++) {
			 * 
			 * System.out.println("Get Type"+searchResults.getClass().getSimpleName()); }
			 * Thread.sleep(10000); js.executeScript("window.scrollBy(0,-1000)");
			 * Thread.sleep(20000);
			 * driverwait.until(ExpectedConditions.visibilityOf(dashPage.toggle));
			 * dashPage.dashbpardPageElementClick(dashPage.toggle);
			 * driverwait.until(ExpectedConditions.visibilityOf(dashPage.logoutButton));
			 * Thread.sleep(10000);
			 * dashPage.dashbpardPageElementClick(dashPage.logoutButton); }
			 */
		} catch (Exception e) {

			System.out.println("Exception" + e);
		}

	}
//     
//    

	@AfterMethod

	public void afterMethod(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {

				TakesScreenshot screenshot = (TakesScreenshot) driver;
				// Call method to capture screenshot
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name

				// FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");

			} catch (Exception e) {

				System.out.println("Error taking screenshot");

			}

		}

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}