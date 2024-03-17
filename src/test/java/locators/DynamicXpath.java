package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class DynamicXpath extends BaseTest{
 /*
  * what is Dynamic locators
  *   locators change in run time
  *      Session based
  *      user based
  *      location based
  *  how do i understand it is dynamic
  *       numeric value in the front or end
  *       Special character
  *  how do i handle dynamic locator
  *    using start-with mechanism
  *    
  *    XPath Function - "starts with"
            tag[starts-with(@attribute,'beginning values')]
         //button[starts-with(@id,'u_0_5_')]
    side note: do not include the value which change all the time 
  *     
  *     //button[start-with(@id,'u_0_5')]
  *     
  *     ends-with  =bl_u_0_5
  *     //button[ends-with(@id,'u_0_5')]
  *     
  *     regular formula== //tag[@attribute='value']
  */
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test(invocationCount=2)
	public void logingTest() {
		WebElement loginButton=driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]"));
		loginButton.click();
	
	}
	
	
	

	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
}
