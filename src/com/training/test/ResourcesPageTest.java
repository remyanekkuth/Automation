package com.training.test;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.HomePage;
import com.training.page.PortalPage;
import com.training.page.ResourcesPage;

public class ResourcesPageTest extends BaseTest{

	PortalPage pp;
	ResourcesPage rp;
	HomePage hm ;
	
	
	@BeforeClass
	
	public void before(){
		
		pp = new PortalPage(driver);
		hm = pp.homeClick();
		
		rp = hm.resourcesClick();
	}
	
	@Test
	
	public void testTitle(){
		
		Assert.assertEquals("QA/QE/SDET Training.",rp.getResourcesTitle());
	}
	
}
