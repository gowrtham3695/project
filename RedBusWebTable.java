package org.xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusWebTable {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\Practice\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("http://www.leafground.com/pages/table.html");
		List <WebElement> table = driver.findElements(By.tagName("tr"));
		System.out.println(table.size());
		List<WebElement> colum = driver.findElements(By.tagName("th"));
		int i =colum.size();
		System.out.println("number of coulums "+ i);
		WebElement percentage = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td[1]"));
		 String str=percentage.getText();
		 System.out.println(str); 
		 List<WebElement> least = driver.findElements(By.xpath("//td[2]"));
		 List<Integer> number = new ArrayList<Integer>();
		 for (WebElement k : least) {
			 String s = k.getText();//replace("%", "");
			// System.out.println(k.getText());
		int m=	 Integer.parseInt(s);
	number.add(m);
		
			
		}
		 System.out.println(number);
		 int j =Collections.min(number);
		 System.out.println(j);
		 driver.findElement(By.xpath("//td[contains(text(),'"+j+"')]/following-sibling::td/input")).click();
	}
}
