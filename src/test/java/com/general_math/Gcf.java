package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gcf {
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
        String name1 = p.getProperty("name1");
        String gCF = p.getProperty("gcf");
       String num3 = p.getProperty("num3");
       String gCF1 = p.getProperty("gcf1");
        
         d.get(url);
      //click on general math
		d.findElement(By.linkText(generalMath)).click();
		Thread.sleep(1000);
		
		// click on GCF
		d.findElement(By.linkText(gCF)).click();
		Thread.sleep(1000);
		
		//enter the integers
		d.findElement(By.name(name1)).sendKeys(num3);
		Thread.sleep(1000);
		
		//click on gcf
		d.findElement(By.xpath(gCF1)).click();
		Thread.sleep(1000);
        d.quit();
		}
		catch (Exception e) {
			System.out.println(e);
		
	}

}
}