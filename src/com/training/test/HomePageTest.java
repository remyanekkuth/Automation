package com.training.test;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.FAQPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.page.PortalPage;
import com.training.page.ResourcesPage;

public class HomePageTest extends BaseTest {
	
	HomePage hm ;
	PortalPage pp;
	
	@BeforeClass
	
	public void before(){
		
	
		pp = new PortalPage(driver);
		hm = pp.homeClick();
		
		
	}

	@Test
	
	public void testVideoElement(){
		
		Assert.assertNotNull(hm.videoElement());
	}
	
	
	
	@Test
	
	public void testLoginClick(){
		
		LoginPage lp = hm.loginClick();
		
		Assert.assertEquals("QA/QE/SDET Training.",lp.getTitle());
	}
	@Test
	
	public void testFaqClick(){
		
		FAQPage fp = hm.faqClick();
		
		Assert.assertEquals("Frequently Asked Questions" , fp.getTitle());
	}
	
	@Test
	
	public void testDemoClick(){
		
		Assert.assertTrue(hm.demosClick());
	}
	
	@Test
	
	public void testResourcesClick(){
		
		ResourcesPage rp = hm.resourcesClick();
		Assert.assertNotNull(rp.getResourcesTitle());
	}
}
