package testNG;

import org.testng.annotations.Test;

public class DriverACar {
	
	//priority - Keyword 
	//@Test - Annotations -- priority attribute using as argument
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("start the car");
	}
	@Test(priority = 1)
	public void putTheSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority = 2)
	public void putTheThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority = 3)
	public void putTheFourGear() {
		System.out.println("Four Gear");
	}
}
