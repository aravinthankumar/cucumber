package org.base;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Step2 extends BaseClass {
	public Base_Step2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="Username")
	private WebElement Username;
	
	@FindBy(name="Passwd")
	private WebElement Passwd;
	
	@FindBy(name="ConfirmPasswd")
	private WebElement ConfirmPasswd;
	
	@FindBy(id="i3")
	private WebElement showPasswordButton;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement clickNext;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPasswd() {
		return Passwd;
	}

	public void setPasswd(WebElement passwd) {
		Passwd = passwd;
	}

	public WebElement getConfirmPasswd() {
		return ConfirmPasswd;
	}

	public void setConfirmPasswd(WebElement confirmPasswd) {
		ConfirmPasswd = confirmPasswd;
	}

	public WebElement getShowPasswordButton() {
		return showPasswordButton;
	}

	public void setShowPasswordButton(WebElement showPasswordButton) {
		this.showPasswordButton = showPasswordButton;
	}

	public WebElement getClickNext() {
		return clickNext;
	}

	public void setClickNext(WebElement clickNext) {
		this.clickNext = clickNext;
	}
	
	
	
	

}
