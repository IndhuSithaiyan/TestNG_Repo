package testNGBasic;

import org.testng.annotations.Test;

public class Attribute_Groups {

	@Test(groups = {"sanity","smoke"})
	public void signUp() {
		System.out.println("Amazon Page Steps:");
		System.out.println("SignUp");
	}
	@Test(groups = {"smoke"})
	public void login() {			
		System.out.println("Login");
	}
	@Test(groups = {"reg"})
	public void searchProduct() {
		System.out.println("Search Product");
	}
	@Test(groups = {"reg","sanity"})
	public void addToCart() {
		System.out.println("Add to cart");
	}
	@Test(groups = {"smoke"})
	public void order() {
		System.out.println("Order Placed!!");
	}
}
