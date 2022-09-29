package testpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Createacc;
import pages.Signuppage;

public class Testsign {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas Sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		
		 Signuppage signuppage =new Signuppage(driver);
		 signuppage.openCreateacc();
		// System.out.println(driver.getCurrentUrl());
		 Createacc createacc = new Createacc(driver);
		 createacc.addday();
		 createacc.addmonth();
		 createacc.addyear();
		 createacc.addusername();
		 createacc.pronoun();
		 System.out.println(driver.getCurrentUrl());
	}

}
