package webDriverCommand;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTest implements WebDriver{

	@Override
	public void get(String url) {
		// this method is for open an application
		
	}

	@Override
	public String getCurrentUrl() {
		// this method is for get application url
		return null;
	}

	@Override
	public String getTitle() {
		// this method is for get page title of an application
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// this method is to find elements
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// this method is to find element
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// to close a page of an application
		
	}

	@Override
	public void quit() {
		// to close or quit a browser
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// to work with multiple page of an application
		return null;
	}

	@Override
	public String getWindowHandle() {
		// to work with multiple page of an application
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// this method is for open an application with navigation 
		return null;
	}

	@Override
	public Options manage() {
		// this is a method 
		   // maximize, minimize, full screen the window
		   // it also handle time issues
		return null;
	}

}
