package webElementCommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class FacebookElement implements SearchContext{
	
	/*
	 * What is the super class of Selenium
	 *    SearchContext
	 * How many methods in SearchContext?
	 *   two 
	 * what is findElement method for?
	 *    find single element
	 *  what is findElement method return type?
	 *    WebElement
	 *    
	 *    what is findElements method for?
	 *    find more than one elements
	 *    
	 *    what is findElements method return type?
	 *       List<WebElement>
	 */

	@Override
	public List<WebElement> findElements(By by) {
		
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		
		return null;
	}

}
