package stepDefinition;


import org.openqa.selenium.WebDriver;



import PageFactory.FundTransfer;
import PageFactory.LoginPage;
import PageFactory.NewAccount;
import PageFactory.NewCustomer;
import PageFactory.logout;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitionLogin extends BaseClass
{

	
	WebDriver driver = BaseClass.initializeDriver();
    LoginPage obj = new LoginPage (driver);
    NewCustomer obj1 = new NewCustomer(driver);
    NewAccount obj2 = new  NewAccount(driver);
    logout obj5 = new logout(driver);
    FundTransfer obj6 = new FundTransfer(driver);
    
    
	@Given("User opens a home page of application")
	public void user_opens_a_home_page_of_application() 
	{
	    //getTitle();
	    String loginTitle = getTitle();
	    if(loginTitle.contains("Guru99 Bank Home Page"))
	    {
	    	System.out.println("User is on the Login page");
	    }
	    else
	    {
	    	throw new NullPointerException("Incorrect Page Opened");
	    }
	}

	@Given("User enters UserID as {string}")
	public void user_enters_user_id_as(String userID)
	{
	    obj.enterUserID(userID);
	}

	@Given("USer enters Password as {string}")
	public void u_ser_enters_password_as(String password) 
	{
	  obj.enterPassword(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() 
	{
	    obj.clickLogin();
	}

	@Then("User will navigated to home page")
	public void user_will_navigated_to_home_page() 
	{
	    String HomePageTitle = getTitle();
	
	    if(HomePageTitle.contains("Guru99 Bank Manager HomePage"))
	    {
	    	System.out.println("User is on the Home page");
	    }
	    else
	    {
	    	throw new NullPointerException("Incorrect Page Opened");
	    }
	}

	@Then("User clicks on NewCustomer")
	public void user_clicks_on_new_customer()
	{
		 obj1.clickNewCustomer();
	}

	@Then("User enters Customer Name as {string}")
	public void user_enters_customer_name_as(String customername) {
		 obj1.enterCustomerName(customername);
	}

	@Then("User selects Gender")
	public void user_selects_gender() {
		obj1.selectrGender();
	}

	@Then("User enters Date of Birth as {string}")
	public void user_selects_date_of_birth(String dateofbirth) {
	    obj1.enterDateOfBirth(dateofbirth);
	}

	@Then("User enters Address as {string}")
	public void user_enters_address_as(String address) {
	    obj1.enterAddress(address);
	}

	@Then("User enters City as {string}")
	public void user_enters_city_as(String city) {
	    obj1.enterCity(city);
	}

	@Then("User enters State as {string}")
	public void user_enters_state_as(String state) {
	    obj1.enterState(state);
	}

	@Then("User enters Pin as {string}")
	public void user_enters_pin_as(String pin) {
	    obj1.enterPin(pin);
	}

	@Then("User enters Mobile Number as {string}")
	public void user_enters_mobile_number_as(String mobilenumber) {
	    obj1.enterMobileNumber(mobilenumber);
	}

	@Then("User enters E-mail")
	public void user_enters_e_mail() {
		obj1.enterEmail();
	}

	@Then("User enters Password as {string}")
	public void user_enters_password_as(String password) {
	    obj1.enterPassword(password);
	}

	@When("User Clicks on submit button")
	public void user_clicks_on_submit_button() {
	    obj1.clickSubmit();
	}


	@Then("new customer is created")
	public void new_customer_is_created() {
	obj1.validateCustIDGeneration();	
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id()
	{
		String CustomerID1= obj1.getcustomerID();
	  
	  System.out.println("The CustomerID is generate  "+CustomerID1 );
	}



@Then("user clicks on New Account link")
public void user_clicks_on_new_account_link() {
   obj2.clickNewAccount();
}

@Then("user enters Customer id as {string}")
public void user_enters_customer_id_as(String customerID)
{
	obj2.enterCustomerID(customerID);
   
}

@Then("user selects the Account type as {string}")
public void user_selects_the_account_type_as(String accounttype)
{
  obj2.selectAccountType(accounttype);  
}

@Then("user enters the Initial deposit amount as {string}")
public void user_enters_the_initial_deposit_amount_as(String initialdeposit)
{
	obj2.entersInitialDeposit(initialdeposit);
   
}

@When("user clicks on the submit button")
public void user_clicks_on_the_submit_button() 
{
	obj2.clickOnSubmit();
    
}

@Then("new account successfully created")
public void new_account_successfully_created() 
{
 obj2.validateAccountIDGeneration();
}

@Then("user captures the Account number")
public void user_captures_the_account_number() {
	String AccountID = obj2.getaccounID();
	  System.out.println("The AccountID is generate  "+AccountID );
   
}



@Then("user clciks on Logout link")
public void user_clciks_on_logout_link() {
    obj5.clicklogout();
}

@Then("user should be logged out successfully")
public void user_should_be_logged_out_successfully() {
	
	System.out.println("Log out successfully");
}

@Then("user clicks on Fund transfer link")
public void user_clicks_on_fund_transfer_link()
{
	obj6.clickFundTransfer();
}
@Then("user enters Payers account no as {string}")
public void user_enters_payers_account_no_as(String PayersAccNo)
{
    obj6.enterPayersAccount(PayersAccNo);
}

@Then("user enters Payees account no as {string}")
public void user_enters_payees_account_no_as(String PayeesAccNo) 
{
    obj6.enterPayeeAccount(PayeesAccNo);
}

@Then("user enters Amount as {string}")
public void user_enters_amount_as(String Amount5) 
{
   obj6.eneterAmount(Amount5);    
}

@Then("user enters Description as {string}")
public void user_enters_description_as(String Des) 
{
	obj6.eneterDescription(Des);
    
}

@When("user clicks on Submit5 button")
public void user_clicks_on_submit5_button() 
{
   obj6.clickSubmit();
}

@Then("user navigate to fund transfer details page")
public void user_navigate_to_fund_transfer_details_page() 

	{
    	obj6.validateFundTransferDetailsPage();
    }  

}




