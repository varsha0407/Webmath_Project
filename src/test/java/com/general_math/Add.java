package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add {
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
				String addLink = p.getProperty("add_link");
				String name1 = p.getProperty("name12");
				String name2 = p.getProperty("name13");
				String name3 = p.getProperty("name14");
				String name4 = p.getProperty("name15");
				String name5 = p.getProperty("name16");
				String name6 = p.getProperty("name17");
				String name7 = p.getProperty("name18");
				String name8 = p.getProperty("name19");
				String name9 = p.getProperty("name20");
				String name10 = p.getProperty("name21");
				String name11 = p.getProperty("name22");
				String name12 = p.getProperty("name23");
				String name13 = p.getProperty("name24");
				String name14 = p.getProperty("name25");
				String name15 = p.getProperty("name26");
				String num1 = p.getProperty("num16");
				String num2 = p.getProperty("num17");
				String num3 = p.getProperty("num18");
				String num4 = p.getProperty("num19");
				String num5 = p.getProperty("num20");
				String num6 = p.getProperty("num21");
				String num7 = p.getProperty("num22");
				String num8 = p.getProperty("num23");
				String num9 = p.getProperty("num24");
				String num10 = p.getProperty("num25");
				String num11 = p.getProperty("num26");
				String num12 = p.getProperty("num27");
				String num13 = p.getProperty("num28");
				String num14 = p.getProperty("num29");
				String num15 = p.getProperty("num30");
				String add_Btn = p.getProperty("add");
				String clearForm = p.getProperty("clear_form");
				
				d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on add link
				d.findElement(By.linkText(addLink)).click();
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
				
				//click on add button
				d.findElement(By.xpath(add_Btn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//clear the form
				d.findElement(By.xpath(clearForm)).click();
				Thread.sleep(1000);
				
				//click on add button
				d.findElement(By.xpath(add_Btn)).click();
				Thread.sleep(1000);
				
				 d.quit();
					}
		catch (Exception e) {
			System.out.println(e);
}
				}
}
