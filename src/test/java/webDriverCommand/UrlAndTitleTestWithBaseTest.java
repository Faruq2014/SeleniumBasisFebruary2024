package webDriverCommand;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class UrlAndTitleTestWithBaseTest extends BaseTest{
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	public void titleTest() {
		// how to print title from an application
		String expectedFacbookTitle = driver.getTitle();
		System.out.println("the title of the facebook  " + expectedFacbookTitle);
		
		String actualTitle = "Facebook - log in or sign up124";
		Assert.assertNotEquals(actualTitle, expectedFacbookTitle);
		Assert.assertNotSame(actualTitle, expectedFacbookTitle);
		Assert.assertFalse(actualTitle.equalsIgnoreCase(expectedFacbookTitle));

	}
	
	
	@Test	
   public void urlTest() {
		String expectedUrl=driver.getCurrentUrl();
		String actualUrl="https://www.facebook.com/";
		Assert.assertEquals(expectedUrl, actualUrl);

   }
	
	@AfterMethod
	public void closeFacebook() {
			closeApplication();
	}
}
