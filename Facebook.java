package org.xpath;

public class Facebook extends BaseClass{

	public static void main(String[] args) {
		launchBrowser("https://www.facebook.com/");
		enterText("email", "helo");
		String att = getAttribute("email", "value");
		
		if(att.equals("helo")) {
			System.out.println(true);
		}
	}
	
}
