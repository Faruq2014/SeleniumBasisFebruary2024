package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class HowToGetWebElementText extends BaseTest{
	
	@BeforeMethod
	public void openFaceBook() {
		openApplication();
	}
	
	@Test
	void getText(){
		
	WebElement	loginButton=driver.findElement(By.name("login"));
	String loginButtonText=loginButton.getText();
	System.out.println("log in button text is---> "+loginButtonText);
	String actualLoginButtonText="Log In";
	Assert.assertEquals(loginButtonText, actualLoginButtonText," <<text did not match>>  ");
	loginButton.click();
	
	}
	
	@AfterMethod
	public void closeFaceBook() {
		//closeApplication();
	}

}
