package testpack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openchromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas Sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 return driver;
	}
	public static WebDriver openfirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Suhas Sonal\\Desktop\\Velocity Software Testing Class Notes\\Automation\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 return driver;
	}
}