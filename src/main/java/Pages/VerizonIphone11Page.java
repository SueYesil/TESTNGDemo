package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePage.BasePage;
import Utilities.Constant2;
import Utilities.ElementUtil;

public class VerizonIphone11Page extends BasePage {
	WebDriver driver;
	static ElementUtil elementUtil;
	
	static By color=By.xpath("//div[contains(@class,'flex width100p pad15 onlyBottomPad')]//div[3]//div[2]");
	static By gB=By.xpath("//p[contains(text(),'256GB')]");
	static By price=By.xpath("//div[contains(text(),'Retail price')]");
	static By clickBtn=By.id("ATC-Btn");
	
	static By zipcode=By.id("zipcode");
	static By Button=By.className("defaultPrimaryCTA");
	static By newbuttonBy=By.className("modalButton");
	
	
	public VerizonIphone11Page(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	public String HomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constant2.IPHONE_PAGE_HEADER2);
		
	}
	public   void    featureschoose()  {

		elementUtil.waitForElementPresent(color);
		
		elementUtil.doClick(color);
	
		elementUtil.getElement(gB);
		elementUtil.doClick(gB);
		
		elementUtil.getElement(price);
		elementUtil.doClick(price);
		
		elementUtil.getElement(clickBtn);
		elementUtil.doClick(clickBtn);
		
		elementUtil.waitForElementPresent(zipcode);
		
	
		elementUtil.doClick(zipcode);
		elementUtil.doSendKeys(zipcode, "07013");
		elementUtil.getElement(Button);
		elementUtil.doClick(Button);
		
		elementUtil.getElement(newbuttonBy);
		elementUtil.doClick(newbuttonBy);
		System.out.println("Iphone Page title: "+Constant2.IPHONE_PAGE_HEADER2);
		
	}
}
