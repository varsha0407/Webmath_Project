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

public class Factor {

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
			String factor=p.getProperty("factor");
		    String factorInput1 = p.getProperty("factorinput1");
		    String num1 = p.getProperty("num1");
		    String factorIt = p.getProperty("factorit");
		    String prime_Dropdown = p.getProperty("prime_dropdown");
		    String select_Prime = p.getProperty("select_prime");
		    String num2 = p.getProperty("num2");
			
		    d.get(url);
			
			//click on general math
			d.findElement(By.linkText(generalMath)).click();
			Thread.sleep(1000);
			
			// click on factor
			d.findElement(By.linkText(factor)).click();
			Thread.sleep(1000);
			
			d.findElement(By.name(factorInput1)).sendKeys(num1);
			Thread.sleep(1000);
			
			// click on factor it
			d.findElement(By.xpath(factorIt)).click();
			Thread.sleep(1000);
			
			d.navigate().back();
		    // click on dropdown	
            WebElement show = d.findElement(By.xpath(prime_Dropdown));
			
		    Select s = new Select(show);
		   
		    // select prime from dropdown
			  s.selectByVisibleText(select_Prime);
			  Thread.sleep(1000);
			  
			//clear the data
			  d.findElement(By.name(factorInput1)).clear();
			  Thread.sleep(1000);
			  
			  // enter the inputs
			  d.findElement(By.name(factorInput1)).sendKeys(num2);
			  Thread.sleep(1000);
			  
			  // click on factorit
			  d.findElement(By.xpath(factorIt)).click();
			  Thread.sleep(1000);
			  
			  d.quit();
	} catch (Exception e) {
		System.out.println(e);	}
}
}
