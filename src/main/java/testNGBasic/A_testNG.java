package testNGBasic;

import org.testng.annotations.Test;
/*
TestNG Sequential Execution
TestNG Parallel Run
TestNG Attributes(1) -- Priority
TestNG Attributes(2) -- DependsOnMethod
TestNG Attributes(3) -- Invocation Count & Invocation Time out
TestNG Attributes(4) -- always run, enable, description
TestNG Attributes(5) -- ThreadPoolSize, TimeOut & ExpectedException
TestNG Attributes(6) -- Groups
TestNG-Parameters
TestNG-Parameters in detail
TestNG- DataProvider-part1
TestNG- DataProvider-part2(Data provider class, indices)
TestNG- DataProvider-part3(Parallel, is name mandatory, Parameter & DP)
Test
*/
public class A_testNG {

	@Test
	public void get() {
		System.out.println("hey");
	}	
}
