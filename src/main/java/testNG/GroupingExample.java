package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/*
	Scenario: A big basket is having a different kind of mobiles.
	Let us say there are Apple phones, Moto, vivo and Lenovo
	I want to run tests only for vivo and moto phones, Write a program for that 
	*/
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}
	
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple testing");
	}
	
	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("moto testing");
	}
	
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("moto testing");
	}
	
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("vivo testing");
	}
	
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("vivo testing");
	}
	
	@Test(groups = {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo testing");
	}
	
	@Test(groups = {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo testing");
	}
}
