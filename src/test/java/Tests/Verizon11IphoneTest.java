package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.VerizonCustomizePage;
import Pages.VerizonIphone11Page;
import Pages.VerizonMainPage1;
import Pages.VerizonSmartPhonePage2;

public class Verizon11IphoneTest {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage1 verizonMainPage1;
	VerizonSmartPhonePage2 verizonSmartPhonePage2;
	VerizonIphone11Page verizonphone11Page;
	
	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		verizonMainPage1= new VerizonMainPage1(driver);
		verizonMainPage1.phone();
	    verizonMainPage1.getLoginPageTitle();
		verizonSmartPhonePage2=new VerizonSmartPhonePage2(driver);
		verizonSmartPhonePage2.ClickSmart();
		verizonSmartPhonePage2.getPhonePageTitle();
		
		verizonphone11Page=new VerizonIphone11Page(driver);
	
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void chooseFeatures(){
		verizonphone11Page.featureschoose();
		
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}	
}
