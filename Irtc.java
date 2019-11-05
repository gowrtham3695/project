package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Irtc {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.phptravels.net/");
	 WebElement obj=driver.findElement(By.xpath("//[contains(text(),'My Account')]"));
	 obj.click();

}
}
