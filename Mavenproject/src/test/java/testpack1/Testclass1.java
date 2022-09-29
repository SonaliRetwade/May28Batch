package testpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Loginpage;
import pages.Messengerpage;
import pages.Roomspage;

public class Testclass1 {
public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas Sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);

	
	 Loginpage  loginpage=new Loginpage(driver);
	 loginpage.openMessanger();
	 
	 
	 Messengerpage messengerpage =new Messengerpage (driver);
	 messengerpage.openRomms();
	 
	
	 
	 
	 Roomspage roomspage = new Roomspage(driver);
			 roomspage.contactToHelpCenter(); 
			 //roomspage.goBackToMessenger();
	 
	 System.out.println(driver.getCurrentUrl());
	 
	 
	 
}
}
