package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {


	public static WebDriver driver;

	public static void getdriver() {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void enterurl(String url) {
		driver.get(url);
	}

	public  static void maximize() {
		driver.manage().window().maximize();	
	}

	public static WebElement locatorID(String locatorID) { 
		WebElement element = driver.findElement(By.id(locatorID));
		return element;
	}

	public static WebElement locatorXPATH(String locatorID) {
		WebElement element = driver.findElement(By.xpath(locatorID));
		return element;
	}

	public static WebElement locatorNAME(String locatorID) {
		WebElement element = driver.findElement(By.name(locatorID));
		return element;
	}

	public static WebElement locatorCLASS(String locatorID) {
		WebElement element = driver.findElement(By.className(locatorID));
		return element;
	}

	public static String getTextz(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void sendkey(WebElement element , String data) {
		element.sendKeys(data);
	}

	public static String url() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void selectbyINDEX(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectbyVALUE(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectbyVISIBLETEXT(WebElement element,String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}

	public static void clear(WebElement element) {
		element.clear();	
	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);	
	}



}
