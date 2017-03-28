package com.training.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.helper.ExcelHelper;
import com.training.page.HomePage;
import com.training.page.LoginPage;


public class LoginPageTest  extends BaseTest{
	
	
	LoginPage lp ;
	HomePage hm ;
	Logger logger = LogManager.getLogger("LoginPageTest.class");
	
	@BeforeClass
	
	public void before(){
		
		hm = new HomePage(driver);
		
		lp = hm.loginClick();
		
		
	}
	
	 @DataProvider(name="login")
	 
	   public Object[][] loginData(){
		 
		   Object [][] data = ExcelHelper.getData("\\login-testData.xlsx");
		   return data;
	 }
	   @Test(dataProvider="login")
	   
	   public void testLogin(String uname,String pwd) throws InterruptedException{
		 
		
		   logger.info("this is for loginPage test method");
		   
			Assert.assertNotNull(lp.login(uname,pwd));
	   }
	
	@Test
	
	public void testBreadCrumbs(){
		
		Assert.assertEquals(3,lp.breadCrumbs());
	}
	
	
	
}
