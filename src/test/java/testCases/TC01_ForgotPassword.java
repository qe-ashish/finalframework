package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC01_ForgotPassword extends BaseClass {
	
	
	@Test(groups= {"regression"})
	public void verify_TC01_ForgotPassword() {
		
		logger.info("***Starting Test01***");
		logger.debug("application logs started......");
		
		try {
			
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("Admin");
			lp.setPassword_field("admin123");
			lp.clickLinkFP();
			if(lp.Displayed_Username()) {
				logger.info("TC_01_Tested-ok");
			}
			else {
				logger.info("TC_01_Failed");
				
			}
		
	}
	catch(Exception e)
	{
		logger.error("test failed..");
		logger.debug("debug logs....");
		Assert.fail();
	}
	
	logger.debug("application logs end.......");
	logger.info("**** Finished Testing_01 *****");
	
}




}
		
		
		
		
	

