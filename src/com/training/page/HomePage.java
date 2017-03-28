package com.training.page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.helper.ByClass;

public class HomePage {

	

	WebDriver driver ;
	
	public HomePage(WebDriver driver){
		
		this.driver = driver ;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	}
	
	public int countSlides(){
		
		return driver.findElements(ByClass.getByObject("css-home-slides")).size();
	}
	
	
	public int videoElement(){
		
		return driver.findElements(By.cssSelector("css-home-video-elm")).size();
	}
	
	public boolean demosClick(){
		
		driver.findElement(ByClass.getByObject("xpath-home-democlick")).click();
		
		return driver.findElement(By.className("page-wrapper")).isDisplayed();
	}
	
	public LoginPage loginClick(){
		
		driver.findElement(ByClass.getByObject("xpath-homepage-loginclick")).click();
		
		return new LoginPage(driver);
	}
	
	public FAQPage faqClick(){
		
		driver.findElement((ByClass.getByObject("link-faq-faq"))).click();
		return new FAQPage(driver);
		
	}
	
	public ResourcesPage resourcesClick(){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-resources-element")));
		Actions action= new Actions(driver);
		action.clickAndHold(element).perform();
		WebElement subelement=wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-resources-subelement")));
		action.moveToElement(subelement).click().build().perform();
	
		return new ResourcesPage(driver);
	}
	}

