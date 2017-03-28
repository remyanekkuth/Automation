package com.training.page;

import org.openqa.selenium.WebDriver;



public class ResourcesPage {

	WebDriver driver ;
	
	public ResourcesPage(WebDriver driver){
		
		this.driver = driver ;
		
		
	}
	
	public String getResourcesTitle(){
		
		return driver.getTitle();
	}
	/*public boolean resourcesClick(){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-resources-element")));
		Actions action= new Actions(driver);
		action.clickAndHold(element).perform();
		WebElement subelement=wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-resources-subelement")));
		action.moveToElement(subelement).click().build().perform();
	
	}
	*/
}
