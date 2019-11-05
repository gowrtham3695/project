package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	static WebDriver driver=null;
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.get(url);
	}
	
	public static void enterText(String locator,String text) {
		driver.findElement(By.id(locator)).sendKeys(text);
	}
	
	public static String getAttribute(String locator,String storage) {
		String att = driver.findElement(By.id(locator)).getAttribute(storage);
		System.out.println(att);
		return att;
	}
	public static void dragAndDrop(String locator) {
		WebElement homepage = driver.findElement(By.xpath(locator));
		homepage.click();
		WebElement source =driver.findElement(By.id(locator));
		WebElement target= driver.findElement(By.id(locator));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		

	}
	
}
