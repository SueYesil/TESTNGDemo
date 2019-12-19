package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.EmailPage;
import Utilities.Constants;

public class EmailPageTesting {
	
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	EmailPage emailPage;
	
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		emailPage = new EmailPage(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void getTitle(){
		
		String title = emailPage.getHomePageTitle();
		System.out.println("Page title is: "+ title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}
	
	@Test(priority=2)
	public void doSendAndClick(){
		emailPage.doSendAndClick();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
