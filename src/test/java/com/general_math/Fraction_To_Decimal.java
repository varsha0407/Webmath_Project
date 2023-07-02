package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fraction_To_Decimal {
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
			    String fraction_To_DecimalLink = p.getProperty("fraction_to_decimallink");
			    String converItBtn = p.getProperty("convertit");
			    String fraction_Field1 = p.getProperty("fractionfield1");
			    String fraction_Field2 = p.getProperty("fractionfield2");
			    String decimalField = p.getProperty("decimalfield");
			    String num6 = p.getProperty("num6");
			    String num7 = p.getProperty("num7");
			    String num8 = p.getProperty("num8");


			    d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on fraction to decimal link
				d.findElement(By.linkText(fraction_To_DecimalLink)).click();
				Thread.sleep(1000);
				
				//click on convertit
				d.findElement(By.xpath(converItBtn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//clear the data from fractionfield
				d.findElement(By.name(fraction_Field1)).clear();
				Thread.sleep(1000);
				
				//clear the data from fractonfield
				d.findElement(By.name(fraction_Field2)).clear();
				Thread.sleep(1000);
				
				//clear the data from decimalfield
				d.findElement(By.name(decimalField)).clear();
				Thread.sleep(1000);
				
				//click on convertit
				d.findElement(By.xpath(converItBtn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//enter the data in fractionfield1
				d.findElement(By.name(fraction_Field1)).sendKeys(num6);
				Thread.sleep(1000);
				
				//enter the data in fractionfield2
				d.findElement(By.name(fraction_Field2)).sendKeys(num7);
				Thread.sleep(1000);
				
				//enter the data in decimalfield
				d.findElement(By.name(decimalField)).sendKeys(num8);
				Thread.sleep(1000);
				
				//click on convertit
				d.findElement(By.xpath(converItBtn)).click();
				Thread.sleep(1000);
				
				 d.quit();
		} catch (Exception e) {
			System.out.println(e);		}
	}
	}
