package testpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Loginpage;
import pages.Messengerpage;
import pages.Roomspage;




public class VerifyRoomPage {
	 private WebDriver driver;
	 private Roomspage roomspage;
	 private Loginpage  loginpage;
	private Messengerpage messengerpage;
	private SoftAssert soft;
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas Sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");

	}
	@BeforeMethod
	public void openRoomPage()
	{
		
		System.out.println("Before method");
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);

		
		 loginpage=new Loginpage(driver);
		 loginpage.openMessanger();
		 
		 
		  messengerpage =new Messengerpage (driver);
		 messengerpage.openRomms();
		 
		
		 
		 
		 roomspage  = new Roomspage(driver);
		// roomspage.contactToHelpCenter(); 
		// soft = new SoftAssert();
	}
	@Test
	public void verifyContactToHelpCenter()
	{
		System.out.println("test");
		 roomspage.contactToHelpCenter(); 
		 
		String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        
        if(url.equals("https://www.messenger.com/help")&& title.equals("messenger Help Centre"))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");

        }
        //soft.assertAll();
        
	}
	
	@Test
	public void goBackToMessenger ()
	{
			
			 System.out.println("test1");
			 roomspage.goBackToMessenger();
			 
			 String url = driver.getCurrentUrl();
	         String title = driver.getTitle();
	       
	       if(url.equals("https://www.messenger.com/")&& title.equals("Messenger"))
	       {
	       	System.out.println("pass");
	       }
	       else
	       {
	       	System.out.println("fail");
	
	       }	
			
	
	}
		@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("After method");
		System.out.println("LOGOUT");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("After class");
		//driver.close();
		driver.quit();
	}

}
