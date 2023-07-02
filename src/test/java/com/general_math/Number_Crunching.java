package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Number_Crunching {

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
					String numberCrunching_Link = p.getProperty("numbercrunching_link");
					String with_Variables_Too_Link = p.getProperty("with_variables_too_link");
					String num1 = p.getProperty("num11");
					String num2 = p.getProperty("num12");
					String num3 = p.getProperty("num13");
					String num4 = p.getProperty("num14");
					String num5 = p.getProperty("num15");
					String name4 = p.getProperty("name4");
					String name5 = p.getProperty("name5");
					String name6 = p.getProperty("name6");
					String name7 = p.getProperty("name7");
					String name8 = p.getProperty("name8");
                    String name9 = p.getProperty("name9");
                    String expression = p.getProperty("expression");
                    String numberCrunchBtn = p.getProperty("numbercrunchBtn");
                    String id = p.getProperty("id");
                    String perform_The_Final_Evaluation = p.getProperty("perform_the_final_evaluation");
					
					d.get(url);
					
					//click on general math
					d.findElement(By.linkText(generalMath)).click();
					Thread.sleep(1000);
					
					//click on number variable link
					d.findElement(By.linkText(numberCrunching_Link)).click();
					Thread.sleep(1000);
					
					d.navigate().back();
					
					//click on with variables too link
					d.findElement(By.linkText(with_Variables_Too_Link)).click();
					Thread.sleep(1000);
					
					//enter the data in the variables
					d.findElement(By.name(name4)).sendKeys(num1);
					Thread.sleep(1000);
					
					d.findElement(By.name(name5)).sendKeys(num2);
					Thread.sleep(1000);
					
					d.findElement(By.name(name6)).sendKeys(num3);
					Thread.sleep(1000);
					
					d.findElement(By.name(name7)).sendKeys(num4);
					Thread.sleep(1000);
					
					d.findElement(By.name(name8)).sendKeys(num5);
					Thread.sleep(1000);
					
					// enter the expression
					d.findElement(By.name(name9)).sendKeys(expression);
					Thread.sleep(1000);
					
					
					// click on number crunch button
					d.findElement(By.xpath(numberCrunchBtn)).click();
					Thread.sleep(1000);
					
					d.switchTo().frame(id);
					Thread.sleep(1000);
					
				 d.findElement(By.linkText(perform_The_Final_Evaluation)).click();
				 Thread.sleep(1000);
					
					 d.quit();
			} catch (Exception e) {
				System.out.println(e);				
			}
		}
	}


