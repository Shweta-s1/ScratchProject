package PageFactory;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class logout {
	
	WebDriver driver;
	

	public logout(WebDriver driver)
	{
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log out")
	WebElement Logout;

	
	public void clicklogout() 
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  
		 WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Logout));
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
		  
		  js.executeScript("arguments[0].click();",element);
		  
		
		  Alert alert=driver.switchTo().alert();
		  alert.accept();
		  
		  
	}
	
}
