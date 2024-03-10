package webDriverCommand;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebdriverMethods {

	WebDriver driver;
	
	@Test
	public void maximizeWindow() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//method calling concept
		//how to maximize/minimize/full screen browser
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
	}
	@Test
	public void implecitelyWait() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//explain implicitlyWait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void getFacebookTitle() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//how to print title from an application
		String expectedFacbookTitle=driver.getTitle();
		System.out.println("the title of the facebook  "+expectedFacbookTitle);
		//how to validate title
		
		     //positive = positive=positive
		      //negative = negative=positive
				//actual = expected=pass
				//actual != expected=fail==defect
				//Assertion package in TestNG
		String actualTitle="Facebook - log in or sign up124";
		//Assert.assertEquals(actualTitle, expectedFacbookTitle);
		//Assert.assertSame(actualTitle, expectedFacbookTitle);
		//Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedFacbookTitle));
		
		
		//positive data !=negative data
		Assert.assertNotEquals(actualTitle, expectedFacbookTitle);
		Assert.assertNotSame(actualTitle, expectedFacbookTitle);
		Assert.assertFalse(actualTitle.equalsIgnoreCase(expectedFacbookTitle));
	
		
		driver.quit();
	}
	
	@Test
	public void getFacebookUrl() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		String expectedUrl=driver.getCurrentUrl();
		String actualUrl="https://www.facebook.com/";
		Assert.assertEquals(expectedUrl, actualUrl);
		driver.quit();
		
	}
}
