package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiply_With {
	
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
				String multiply_WithLink = p.getProperty("multiply_withlink");
				String name1 = p.getProperty("name77");
				String name2 = p.getProperty("name78");
				String name3 = p.getProperty("name79");
				String name4 = p.getProperty("name80");
				String num1 = p.getProperty("num81");
				String num2 = p.getProperty("num82");
				String num3 = p.getProperty("num83");
				String num4 = p.getProperty("num84");
				String multiply_Btn1 = p.getProperty("multiply_btn1");
				String name5 = p.getProperty("name81");
				String name6 = p.getProperty("name82");
				String name7 = p.getProperty("name83");
				String num5 = p.getProperty("num85");
				String num6 = p.getProperty("num86");
				String num7 = p.getProperty("num87");
				String multiply_Btn2 = p.getProperty("multiply_btn2");
				String clear_TheForm = p.getProperty("clear_theform");
				
                d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on multiply with link
				d.findElement(By.linkText(multiply_WithLink)).click();
				Thread.sleep(1000);
				
				// enter the data
				
				d.findElement(By.name(name1)).sendKeys(num1);
				Thread.sleep(1000);
				
				d.findElement(By.name(name2)).sendKeys(num2);
				Thread.sleep(1000);
				
				d.findElement(By.name(name3)).sendKeys(num3);
				Thread.sleep(1000);
				
				d.findElement(By.name(name4)).sendKeys(num4);
				Thread.sleep(1000);
				
				d.findElement(By.xpath(multiply_Btn1 )).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				d.findElement(By.xpath(clear_TheForm)).click();
				Thread.sleep(1000);
				
				d.findElement(By.name(name5)).sendKeys(num5);
				Thread.sleep(1000);
				
				d.findElement(By.name(name6)).sendKeys(num6);
				Thread.sleep(1000);
				
				d.findElement(By.name(name7)).sendKeys(num7);
				Thread.sleep(1000);
				
				d.findElement(By.xpath(multiply_Btn2 )).click();
				Thread.sleep(1000);
				
				d.navigate().back();

				d.findElement(By.xpath(clear_TheForm)).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath(multiply_Btn2 )).click();
				Thread.sleep(1000);

				
				 d.quit();
		} catch (Exception e) {
			System.out.println(e);		}
	}

}
