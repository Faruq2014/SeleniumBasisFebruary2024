package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class PartialLinkText extends BaseTest{
	
	@BeforeMethod
	public void openFaceBook() {
		openApplication();
	}
	
	@Test
	public void getPartialLink() {
	/*
	 * partialLinkText==compound text in the > < then we only use partial of that value
                whit is compound values:
				•	value too long
				•	space in between the words
				•	special character in the values
				•	numeric character in the values
	
	 */
		//Contact Uploading & Non-Users
		
		WebElement contacntLink=driver.findElement(By.partialLinkText("Contact Uploading"));
		contacntLink.click();
	}
	
	@AfterMethod
	public void closeFaceBook(){
		//closeApplication();
	}

}
