package com.training.base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.training.helper.ByClass;
import com.training.helper.WebUIHelper;

public  class BaseTest {

	protected WebDriver driver ;
	

	@BeforeSuite
	
	public void BeforSuite(){
	
	try {
		
		WebUIHelper.loadProperties("config.properties");
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 driver = WebUIHelper.getDriver();

	 driver.get(WebUIHelper.appUrl);
	 
	 ByClass.loadProperties();
		

	}
	@AfterSuite
	
	public void afterSuite(){
		
		driver.close();
	}
	
}
