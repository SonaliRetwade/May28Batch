package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	
	//Declaration
		@FindBy(xpath="//input[@ type='text']")
		
		private WebElement useName;
		
		@FindBy(xpath="//input[@ type='password']")
		private WebElement  password;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement login;
		
		@FindBy(xpath="//a[text()='Create New Account']")
		private WebElement createnewaccount;
		
		@FindBy(xpath="//a[text()='Forgotten password?']")
		private WebElement fpassword;
		
		@FindBy(xpath="//a[text()='Sign Up']")
		private WebElement signuppageLink;
		
		
		public Signuppage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		//use
		public void openCreateacc()
		{
			
			signuppageLink.click();
		}
		
		public void signuppageFacebook()
		{
			useName.sendKeys("sonali");
			 password.sendKeys("34567");
			 login.click();
			 fpassword.click();
}
}
