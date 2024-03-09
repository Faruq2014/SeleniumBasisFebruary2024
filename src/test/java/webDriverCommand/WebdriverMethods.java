package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		String facbookTitle=driver.getTitle();
		System.out.println(facbookTitle);
		
		
	}
}
