package com.training.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.InfoPage;
import com.training.page.PortalPage;

public class PortalPageTest extends BaseTest {

	
		PortalPage pp;
	
		
  @BeforeClass
	public void beforeClass(){
  
		 pp= new PortalPage(driver);
	  }	
  
		@Test
		  public void testSocialIcons(){
			  Assert.assertEquals(4,pp.SocialIcons());
		  }
		@Test
		 public void testIsLogoPresent(){
			 Assert.assertTrue(pp.isLogoPresent());
		}
		@Test
		 public void testNavItems(){
			 Assert.assertEquals(14,pp.navItems());
		}
		@Test
			public void testFooterBar(){
			 Assert.assertTrue(pp.isLogoPresent());
			}
		@Test
		public void testHomeClick(){
			
			Assert.assertNotNull(pp.homeClick());
		}
		@Test
		public void testInfoClick(){
			
			InfoPage ip = pp.infoClick();
			Assert.assertEquals(2,ip.getInfoCount());
		}
}
