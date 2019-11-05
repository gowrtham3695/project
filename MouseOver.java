package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement obj =driver.findElement(By.xpath("//li[25]//a[1]"));
	obj.click();
	WebElement mouse=driver.findElement(By.xpath("//a[@class='btnMouse']"));
	Actions act= new Actions(driver);
	act.moveToElement(mouse).build().perform();
	WebElement print =driver.findElement(By.xpath("//a[contains(text(),'Selenium')]"));
	print.click();
	System.out.println(print.getText());


}
}
