package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Psignclass {
	private WebDriver driver;
	private Actions act;

	@FindBy (xpath= "//a[text()='Create New Account']") 
	private WebElement createNewAccn;
  
	@FindBy (xpath= "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath= "//input[@name='lastname']")
	private WebElement surName;
	
	@FindBy (xpath= "//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy (xpath= "(//input[@data-type='text'])[4]")
	private WebElement reEmailId;
	
	@FindBy (xpath= "(//input[@type='password'])[2]")
	private WebElement passWord;
	
	@FindBy (xpath= "//select[@id='day']")
	private WebElement day;
	
	@FindBy (xpath= "//select[@id='month']")
	private WebElement month;
	
	@FindBy (xpath= "//select[@id='  year']")
	private WebElement year;
	
	@FindBy (xpath= "(//input[@type='radio'])[3]")
	private WebElement customCheckBox;
	
	@FindBy (xpath= "(//input[@type='radio'])[3]")
	private WebElement pronoun;
	
	@FindBy (xpath= "//select[@name='preferred_pronoun']")
	private WebElement urPronoun;
	
	@FindBy (xpath= "//label[text()='Male']")
	private WebElement male;
	
	@FindBy (xpath= "(//button[text()='Sign Up'])[1]")
	private WebElement signUp;
	
	public Psignclass(WebDriver driver)
	{	
		PageFactory.initElements(driver, this);
		this.driver =driver;
		act = new Actions (driver);
	}
	
	public void clickCreateNewAccn(){
		act.moveToElement(createNewAccn);
		createNewAccn.click();
	}
	
	public void sendFirstName(){
		createNewAccn.sendKeys("Ram");
	}
	
	public void sendSurName(){
		surName.sendKeys("Kadam");
	}
	
	public void mobileNo(){
		surName.sendKeys("7028180814");
	}
	
	
	public void sendEmail(){
		email.sendKeys("ramyakadam02@gmail.com");
	}
	
	public boolean checkReEmailIsDisplayed(){
		return reEmailId.isDisplayed();
		
	}
	
	public void sendReEmail(){
		reEmailId.sendKeys("ramyakadam02@gmail.com");
	}
	
	public void sendPassword(){
		passWord.sendKeys("Ramya123#");;
	}
	
	public void selectByValueDay(){
		Select s = new Select (day);
		s.selectByValue("25");
	}

	public void selectByValueMonth(){
		Select m = new Select(month);
		m.selectByValue("12");
	}

	public void selectByValueYear(){
		Select y = new Select(year);
		y.selectByValue("1973");
	}
	
	public boolean customCheckBoxIsSelected(){
		boolean result1 = customCheckBox.isSelected();
		//System.out.println(result1);
		return result1;
	}
	
	public void clickCustomCheckBox(){
		customCheckBox.click();
	}
	
	public boolean customCheckBoxIsSelected1(){
		boolean result11 = customCheckBox.isSelected();
		System.out.println(result11);
		return result11;
	}

	public boolean pronounIsDisplayed(){
		boolean result2 = pronoun.isSelected();
		System.out.println(result2);
		return result2;
	}
	
	public void selectByValuetUrPronoun(){
		Select s=new Select(urPronoun);
		s.selectByValue("1");
	}
	
	public void clickMale(){
		male.click();
	}
		
	public void clickSignUp(){
        signUp.click();
	}
	
	
		
	

}
