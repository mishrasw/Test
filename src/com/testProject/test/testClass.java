package com.testProject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
	
	public static void main(String[] Arg){
		
		System.setProperty("webdriver.chrome.driver", "D:/TestProject/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
	}

}
