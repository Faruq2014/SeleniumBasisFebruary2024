package webElementCommand;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class FindElement extends BaseTest{
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}

	@Test
	public void loginTest() {
	driver.findElement(By.id("email")).sendKeys("lnhk");
	//driver ==WebDriver==browser
	//findElement is the method responsible to search
	//By== is responsible to supply tag and  attributes
	//      id== attributes
	//      ("email")= is the value
	// sendKeys = is the function for input button 
	//"lnhk"= is the value for that input button
	
	driver.findElement(By.name("pass")).sendKeys("hggh");
	//driver.findElement(By.name("login")).submit();
	driver.findElement(By.name("login")).click();
	}
	
	
	@AfterMethod
public void closeFacebook() {
		//closeApplication();	
	}
}
