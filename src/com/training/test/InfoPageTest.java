package com.training.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.InfoPage;
import com.training.page.PortalPage;



public class InfoPageTest extends BaseTest {
	
	PortalPage pp;
	InfoPage ip ;
	
	
	@BeforeClass
	
	public void before(){
		
		pp = new PortalPage(driver);
	
		ip = pp.infoClick();
	}
	
	@Test
	
	public void testCount(){
	
		Assert.assertEquals(2, ip.getInfoCount());
	}
}
