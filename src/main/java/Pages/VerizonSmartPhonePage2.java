package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePage.BasePage;
import Utilities.Constant2;
import Utilities.ElementUtil;

public class VerizonSmartPhonePage2 extends BasePage{
	WebDriver driver;
	static ElementUtil elementUtil;
	
	static By smartphone=By.xpath("//div[@id='tile_dev12400033']//div[@id='NonMobileId']//span[1]");
	//static By smartphone=By.className("NHaasTX75Bd");
	
	public VerizonSmartPhonePage2(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void ClickSmart(){
		elementUtil.waitForElementPresent(smartphone);
	    elementUtil.doClick(smartphone);
		
	}
	public String getPhonePageTitle(){
		return driver.getTitle();
	}
	
}
