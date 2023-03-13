package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("start the car");
	}
	//Ignore a test case, enable is always true in default
	@Test(priority = 4, enabled = false)
	public void turnTheMusicON() {
		System.out.println("Music turned on");
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
