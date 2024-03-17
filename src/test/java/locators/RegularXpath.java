package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegularXpath extends BaseTest{

	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test(priority=0)
	public void regularXpathTestForID() {
		WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("hgihi");
		
	}
	
	@Test(priority=1)
	public void regularXpathTestForClass() {
	WebElement pass=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		pass.sendKeys("lkkj");
	}
	
	@Test(priority=2)
	public void regularXpathTestForName() {
	WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
	loginButton.click();
	}
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
	
	
	
	
}
