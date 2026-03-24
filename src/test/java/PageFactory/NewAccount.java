package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NewAccount {
	
	WebDriver driver;
	public NewAccount(WebDriver driver)
	{
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='New Account']")
	WebElement NewAccount;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement CustomerID;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement Accounttype;
	
	@FindBy(name="inideposit")
	WebElement Initdeposit;
	
	@FindBy(xpath="//input[@name='button2']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//*[text()='Account ID']")
    WebElement AccountID;
	
	@FindBy(xpath="//*[text()='Account ID']//following-sibling::td")
	WebElement AccountIDval;
    
	public void clickNewAccount() 
	{
		NewAccount.click();
	}
	
	public void enterCustomerID (String customerID)
	{
		CustomerID.sendKeys(customerID);
	}
	
	public void selectAccountType(String accounttype) 
	{
		Accounttype.sendKeys(accounttype);
	}


	public void entersInitialDeposit(String initdeposit) 
	{
		Initdeposit.sendKeys(initdeposit);
		
	}
	
	public void clickOnSubmit() 
	{
		SubmitButton.click();
	}	
	
public void validateAccountIDGeneration()
	
	{
	boolean Flag =AccountID.isDisplayed();
	    if (Flag == true) 
	    {
		System.out.println("Account ID is generated");
	    }
	    
	    else 
	    { 
	    	throw new NullPointerException ("No Account ID generated");
        }
}
	
	public String getaccounID()
	{
		String accountIDval= AccountIDval.getText();
	
		return accountIDval;
	}

}

