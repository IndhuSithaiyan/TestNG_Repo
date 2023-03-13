package org.testDD;

import org.base.BaseClass;
import org.location.LoginPOJO;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Greens extends BaseClass{

	@Test
	private void tc1() {
		String url = pageUrl();
		System.out.println(url);
	}
	
	@Test
	private void tc2() {
		LoginPOJO l = new LoginPOJO();
		
		fillTextBox(l.getTxtEmail(), "induuuu");
		fillTextBox(l.getTxtPass(), "123123");
		btnClick(l.getBtnLogin().get(0));
	}
	
	@Test
	private void tc3() {
		String t = pageTitle();
		System.out.println(t);
	}
	
	@BeforeMethod
	private void befMethod() {
		getDateAndTime();
	}
	
	@AfterMethod
	private void AfMethod() {
		getDateAndTime();
	}
	
	@BeforeClass
	private void befCls() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
	}
	
	@AfterClass
	private void AfCls() {
		closeBrowser();
	}
	
}
