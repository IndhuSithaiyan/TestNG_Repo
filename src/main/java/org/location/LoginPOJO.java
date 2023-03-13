package org.location;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass{

	public LoginPOJO() {
		PageFactory.initElements(driver, this);    //this -> representing the current class | driver -> webdriver reference Name
	}

	@CacheLookup
	@FindBy(id="email")
	private WebElement txtEmail;

	@CacheLookup
	@FindBy(name="pass")
	private WebElement txtPass;

	@FindBy(xpath="//button[@name='login']")
	private List<WebElement> btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public List<WebElement> getBtnLogin(){
		return btnLogin;
	}
}

