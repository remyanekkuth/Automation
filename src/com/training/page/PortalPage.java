package com.training.page;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.helper.ByClass;

public class PortalPage  {
	
	WebDriver driver ;

	public PortalPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public int SocialIcons(){	
		

	List<WebElement>elements = driver.findElements(ByClass.getByObject("css-portal-social"));
	
	return elements.size();
		
	}
	public boolean isLogoPresent(){
		
		return driver.findElement(ByClass.getByObject("id-portal-logo")).isDisplayed();
	}
	
	public int navItems(){
		return driver.findElements(ByClass.getByObject("css-portal-nav")).size();
	}
	
	public boolean footerBar(){
		return driver.findElement(ByClass.getByObject("id-portal-footer")).isDisplayed();
	}
	public HomePage homeClick(){
		
		driver.findElement(ByClass.getByObject("xpath-portal-home"));
		return new HomePage(driver);
	}
	public InfoPage infoClick(){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-info")));
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
		WebElement subelement = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-info-gallery")));
		action.moveToElement(subelement).click().build().perform();
		return new InfoPage(driver);
	}
	}