package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class LinkXpath extends BaseTest{
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	public void linkXpathTest() {
		/* how do i build xpath for link
		 * 
		 * //a[text()='Meta Pay']
		 *link == start with <a
		 *        text ==>value<
		 *     //a[text()='Meta Pay'] 
		 *     a= tag 
		 *     text()= function
		 *       'Meta Pay'== value
		 *        
		 *        regular formula== //tag[@attribute='value']
		 */
	driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	}
	
	
	

	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}

}
