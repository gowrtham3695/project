package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\Practice\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		//*[@id="content"]/table/tbody/tr[1]/th
		//*[@id="content"]/table/tbody/tr[2]/th
		//*[@id="content"]/table/tbody/tr[3]/th
	String	beforexpath="//*[@id=\"content\"]/table/tbody/tr[";
	String afterxpath="]/th";
	for(int i = 1;i<=3;i++)
	{
		String actual = beforexpath+i+afterxpath;
	  WebElement element = driver.findElement(By.xpath(actual));
	  System.out.println(element.getText());
	}
	}
}
