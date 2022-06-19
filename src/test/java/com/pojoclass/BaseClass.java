package com.pojoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
		
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
	}
	public void getUrl(String Url) {
	    driver.get(Url);

	}
	public void type(WebElement element,  String Data) {
		
		
		element.sendKeys(Data);

	}
	
	public void clear(WebElement element) {
		
		element.clear();

}
		

	public void click(WebElement element) {
		element.click();

	}
	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id("attribute value"));
		return element;

	}
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name("attribute value"));
		return element;
		
	}
	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className("attribute value"));
		return element;

	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public static String getAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;

	}
	public static String getAttributevalue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public void selectOptionText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	public void deselectOptionText(WebElement element, String text) {
		Select deselect = new Select(element);
		deselect.deselectByVisibleText(text);
	}
	public void selectOptionIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(0);

	}
	public void deselectOptionIndex(WebElement element, int value) {
		Select deselect = new Select(element);
		deselect.deselectByIndex(0);
	}
	public void selectOptionAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue("value");
	}
	public void deselectOptionAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue("value");
	}
	public void typeJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value', '"+text+"')",element); 
	}
	
	//public void typeJsget(WebElement element, String getAttribute) {
	//	JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	Object name = executor.executeScript("return arguments[0].getAttribute('value')",element);
	//}
	//public void typeJslogin(WebElement element, String text) {
	//	JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	WebElement btnLogin = driver.findElement(By.name("login"));
		//executor.executeScript('arguments[0]. click()', btnLogin);
	
	//}
	public void forward() {
		driver.navigate().forward();

	}
	public void backward() {
		driver.navigate().back();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	public void navigateUrl() {
		driver.navigate().to("fb");
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void quit() {
		driver.quit();
	}
	public void close() {
		driver.close();
	}
	public void frameIndex() {
		driver.switchTo().frame(1);
	}
	
	public void doubleclck() {
		Actions action = new Actions(driver);
		action.doubleClick();

	}
	
	public void keyDwn(String text) {
		Actions action = new Actions(driver);
		action.keyDown(text);

	}
	
	public void keyUp(String text) {
		Actions action = new Actions(driver);
		action.keyUp(text);

	}
	public void contextClk() {
		Actions action = new Actions(driver);
		action.contextClick();
	
	}

	//public WebElement sendKeyClk() {
		//Actions action = new Actions(driver);
		//action.contextClick();
	
	
   public void frameId(int index) {
	driver.switchTo().frame(index);
   }
   
   public void frameid(String id) {
		driver.switchTo().frame(id);
	   }
   
   public void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	   }
   public void parentFrame() {
		driver.switchTo().parentFrame();
	   }
   

}
