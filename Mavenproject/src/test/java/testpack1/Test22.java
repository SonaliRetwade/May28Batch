package testpack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test22 {
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
	@Test
	public void test1()
	{
		System.out.println("TestA");

	}
	@Test
	
	public void test2()
	{
		System.out.println("TestB");

	}
	@Test
	public void test3()
	{
		System.out.println("TestC");

	}
	@Test
	public void test4()
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
