package testNGBasic;


import org.testng.annotations.Test;

public class Attribute_1 {

	// -1 --> Like Graph -5,-4,-3,-2,-1,0,1,2,3,4,5
	@Test(priority = -1)
	public void signUp() {
		System.out.println("Amazon Page Steps:");
		System.out.println("SignUp");
	}
	@Test()    //empty-> 0 
	public void login() {
		System.out.println("Login");
	}
	@Test()   //empty-> 0 Then it's priortize as ASCII
	public void searchProduct() {
		System.out.println("Search Product");
	}
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("Add to cart");
	}
	@Test(priority = -5)
	public void order() {
		System.out.println("Order Placed!!");
	}
}
