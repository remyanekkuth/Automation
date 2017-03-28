package com.training.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.FAQPage;
import com.training.page.HomePage;

public class FAQPageTest extends BaseTest {
	
	HomePage hm ;
	FAQPage fp ;
	
	@BeforeClass
	
	public void before(){
	
		HomePage hm = new HomePage(driver);
		fp = hm.faqClick();
	}


	@Test
	
	public void testCountQues() throws InterruptedException, IOException{
		
		Assert.assertEquals(14, fp.countQues());
	}
	
	@Test
	
	public void testCountSocial(){
		
		Assert.assertEquals(4, fp.countSocial());
	}
	
}
