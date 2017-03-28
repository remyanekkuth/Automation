package com.training.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIHelper {

	static String browserName ;
	public static String appUrl;
	
	
	public static void loadProperties(String filename) throws FileNotFoundException, IOException{
		
		Properties prop = ConfigUtils.loadProperties(filename);
	
		//prop.load(new FileInputStream(System.getProperty("user.dir") + "\\resources\\"+filename)); --> moved to Constants Interface
		
		
		browserName = prop.getProperty("browser");
		
		// System.out.println(browserName);
		
		appUrl= prop.getProperty("appUrl");
	}
	public static WebDriver getDriver(){
		
		WebDriver driver = null ;
		
	//	System.out.println(browserName);
		
		switch(browserName.trim()){
		
		case "chrome" : 
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break ;
			
		case "firefox" :
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		break ;
		
		case "opera" :
			System.setProperty("webdriver.opera.driver",System.getProperty("user.dir") + "\\resources\\operadriver.exe");
			driver = new SafariDriver();
			
			break ;
		case "ie" :
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\resources\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
			break;
			
		case "htmlunit":
			
			driver = new HtmlUnitDriver();
			break ;
			
		default:
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
				
		}
		
		return driver;
		
		
	}
}
