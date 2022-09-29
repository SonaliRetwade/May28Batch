package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roomspage {
	
	//Declaration
			@FindBy(xpath="//a[text()=' Return to messenger.com ']")
			private WebElement returnToMessage;
			
			
			@FindBy(xpath="//a[text()=' Visit our help center ']")
			private WebElement helpCenter;
			
			
			//initialization
			public Roomspage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//use
			
			public void goBackToMessenger()
			{
				
				returnToMessage.click();
			}
			
			public void contactToHelpCenter()
			{
				
				helpCenter.click();
			}
			

}
