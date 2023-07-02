package com.general_math;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Choose_Math_Help_Item {
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
				String choose_MathHelpItem = p.getProperty("choose_mathhelp_item");
				String select_From_Dropdown = p.getProperty("select_from_dropdown");
				String name = p.getProperty("name97");
				String expression = p.getProperty("expression1");
				String compute_Btn = p.getProperty("compute_btn");
				String math_Problem = p.getProperty("math_problem");
                d.get(url);
				
				//click on general math
				d.findElement(By.linkText(generalMath)).click();
				Thread.sleep(1000);
				
				WebElement choose_item = d.findElement(By.xpath(choose_MathHelpItem));
				Thread.sleep(1000);
				//create a object of Select Class
				
				Select s = new Select(choose_item);
				Thread.sleep(1000);
				
				s.selectByVisibleText(select_From_Dropdown);
				Thread.sleep(1000);
				
				//enter the expression
				d.findElement(By.name(name)).sendKeys(expression);
				Thread.sleep(1000);
				
				//click on compute button
				d.findElement(By.xpath(compute_Btn)).click();
				Thread.sleep(1000);
				
				d.navigate().back();
				Thread.sleep(1000);
				
				d.navigate().back();
				Thread.sleep(1000);
				
				d.findElement(By.linkText(math_Problem)).click();
				Thread.sleep(1000);
				 d.quit();
		} catch (Exception e) {
			System.out.println(e);		}
	}
}
