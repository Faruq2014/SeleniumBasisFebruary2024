package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTitleAndUrlTest {
	WebDriver driver;
	 @BeforeTest
	public void openApplication() {
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	 
	@Test
	public void titleTest() {
		// how to print title from an application
		String expectedFacbookTitle = driver.getTitle();
		System.out.println("the title of the facebook  " + expectedFacbookTitle);
		
		String actualTitle = "Facebook - log in or sign up124";
		// Assert.assertEquals(actualTitle, expectedFacbookTitle);
		// Assert.assertSame(actualTitle, expectedFacbookTitle);
		// Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedFacbookTitle));
		
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
	
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}

}
