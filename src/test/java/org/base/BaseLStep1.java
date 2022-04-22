package org.base;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseLStep1 extends BaseClass {
	public BaseLStep1() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(name="q")
private WebElement search;

@FindBy(xpath="//h3[text()='Gmail - Google']")
private WebElement clickGmailFirstLink;

@FindBy(xpath="(//span[text()='Create an account'])[1]")
private WebElement clickCreateAccountButton;

public WebElement getSearch() {
	return search;
}

public void setSearch(WebElement search) {
	this.search = search;
}

public WebElement getClickGmailFirstLink() {
	return clickGmailFirstLink;
}

public void setClickGmailFirstLink(WebElement clickGmailFirstLink) {
	this.clickGmailFirstLink = clickGmailFirstLink;
}

public WebElement getClickCreateAccountButton() {
	return clickCreateAccountButton;
}

public void setClickCreateAccountButton(WebElement clickCreateAccountButton) {
	this.clickCreateAccountButton = clickCreateAccountButton;
}

}
