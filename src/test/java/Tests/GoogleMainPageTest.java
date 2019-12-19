package Tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BasePage.BasePage;
import Pages.GoogleMainPage;
import Utilities.Constants;


public class GoogleMainPageTest {
	
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	GoogleMainPage googleMainPage;
	
	
	//TestNG Annotation
	@DataProvider
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		googleMainPage= new GoogleMainPage(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
    @Test
	public void getTitle(){
		String title = googleMainPage.getHomePageTitle();
		System.out.println("Page title is: "+ title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE); //verification steps
		
	//	Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);  // Assert exception
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
