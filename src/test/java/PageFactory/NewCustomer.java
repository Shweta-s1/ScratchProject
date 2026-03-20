package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonFunctions;

public class NewCustomer {
	
	WebDriver driver;
	public NewCustomer(WebDriver driver)
	{
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='New Customer']")
	WebElement NewCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement CustomerName;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DateofBirth;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement MobileNumber;
  
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement Submit;
	
	//@FindBy(xpath="//input[@name='res']")
	//WebElement Reset;
	
	@FindBy(xpath="//*[text()='Customer ID']")
	WebElement CustID;
	
	@FindBy(xpath="//*[text()='Customer ID']//following-sibling::td")
	WebElement CustIDval;
	
	public void clickNewCustomer() 
	{
		NewCustomer.click();
	}
	
	public void enterCustomerName(String customerName) 
	{
		CustomerName.sendKeys(customerName);
	}
	
	public void selectrGender() 
	{
		Gender.click();;
	}
	
	public void enterDateOfBirth(String dateofbirth) 
	{
		DateofBirth.sendKeys(dateofbirth);
	}
	
	public void enterAddress(String address) 
	{
		Address.sendKeys(address);
	}
	
	public void enterCity(String city) 
	{
		City.sendKeys(city);
	}
	
	public void enterState(String state) 
	{
		State.sendKeys(state);
	}
	
	public void enterPin(String pin) 
	{
		Pin.sendKeys(pin);
	}
	
	public void enterMobileNumber(String mobilenumber) 
	{
		MobileNumber.sendKeys(mobilenumber);
	}
	
	public void enterEmail ()
	{
		Email.sendKeys(CommonFunctions.generateRandomEmailID());
	}
	
	public void enterPassword(String password) 
	{
		Password.sendKeys(password);
	}
	
	public void clickSubmit() 
	{
		Submit.click();
	}

	/*public void clickReset() 
	{
		Reset.click();
	}*/
	
	public void validateCustIDGeneration()
	
	{
		boolean Flag =CustID.isDisplayed();
	    if (Flag == true) 
	    {
		System.out.println("Cust ID is generated");
	    }
	    
	    else 
	    { 
	    	throw new NullPointerException ("No cust ID generated");
        }
}
	
	public String getcustomerID()
	{
		String custIdval=CustIDval.getText();
	
		return custIdval;
	}
	}
