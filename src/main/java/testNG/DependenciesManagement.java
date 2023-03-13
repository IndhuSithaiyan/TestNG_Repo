package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	//problem:1 You have to Admit a student to engineering
	//problem:1 You have to Admit a student to Higher Secondary
	
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary school");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("college");
	}
}
