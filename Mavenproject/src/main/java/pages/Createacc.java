package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Createacc {
	
	//Declaration
		@FindBy(xpath="(//input[@type='text'])[1]")
		
		private WebElement useName;
		
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement  surname;
		
		@FindBy(xpath="(//input[@type='text'])[3]")
		private WebElement mobileno;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement newpassword;
		
		@FindBy(xpath="//select[@id='month']")
		private WebElement month;
		
		@FindBy(xpath="//select[@id='day']")
		private WebElement day;
		
		@FindBy(xpath="//select[@id='year']")
		private WebElement year;
		
		@FindBy(xpath="//select[@name='preferred_pronoun']")
		private WebElement custom;
		
		//initilization constructor call
		
		public Createacc(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
	
		}
		//use
		public void addmonth()
		{
			Select s=new Select(month);
			s.selectByIndex(3);
		}
		public void addday()
		{
			Select s1=new Select(day);
			s1.selectByValue("24");
		}
		public void addyear()
		{
			Select s2=new Select(year);
			s2.selectByValue("2018");
		}
		public void addusername()
		{
			useName.sendKeys("sarah");
			surname.sendKeys("choudhari");
			mobileno.sendKeys("234568971");
			custom.click();
		}
		public void pronoun() {
			
		boolean result = custom.isDisplayed();
		if(result==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		}
		
		
}
