package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Decimal_To_Fraction {
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
				String decimal_To_FractionLink = p.getProperty("decimal_to_fractionlink");
				String decimalField = p.getProperty("decimal_field");
				String num9 = p.getProperty("num9");
				String convertIt_Btn = p.getProperty("convertit_btn");
				String num10 = p.getProperty("num10");

			    d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on decimal_to_fractionlink
				d.findElement(By.linkText(decimal_To_FractionLink)).click();
				Thread.sleep(1000);
				
				//enter the data in decimal field
				d.findElement(By.id(decimalField)).sendKeys(num9);
				Thread.sleep(1000);
				
				//click on convertit btn
				d.findElement(By.xpath(convertIt_Btn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//clear the data from decimal field
				d.findElement(By.id(decimalField)).clear();
				Thread.sleep(1000);
				
				//enter the data in decimal field
				d.findElement(By.id(decimalField)).sendKeys(num10);
				Thread.sleep(1000);
				
				//click on convertit btn
				d.findElement(By.xpath(convertIt_Btn)).click();
				Thread.sleep(1000);
				//click on ok
				
				Alert alt = d.switchTo().alert();
				alt.accept();
				Thread.sleep(1000);
				
				 d.quit();
		} catch (Exception e) {
			System.out.println(e);		}
	}
	}
