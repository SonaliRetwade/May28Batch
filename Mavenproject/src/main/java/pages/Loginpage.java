package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.apache.commons.collections4.Predicate;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	private WebDriver driver;
	private Actions act;
	

	

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
	
	@FindBy(xpath="//a[text()='Messenger']")
	private WebElement messengerLink;
	
	//initilization constructor call
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
		//act = new Actions(driver);
	}

	//use
	
	//public void clickoncreatenewacc()
	//{
		//Actions act = new Actions(driver);
		//act.moveToElement(createnewaccount).click().build().perform();
	//}
	
	
	public void openMessanger()
	{
		
		messengerLink.click();
	}
	//or
	public void loginFacebook()
	{
		useName.sendKeys("sonali");
		 password.sendKeys("34567");
		 login.click();
		 fpassword.click();
		// createnewaccount.click();

	}
	

}
