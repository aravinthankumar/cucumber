package org.base;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Step3 extends BaseClass {
	public Base_Step3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@role='combobox']")
	private WebElement country;
	
	@FindBy(xpath="(//input[@type='tel'])")
	private WebElement phoneNumber;
	
	@FindBy(xpath="(//span[@jsname='V67aGc'])[2]")
	private WebElement clickNext;
	
	
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(WebElement phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public WebElement getClickNext() {
		return clickNext;
	}
	public void setClickNext(WebElement clickNext) {
		this.clickNext = clickNext;
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}}


