package testpack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testkeyword {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	@Test(priority = 3,invocationCount=2)
	public void testA()
	{
		System.out.println("TestA");

	}
	@Test(priority = 1,dependsOnMethods= {"testD","testC"})
	public void testB()
	{
		System.out.println("TestB");

	}
	@Test(priority = 5)
	public void testC()
	{
		System.out.println("TestC");

	}
	@Test(priority = 2)
	public void testD()
	{
		System.out.println("TestD");

	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("@After method");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("@After class");
	}

		
	}


