package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HowToOpenApplication {
	// instance variable
	WebDriver driver;

	@Test
	private void openFacebookWithChrome() {
		// how to open browser
		driver = new ChromeDriver();
		// open application
		driver.get("https://www.facebook.com/");
		//driver.quit();
	}

	@Test
	void openFacebookWithEdge() {
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}

	@Test
	protected void openFacebookWithFirefox() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}

	@Test
	public WebDriver returnTypeWithChrome() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		return driver;
	}
}





