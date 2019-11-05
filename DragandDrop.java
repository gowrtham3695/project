package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseClass {

	
//public static void drag(String url) {
	//String u= "null";


	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		//driver.get("http://www.leafground.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);

	

//	WebElement homepage = driver.findElement(By.xpath("//li[14]//a[1]"));
//	homepage.click();
	//WebElement source =driver.findElement(By.id("draggable"));
//	WebElement target= driver.findElement(By.id("droppable"));
//	Actions act = new Actions(driver);
//	act.dragAndDrop(source, target).build().perform();
	public static void main(String[] args) {
		launchBrowser("http://www.leafground.com/");

	}
	
}

