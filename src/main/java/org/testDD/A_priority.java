package org.testDD;

import org.testng.annotations.Test;

public class A_priority {

	@Test(priority=-33)
	private void tc1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=-2)
	private void tc2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=0)
	private void tc3() {
		System.out.println("Test 3");
	}
	
	@Test(invocationCount=3)
	private void tc6() {
		System.out.println("Test 6");
	}
	
	@Test
	private void tc5() {
		System.out.println("Test 5");
	}
	
	@Test(priority=9, enabled=false)
	private void tc4() {
		System.out.println("Test 4");
	}
}
