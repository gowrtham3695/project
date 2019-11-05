package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment extends BaseClass {
	public static void main(String[] args) {
		
		launchBrowser("http://www.itgeared.com/demo/1506-ajax-loading.html");
	WebElement obj=	driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]"));
	obj.click();
	WebDriverWait w = new WebDriverWait(driver,10);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
	System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
	}

}
