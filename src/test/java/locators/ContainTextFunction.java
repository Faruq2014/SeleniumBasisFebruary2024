package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class ContainTextFunction extends BaseTest{
	
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	@Test
	public void regularTextFunction() {
		/*//h2[text()='Connect with friends and the world around you on Facebook.']
		 *  
		 *  //tag[text()='vlaue']
		 */
		
		
		
	WebElement connectFriend=driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']"));
	String connectFriendText=connectFriend.getText();
	System.out.println("text function  "+connectFriendText);
	}
	
	@Test
	public void containTextFunction() {
		/*
		 * //h2[contains(text(),'Connect with friends')]
		 */
		
		WebElement connectFriends=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]"));
		String connectFriendsString= connectFriends.getText();
		System.out.println(" conatin function   "+connectFriendsString);
	
	}
	

	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}

}
