package org.base_create_gmail_account;

import org.base.BaseLStep1;
import org.baseclass.BaseClass;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step1 extends BaseClass{
	BaseLStep1 s1;
	@Given("The user should be in google page")
	public void the_user_should_be_in_google_page() {
	    chromeLounch();
	    urlLounch("https://www.google.com/");
	    implicitwait();
	}

	@When("The user has to click searchbar and enter gmail")
	public void the_user_has_to_click_searchbar_and_enter_gmail() {
		 s1= new BaseLStep1();
		 sendkeysValue(s1.getSearch(), "gmail", Keys.ENTER);
		
		
	}

	@And("The user has to click gmail first link")
	public void the_user_has_to_click_gmail_first_link() {
	    click(s1.getClickGmailFirstLink());
	}

	@Then("The user has to click create an account button")
	public void the_user_has_to_click_create_an_account_button() {
	   click(s1.getClickCreateAccountButton());
	}




	
	

}
