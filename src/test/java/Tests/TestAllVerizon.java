package Tests;
//
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.VerizonMainPage1;
import Pages.VerizonSmartPhonePage2;
import Pages.VerizonIphone11Page;
import Pages.VerizonCustomizePage;
//
//public class TestAllVerizon extends BasePage{
//	WebDriver driver;
//	Properties prop;
//	BasePage basePage;
//	VerizonMainPage1 verizonMainPage1;
//	VerizonSmartPhonePage2 verizonMainPage2;
//	VerizonIphone11Page verizonMainPage3;
//	VerizonCustomizePage verizonPage4;
//	
//	
//	
//	@BeforeMethod
//	public void setUp() throws InterruptedException{
//		basePage = new BasePage();
//		prop = basePage.initialize_properties();
//		driver = basePage.initialize_driver(prop);
//		verizonMainPage1= new VerizonMainPage1(driver);
//		verizonMainPage2=new VerizonSmartPhonePage2(driver);
//		verizonMainPage3=new VerizonIphone11Page(driver);
//		verizonPage4= new VerizonCustomizePage(driver);
//		
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	@Test(priority=1)
//	public void moveTosmart() {
//		verizonMainPage1.phone();
//	
//}
//   @Test(priority=2)
//   	public void smartClick(){
//	   verizonMainPage1.phone();
//	   verizonMainPage2.ClickSmart();
//   }
//   
//   @Test(priority=3)
//  	public void chooseFeature(){
//	   verizonMainPage1.phone();
//	   verizonMainPage2.ClickSmart();
//	   verizonMainPage3.featureschoose();
//   }
//   @Test(priority=4)
// 	public void customize(){
//	   verizonMainPage1.phone();
//	   verizonMainPage2.ClickSmart();
//	   verizonMainPage3.featureschoose();
//	   verizonPage4.getTextpage4();
//   }
//
//
//
//	@AfterMethod
//	public void close(){
//		basePage.quitBrowser();
//	}
//	
//}
