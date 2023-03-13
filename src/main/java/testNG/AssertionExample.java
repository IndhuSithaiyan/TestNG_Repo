package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	String name="Agni";
	
	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "agni");
	}
	
}
