package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ptest {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas Sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
		
	 Psignclass  psignclass = new  Psignclass(driver);
	

	if( psignclass.checkReEmailIsDisplayed() == true)
	{
		System.out.println("popup is visible =" + "pass");
	}
	else
	{
		System.out.println("popup not visible" + "false");
	}
	System.out.println("=================================");
	

	boolean result1 = psignclass .customCheckBoxIsSelected();
	System.out.println(result1);

	if(result1 == true)
	{
		System.out.println("popup is visible =" + "pass");
	}
	else
	{
		System.out.println("popup not visible" + "false");
	}
	System.out.println("=================================");

	
	boolean result11 = psignclass.customCheckBoxIsSelected();
	System.out.println(result11);
	if(result11 == true)
	{
		System.out.println("custom not selected ="+"pass");
	}
	else
	{
		System.out.println("custom is selected =" + "fail");
	}
	System.out.println("==================================");
	
	
	boolean result2 =psignclass.pronounIsDisplayed();
	if(result2 == true) {
		System.out.println("pronoun is didplayed ="+"pass");
	}
	else {
		System.out.println("pronoun not didplayed ="+"fail");
	}
	System.out.println("==================================");
	
	
	}

}

