package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class LinkButton extends BaseTest{


	
	@BeforeMethod
	public void openFaceBook() {
		openApplication();
	}
	
	@Test
	void linkButtonText(){
		/*
		 * start with == <a 
		 * href== is optiontal 
		 * Text == > Forgot password? < 
		 * Text will be inside > < = is the Forgot password? End with </a>
		 * 
		 */
		WebElement forgot=driver.findElement(By.linkText("Forgot password?"));
		forgot.click();
	
	
	}
	
	@AfterMethod
	public void closeFaceBook() {
		//closeApplication();
	}

}
