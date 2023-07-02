package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Converting_Scientific_Notation {
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
				String convertingLink = p.getProperty("converting_link1");
				String name1 = p.getProperty("name94");
				String name2 = p.getProperty("name95");
				String name3 = p.getProperty("name96");
				String num1 = p.getProperty("num98");
				String num2 = p.getProperty("num99");
				String num3 = p.getProperty("num100");
				String convert1 = p.getProperty("convert1");
				String convert2 = p.getProperty("convert2");

				String clear_TheForm1 = p.getProperty("clear_theform2");
				String clear_TheForm2 = p.getProperty("clear_theform3");
				
                 d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on converting link
				d.findElement(By.xpath(convertingLink)).click();
				Thread.sleep(1000);
				
				// enter the data
				
				d.findElement(By.name(name1)).sendKeys(num1);
				Thread.sleep(1000);
				
				d.findElement(By.name(name2)).sendKeys(num2);
				Thread.sleep(1000);
				
				d.findElement(By.xpath(convert1)).click();
				
				d.navigate().back();
				
				d.findElement(By.xpath(clear_TheForm1)).click();
				
				d.findElement(By.name(name3)).sendKeys(num3);
				Thread.sleep(1000);
                
                d.findElement(By.xpath(convert2)).click();
                Thread.sleep(1000);
                
				d.navigate().back();
				
				d.findElement(By.xpath(clear_TheForm2)).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath(convert2)).click();
				Thread.sleep(1000);
				
				 d.quit();
		} catch (Exception e) {
			System.out.println(e);
		}
}

}
