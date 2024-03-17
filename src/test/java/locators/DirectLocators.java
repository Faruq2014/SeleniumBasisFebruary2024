package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class DirectLocators extends BaseTest{

	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test(priority=0)
	public void whatIsDirectLocator() {
		/*When you can directly spot a tag and attributes 
		 * those called direct locators
		 *    id,name, class, linkText, partialLinkText
		 *    id is the best one
		 */	
	}
	
	@Test(priority=1)
	public void idTest() {
		WebElement userName=driver.findElement(By.id("email1"));
		userName.sendKeys("lnlu");
	}
	
	@Test(priority=2)
	public void nameTest() {
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("jhdf");
	}
	
	@Test(priority=3)
	public void classTest() {
	WebElement forgotPass=driver.findElement(By.className("_6ltj"));
	forgotPass.click();
	}
	
	@Test(priority=4)
	public void linkTest() {
		WebElement spanishLink=driver.findElement(By.linkText("Español"));
		spanishLink.click();
	}
	
	@Test(priority=5)
	public void partiaLinkTest() {
		driver.findElement(By.partialLinkText("Imagine with")).click();
	}
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
}
