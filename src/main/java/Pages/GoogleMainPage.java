package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Constants;

import BasePage.BasePage;
import Utilities.ElementUtil;

  public class GoogleMainPage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	
	
	
	public GoogleMainPage(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getHomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.HOME_PAGE_TITLE);
		
	}
	
	
	
	
	
}
