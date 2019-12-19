package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BasePage.BasePage;

import Utilities.Constant2;
import Utilities.Constants;
import Utilities.ElementUtil;

public class VerizonMainPage1  extends BasePage{
	WebDriver driver;
	static ElementUtil elementUtil;
	
	static By  phones = By.className("a11y-sr-only");
	//static By phoneBy=By.xpath("//button[contains(text(), 'Phones list')]");
	static By smartphones = By.xpath("//a[@id='thirdLevel00']");
	
	public VerizonMainPage1(WebDriver driver) throws InterruptedException{
		this.driver =driver;
		elementUtil = new ElementUtil(driver);

	}
	
	public  void phone() {
	elementUtil.actionMoveToElement(phones);
	elementUtil.doClick(smartphones);
   

	
	}
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
	
		
		
		
			}
	

