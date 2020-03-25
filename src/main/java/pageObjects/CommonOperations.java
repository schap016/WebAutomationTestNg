package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utils.SetUp;

public class CommonOperations {

//	WebDriver driver;

	// constructor for common operations class
	public CommonOperations() {

		//this.driver = driver;

	}

	public String getPageTitle(WebDriver driver) {

	return driver.getTitle();

	}

	public boolean webElementIsDisplayed(WebElement element, WebDriver driver) {

		WebElement a = null;
		//a= driver.findElement((By) element);

		if (a.isDisplayed()) {

			return true;

		}

		return false;
	}

	public boolean WebElementIsDisplayed(List<WebElement> elements) {
		boolean a = false;
		for (WebElement element : elements) {

			if (element.isDisplayed()) {

				a = true;
			}

		}

		return a;

	}

	public void sendText(WebElement element, String text, WebDriver driver) {

		driver.findElement((By) element).sendKeys(text);
		//element.sendKeys(text);

	}

	public void elementClick(WebElement element, WebDriver driver) {

		driver.findElement((By) element).click();
		//element.click();
	}

	public boolean elementIsChecked(WebElement element) {

		if (element.isSelected()) {

			return true;
		}

		return false;
	}

}
