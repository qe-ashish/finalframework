package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC02_Login extends BaseClass {
	
	@Test(groups= {"regression","sanity"})
	public void verify_TC02_Login() {
		
		logger.info("***Starting Test02***");
		logger.debug("application logs started......");
		
		try {
			LoginPage lp = new LoginPage(driver);
			lp.setUsername(p.getProperty("Username"));
			lp.setPassword_field(p.getProperty("Password"));
			lp.clickLoginbutton();
			
			HomePage hp = new HomePage(driver);
			
			if(hp.DisplayedHPicon()) {
				
				logger.info("TC_02_Tested-ok");
			}
			else {
				logger.info("TC_02_Failed");
				
			}
			
			
			
		}
		
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}
		
		logger.debug("application logs end.......");
		logger.info("**** Finished Testing_02  *****");
		
	}




	}
			
			
			
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	


