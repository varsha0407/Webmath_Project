package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Divide_With {
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
				String divide_WithLink = p.getProperty("divide_withlink");
				String name1 = p.getProperty("name84");
				String name2 = p.getProperty("name85");
				String name3 = p.getProperty("name86");
				String name4 = p.getProperty("name87");
				String num1 = p.getProperty("num88");
				String num2 = p.getProperty("num89");
				String num3 = p.getProperty("num90");
				String num4 = p.getProperty("num91");
				String divide_Btn1 = p.getProperty("divide_btn1");
				String name5 = p.getProperty("name88");
				String name6 = p.getProperty("name89");
				String name7 = p.getProperty("name90");
				String num5 = p.getProperty("num92");
				String num6 = p.getProperty("num93");
				String num7 = p.getProperty("num94");
				String divide_Btn2 = p.getProperty("divide_btn2");
				String name8 = p.getProperty("name91");
				String name9 = p.getProperty("name92");
				String name10 = p.getProperty("name93");
				String num8 = p.getProperty("num95");
				String num9 = p.getProperty("num96");
				String num10 = p.getProperty("num97");
				String divide_Btn3 = p.getProperty("divide_btn2");
				String clear_TheForm = p.getProperty("clear_the_form");
				
                d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				//click on multiply with link
				d.findElement(By.linkText(divide_WithLink)).click();
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
				
				d.findElement(By.xpath(divide_Btn1 )).click();
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
				
				d.findElement(By.xpath(divide_Btn2 )).click();
				Thread.sleep(1000);
				
				d.navigate().back();

				d.findElement(By.xpath(clear_TheForm)).click();
				Thread.sleep(1000);
				
				d.findElement(By.name(name8)).sendKeys(num8);
				Thread.sleep(1000);
				
				d.findElement(By.name(name9)).sendKeys(num9);
				Thread.sleep(1000);
				
				d.findElement(By.name(name10)).sendKeys(num10);
				Thread.sleep(1000);
				
				
				d.findElement(By.xpath(divide_Btn3 )).click();
				Thread.sleep(1000);

				d.navigate().back();

				d.findElement(By.xpath(clear_TheForm)).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath(divide_Btn3 )).click();
				Thread.sleep(1000);
				
				 d.quit();
		} catch (Exception e) {
			System.out.println(e);		}
}

}
