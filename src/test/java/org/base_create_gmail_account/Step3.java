package org.base_create_gmail_account;

import java.awt.AWTException;

import org.base.Base_Step3;
import org.baseclass.BaseClass;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step3 extends BaseClass{
	Base_Step3 s3;

	@Given("The user should be in verifying your phone number page")
	public void the_user_should_be_in_verifying_your_phone_number_page() {
	System.out.println("verifying your phone number ");
	
	}

    @When("The user has to click and select country")
	public void the_user_has_to_click_and_select_country() throws AWTException, InterruptedException {
    	 s3=new Base_Step3();
         thread();
         click(s3.getCountry());
    	 sendkeys(s3.getCountry(), "india");
    	 thread();
    	 
    	 enter();
	}
    
	@And("The user should be enter phone number")
	public void the_user_should_be_enter_phone_number() {
		sendkeys(s3.getPhoneNumber(), "7598727011");
	}
	
	@Then("The user has to click next")
	public void the_user_has_to_click_next() throws InterruptedException {
		thread();
		Assert.assertTrue(false);
	   click(s3.getClickNext());
	}





}
