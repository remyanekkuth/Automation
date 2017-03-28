package com.training.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.helper.ByClass;


public class LoginPage {
	
	WebDriver driver ;

	public LoginPage(WebDriver driver) {
		this.driver = driver ;
	}

	public String login(String uname , String pwd){
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("id-login-user")));
		element.sendKeys(uname);
		driver.findElement(ByClass.getByObject("id-login-password")).sendKeys(pwd);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(ByClass.getByObject("id-login-login")));
		return driver.getTitle();
	
		
		
	}
	public String getTitle(){
		
		return driver.getTitle();
	}
	
	public int breadCrumbs(){
		
		List<WebElement> elm = driver.findElements(ByClass.getByObject("css-login-crumbs"));
		return elm.size();
		
	}
	public boolean forgotPwd(){
	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ByClass.getByObject("css-login-forgot"))).click();
		
		return driver.findElement(By.xpath("xpath-forgot-contact")).isDisplayed();
		
	}
	
	
}
