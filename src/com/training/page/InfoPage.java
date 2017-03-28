package com.training.page;

import org.openqa.selenium.WebDriver;

import com.training.helper.ByClass;

public class InfoPage {

	WebDriver driver ;
	
	public InfoPage(WebDriver driver){
		
		this.driver = driver ;
		
		
	}
	
	public int  getInfoCount(){
		
		return driver.findElements(ByClass.getByObject("xpath-info-count")).size();
	}
}
