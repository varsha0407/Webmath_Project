package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Converting_Reduce {
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
				String convertingLink = p.getProperty("converting_link");
				String name1 = p.getProperty("name72");
				String name2 = p.getProperty("name73");
				String name3 = p.getProperty("name74");
				String name4 = p.getProperty("name75");
				String name5 = p.getProperty("name76");
				String num1 = p.getProperty("num76");
				String num2 = p.getProperty("num77");
				String num3 = p.getProperty("num78");
				String num4 = p.getProperty("num79");
				String num5 = p.getProperty("num80");
				String convert_ItBtn = p.getProperty("convert_itbtn");
				String clear_EntireForm = p.getProperty("clear_entireform1");

				d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				

				//click on converting link
				d.findElement(By.linkText(convertingLink)).click();
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
				
				d.findElement(By.name(name5)).sendKeys(num5);
				Thread.sleep(1000);
				
				//click on convert it button
				d.findElement(By.xpath(convert_ItBtn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//click on clear the entire form button
				d.findElement(By.xpath(clear_EntireForm)).click();
				Thread.sleep(1000);
				
				//click on convert it button
				d.findElement(By.xpath(convert_ItBtn)).click();
				
				 d.quit();
					} catch (Exception e) {
						System.out.println(e);					}
				}
}
