package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement Username;

	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement loginButton;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']") 
	WebElement FPlink;
	


	public void setUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public boolean Displayed_Username()
	{
		return Username.isDisplayed();
	}
	
	public void setPassword_field(String password)
	{
		Password.sendKeys(password);
	}

	
	public void clickLoginbutton() {
		loginButton.click();
		
	}

	public void clickLinkFP() {
		FPlink.click();
		
	}

	
	}
	
	
	
	
	
	
	

