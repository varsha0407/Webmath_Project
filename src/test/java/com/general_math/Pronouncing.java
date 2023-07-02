package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pronouncing {
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
        String pronouncingLink = p.getProperty("pronouncinglink");
        String name3 = p.getProperty("name3");
        String num5 = p.getProperty("num5");

        String prouncingItBtn = p.getProperty("pronouncingitbtn");

        
        d.get(url);
		
		//click on general math
		d.findElement(By.linkText(generalMath)).click();
		Thread.sleep(1000);
		
		//click on pronouncing link
		d.findElement(By.linkText(pronouncingLink)).click();
		Thread.sleep(1000);
		
		//enter the inputs
		d.findElement(By.name(name3)).sendKeys(num5);
		Thread.sleep(1000);
		
		//click on btn
		d.findElement(By.xpath(prouncingItBtn)).click();
		Thread.sleep(1000);
		
		  d.quit();
	} catch (Exception e) {
		System.out.println(e);	}
}
}
