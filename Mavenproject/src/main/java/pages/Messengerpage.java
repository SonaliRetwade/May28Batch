package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messengerpage {
	
	//Declaration
		@FindBy(xpath="//a[text()='Rooms']")
		private WebElement rooms;
		
		//initialization
		public Messengerpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//use
		public void openRomms()
		{
			
			rooms.click();
		}
		

}
