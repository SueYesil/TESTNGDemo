package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.Constant2;
import Utilities.ElementUtil;



public class VerizonCustomizePage extends BasePage{
	
	 WebDriver driver;
	 ElementUtil elementUtil;

	static By text =By.cssSelector("h1.configHeader");
	
	public VerizonCustomizePage(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	
	public String   getTextpage4(){

	return elementUtil.doGetText(text);
	
	}
	
	}
/*
 * 
 * VERIZON TEST CASE XPATH SOLUTIONS


PHONES:

//button[contains(text(), 'Phones list')]

SMARTPHONES

//a[@id='thirdLevel00']

IPHONE 11 RED (SHOPPING PAGE SELECT PHONE)

//a[@aria-label='Apple iPhone® XR']

PHONE FEATURES

SELECT COLOR (CORAL)

//input[@id='#ff7f50']

SIZE

//p[contains(text(),'256GB')]

PRICE

//div//input[@id='pricingOption1']

CONTINUE

//button[@id='ATC-Btn']

ZIPCODE

//input[@id='zipcode']

CONFIRM LOCATION

//button[contains(text(), 'Confirm Location')]

NEW CUSTOMER

//button[contains(text(), 'New Customer')]/*
 */

