package org.xpath;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("gowtham01995@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Gowtham3695@");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	WebElement obj=	driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
	Actions act = new Actions(driver);
	act.moveToElement(obj).build().perform();
	WebDriverWait w = new WebDriverWait(driver, 5);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Home & Furniture')]")));
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'Clocks')]")).click();
	Thread.sleep(5000);
	WebElement element=driver.findElement(By.xpath("//a[text()='Precisio Analog 32 cm X 32 cm Wall Clock']"));
	element.click();
	System.out.println(driver.getTitle());
	//to get window id
    Set<String>win=driver.getWindowHandles();
	Iterator<String>it=win.iterator();
	Thread.sleep(5000l);
	String parentid=it.next();

	Thread.sleep(10000l);
	String childid=it.next();
	//to switch the window
	driver.switchTo().window(childid); 
	System.out.println(driver.getTitle());
	Thread.sleep(5000L);
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
	
	}
}
//}
