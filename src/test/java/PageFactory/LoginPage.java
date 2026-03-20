package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement UserID;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement login_btn;
	
	/*@FindBy(xpath="//input[@name='btnReset']")
	WebElement reset_btn;*/
	
	
	public void enterUserID(String userID) 
	{
	UserID.sendKeys(userID);
	}
	
	public void enterPassword(String password) 
	{
	Password.sendKeys(password);
	}
	
	public void clickLogin() 
	{
		login_btn.click();
	}
	
	/*public void clickReset() 
	{
		reset_btn.click();
	}*/

		
	}
	
