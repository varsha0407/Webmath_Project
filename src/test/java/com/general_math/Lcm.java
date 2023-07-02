package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lcm {
	public static void main(String[] args) {
		try {
	   WebDriverManager.chromedriver().setup();	
	   ChromeOptions c = new ChromeOptions();
	   c.addArguments("--remote-allow-origins=*");
	   WebDriver d = new ChromeDriver(c);
	   d.manage().window().maximize();
				
	   FileInputStream fis = new FileInputStream("C:\\Users\\91797\\eclipse-workspace\\Webmath_Project\\input.properties");
		Properties p = new Properties();
		p.load(fis);
        String url = p.getProperty("url");
        String generalMath = p.getProperty("generalmath");
        String lCM = p.getProperty("lcm");
        String name2 = p.getProperty("name2");
        String num4 = p.getProperty("num4");
        String lCM1 = p.getProperty("lcm1");

        d.get(url);
		
		//click on general math
		d.findElement(By.linkText(generalMath)).click();
		Thread.sleep(1000);
		
		// click on lcm
		d.findElement(By.linkText(lCM)).click();
		Thread.sleep(1000);
        
		//enter the inputs
		d.findElement(By.name(name2)).sendKeys(num4);
		Thread.sleep(1000);

		//click on lcm
		d.findElement(By.xpath(lCM1)).click();
		Thread.sleep(1000);

		  d.quit();
	} catch (Exception e) {
		System.out.println(e);	}
}
}