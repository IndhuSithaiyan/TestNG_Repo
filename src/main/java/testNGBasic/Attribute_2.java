package testNGBasic;

import org.testng.annotations.Test;

public class Attribute_2 {

	@Test(priority = 1)
	public void signUp() {
		System.out.println("Amazon Page Steps:");
		System.out.println("SignUp");
	}
	@Test(dependsOnMethods = "signUp",priority = -1)	
	/*
	High prioritize for dependsOnMethod when comparing these two. 
	If this method is in other package or class, then we can use the below
	-->(dependsOnMethods = "packageName.className.methodName",priority = )
	*/
	public void login() {			
		System.out.println("Login");
	}
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("Search Product");
	}
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("Add to cart");
	}
	@Test(dependsOnMethods = "addToCart")
	public void order() {
		System.out.println("Order Placed!!");
	}
}
