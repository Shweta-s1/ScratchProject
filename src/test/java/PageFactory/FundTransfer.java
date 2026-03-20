package PageFactory;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FundTransfer 
{
		WebDriver driver;
		public FundTransfer(WebDriver driver)
		{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[text()='Fund Transfer']")

		WebElement Fund_Transfer ;
		
		@FindBy(xpath="//input[@name='payersaccount']")
		WebElement PayersAcc;
		
		@FindBy(xpath="//input[@name='payeeaccount']")
		WebElement PayeeAcc;
		
		@FindBy(xpath="//input[@name='ammount']")
		WebElement Amount;
		
		@FindBy(xpath="//input[@name='desc']")
		WebElement Des;
		
		@FindBy(xpath="//input[@name='AccSubmit']")
		WebElement Submit5;
		
		@FindBy(xpath="//p[text()='Fund Transfer Details']")
		WebElement Fund_Trans_Page;
		
	
		
		
		public void clickFundTransfer() 
		{
			  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			  
				 WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Fund_Transfer));
				 JavascriptExecutor js= (JavascriptExecutor)driver;
				 
				 js.executeScript("arguments[0].scrollIntoView(true);",element);
				  
				  js.executeScript("arguments[0].click();",element);
		}
		
		public void enterPayersAccount(String payersacc )
		{
			PayersAcc.sendKeys(payersacc);
		}
		
		public void enterPayeeAccount(String payeesacc)
		{
			PayeeAcc.sendKeys(payeesacc);
		}
		
		public void eneterAmount(String amount5)
		{
			Amount.sendKeys(amount5);
		}
		
		public void eneterDescription(String des) 
		{
			Des.sendKeys(des);
		}

		public void clickSubmit()
		{
			Submit5.click();
		}
		
		 public void validateFundTransferDetailsPage()
		 {
			boolean flag=Fund_Trans_Page.isDisplayed();
			
			if(flag==true)
		 {
				System.out.println("Fund Transfer Details is Dispalyed");
		 }
			else
			{
				throw new NullPointerException("Fund Transfer Details is not Dispalyed");
			}
			
		 }
			
			
}

