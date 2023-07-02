package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiply {
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
				String multiplyLink = p.getProperty("multiply_link");
				String name1 = p.getProperty("name42");
				String name2 = p.getProperty("name43");
				String name3 = p.getProperty("name44");
				String name4 = p.getProperty("name45");
				String name5 = p.getProperty("name46");
				String name6 = p.getProperty("name47");
				String name7 = p.getProperty("name48");
				String name8 = p.getProperty("name49");
				String name9 = p.getProperty("name50");
				String name10 = p.getProperty("name51");
				String name11 = p.getProperty("name52");
				String name12 = p.getProperty("name53");
				String name13 = p.getProperty("name54");
				String name14 = p.getProperty("name55");
				String name15 = p.getProperty("name56");
				String num1 = p.getProperty("num46");
				String num2 = p.getProperty("num47");
				String num3 = p.getProperty("num48");
				String num4 = p.getProperty("num49");
				String num5 = p.getProperty("num50");
				String num6 = p.getProperty("num51");
				String num7 = p.getProperty("num52");
				String num8 = p.getProperty("num53");
				String num9 = p.getProperty("num54");
				String num10 = p.getProperty("num55");
				String num11 = p.getProperty("num56");
				String num12 = p.getProperty("num57");
				String num13 = p.getProperty("num58");
				String num14 = p.getProperty("num59");
				String num15 = p.getProperty("num60");
				String multiply_Btn = p.getProperty("multiplybtn");
				String clearForm = p.getProperty("clear_entireform");
				
				d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				

				//click on multiply link
				d.findElement(By.linkText(multiplyLink)).click();
				Thread.sleep(1000);
				
				//enter the data
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
				
				d.findElement(By.name(name6)).sendKeys(num6);
				Thread.sleep(1000);
				
				d.findElement(By.name(name7)).sendKeys(num7);
				Thread.sleep(1000);
				
				d.findElement(By.name(name8)).sendKeys(num8);
				Thread.sleep(1000);
				
				d.findElement(By.name(name9)).sendKeys(num9);
				Thread.sleep(1000);
				
				d.findElement(By.name(name10)).sendKeys(num10);
				Thread.sleep(1000);
				
				d.findElement(By.name(name11)).sendKeys(num11);
				Thread.sleep(1000);
				
				d.findElement(By.name(name12)).sendKeys(num12);
				Thread.sleep(1000);
				
				d.findElement(By.name(name13)).sendKeys(num13);
				Thread.sleep(1000);
				
				d.findElement(By.name(name14)).sendKeys(num14);
				Thread.sleep(1000);
				
				d.findElement(By.name(name15)).sendKeys(num15);
				Thread.sleep(1000);
				
				//click on multiply button
				d.findElement(By.xpath(multiply_Btn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//clear the form
				d.findElement(By.xpath(clearForm)).click();
				Thread.sleep(1000);
				
				//click on multiply button
				d.findElement(By.xpath(multiply_Btn)).click();
				Thread.sleep(1000);
				
				 d.quit();
					} catch (Exception e) {
						System.out.println(e);					}
				}

}
