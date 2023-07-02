package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reduce {
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
				String reduce = p.getProperty("reducelink");
				String reduceIt_Btn = p.getProperty("reduceit_btn");
				String name1 = p.getProperty("name10");
				String name2 = p.getProperty("name11");
				d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on reduce
				d.findElement(By.linkText(reduce)).click();
				Thread.sleep(1000);
				
				//click on reduce it
				d.findElement(By.xpath(reduceIt_Btn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				
				//clear the data
				d.findElement(By.name(name1)).clear();
				Thread.sleep(1000);
				
				//clear the data
				d.findElement(By.name(name2)).clear();
				Thread.sleep(1000);
				
				//click on reduce it
				d.findElement(By.xpath(reduceIt_Btn)).click();
				Thread.sleep(1000);
				
				 d.quit();
					} catch (Exception e) {
						System.out.println(e);					}
				}
}
