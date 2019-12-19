package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Constants;
import Utilities.ElementUtil;

public class EmailPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	
	By email = By.id("identifierId");
	By nextButton = By.id("identifierNext");
	
	
	public EmailPage(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getHomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.HOME_PAGE_TITLE);
		
	}
	
	public void doSendAndClick(){
		elementUtil.doSendKeys(email, "boblerry4@gmail.com");
		elementUtil.doClick(nextButton);
	}
	
	

}
