package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']") 
	WebElement HomepageIcon;
	
	

	

	public boolean DisplayedHPicon()
	{
		return HomepageIcon.isDisplayed();
		
	}
}
