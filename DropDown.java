package org.xpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement obj =driver.findElement(By.id("year"));
		obj.click();
		//select method
		Select set = new Select(obj);
		set.selectByValue("1995");
		//to display the list of values
		List<WebElement>set1 =set.getOptions();
		//to display the size of value or num of values present in that drop down 
		System.out.println(set1.size());
		//to get each value --for loop is used
		int j = set1.size();
		for(int i =0;i<j;i++)
		{
			String str= set1.get(i).getText();
			System.out.println(str);
			//to click 
			set1.get(i).click();
		}
	}

}
