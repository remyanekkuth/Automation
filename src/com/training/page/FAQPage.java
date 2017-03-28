package com.training.page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.training.helper.ByClass;

public class FAQPage {

	WebDriver driver ;
	
	public FAQPage(WebDriver driver){
		
		this.driver = driver ;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	}
	
	
	public String getTitle(){
		
	return driver.findElement(ByClass.getByObject("css-faq-title")).getText();
	
	
	}
	
	
	
	public int countQues() throws InterruptedException,IOException{
		
		try{
		
			driver.findElements(ByClass.getByObject("css-faq-ques"));
		
		}catch (Exception e){
		
			File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File("C:\\screen\\screen.png")); 

		}
		return driver.findElements(ByClass.getByObject("css-faq-ques")).size();
		
	}
	
	
	public int countSocial(){
		
		return driver.findElements(ByClass.getByObject("css-faq-social")).size();	
	}
}
