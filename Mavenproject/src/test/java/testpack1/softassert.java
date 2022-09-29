	package testpack1;
	
		import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
		import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
		import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
		import org.testng.asserts.SoftAssert;
	
		import pages.Loginpage;
		import pages.Messengerpage;
		import pages.Roomspage;
	import testpack2.Base;
	
	
	
	
		public class softassert extends Base{
			 private WebDriver driver;
			 private Roomspage roomspage;
			 private Loginpage  loginpage;
			private Messengerpage messengerpage;
			private SoftAssert soft;
			
			@Parameters("browser")
			@BeforeTest
		
			public void openBrowser(String browserName)
			{
				System.out.println("browserName");
				if(browserName.equals("Chrome"));
				{
					//System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas Sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
					  driver = openchromeBrowser();
				}
					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					//driver=openchromeBrowser();
				
				if(browserName.equals("Firefox"));
				{
					System.setProperty("webdriver.gecko.driver","C:\\Users\\Suhas Sonal\\Desktop\\Velocity Software Testing Class Notes\\Automation\\geckodriver.exe");
					  //driver = new FirefoxDriver();
					driver=openfirefoxBrowser();
				}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
				
			}
			
			
	
			@BeforeClass
			public void createPOMobjects()
			{ 
				loginpage=new Loginpage(driver);
			 messengerpage =new Messengerpage (driver);
				roomspage  = new Roomspage(driver);
			}
			
			
			@BeforeMethod
			public void openRoomPage()
			{
				
				//System.out.println("Before method");
				driver.get("https://www.facebook.com/");
				//Thread.sleep(3000);
	
				
				//loginpage=new Loginpage(driver);
				 loginpage.openMessanger();
				 
				 
				 // messengerpage =new Messengerpage (driver);
				 messengerpage.openRomms();
				 
				
				 
				 
				// roomspage  = new Roomspage(driver);
				// roomspage.contactToHelpCenter(); 
				 soft = new SoftAssert();
			}
			@Test
			public void verifyContactToHelpCenter()
			{
				System.out.println("test");
				 roomspage.contactToHelpCenter(); 
				 
				String url = driver.getCurrentUrl();
		        String title = driver.getTitle();
		        
		        soft.assertEquals(url,"https://www.messenger.com/hel","URL of Home is wrong");
		        soft.assertEquals( title,"Messenger Help Centre","title of Home page is wrong");
		       
		        soft.assertAll();
		        
			}
			
			//@Test
			//public void goBackToMessenger ()
			//{
					
					// System.out.println("test1");
					// roomspage.goBackToMessenger();
					 
					// String url = driver.getCurrentUrl();
			        // String title = driver.getTitle();
			         //soft.assertEquals(url,"https://www.messenger.com/");
				     //soft.assertEquals( title,"Messenger");
				       
				       // soft.assertAll();
	
					
			
		//	}
			
			
				@AfterMethod
			public void logoutFromApplication()
			{
				System.out.println("After method");
				System.out.println("LOGOUT");
			}
			
			@AfterClass
			public void clearobjects()
			{
				loginpage= null;
				roomspage=null;
				messengerpage=null;
				//driver.close();
				//driver.quit();
			}
			
			@AfterTest
			public void closeBrowser()
			{
				driver.close();
				driver = null;
				System.gc();
			}
			
		}
	
	
	
