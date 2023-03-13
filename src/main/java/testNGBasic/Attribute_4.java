package testNGBasic;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Attribute_4 {
	
	@Test(description = "This is used to do the sign up")
	public void signup() {
		System.out.println("signUp");
		throw new NoSuchElementException("Element not there");
	}
	@Test(dependsOnMethods = "testNGBasic.Attribute_4.signup", alwaysRun = true)	//alwaysRun default value false
	public void login() {
		System.out.println("login");
	}
	@Test
	public void searchProduct() {
		System.out.println("search Product");
	}
}
