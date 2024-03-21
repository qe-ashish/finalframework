package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC03_DDT extends BaseClass {
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups= {"regression"})
	public void verify_DDT(String username,String password, String exp)
	
	{
		
		logger.info("***Starting Test03***");
		logger.debug("application logs started......");
		
		try {
			LoginPage lp = new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword_field(password);
			lp.clickLoginbutton();
			
			HomePage hp = new HomePage(driver);
			
			
			if(exp.equalsIgnoreCase("Valid")){
			if(hp.DisplayedHPicon()) {
				logger.info("TC_03_Tested-ok");
			}
			else {
				logger.info("TC_03_Failed");
				
			}}
			
			if(exp.equalsIgnoreCase("Invalid")) {
				if(hp.DisplayedHPicon()) {
					logger.error("TC_03_Failed");
					Assert.assertEquals(false, true);
					
				}
				else {
					logger.info("TC_03_Tested-ok");
					
				}
				
				
			}
			
			
		}
		
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}
		
		logger.debug("application logs end.......");
		logger.info("**** Finished Testing_03  *****");
		
	}




	}