package org.base_create_gmail_account;

import org.base.Base_Step2;
import org.baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Spep2 extends BaseClass{
	Base_Step2 s2;
	
@Given("The user should be in create your account page")
public void the_user_should_be_in_create_your_account_page() {
    System.out.println("___________________________create your gmail account____________________________");
}

@When("The user has to fill valid {string} {string} and {string}")
public void the_user_has_to_fill_valid_and(String firstName, String lastName, String userName) {
	 s2= new Base_Step2();
	 sendkeys(s2.getFirstName(), firstName);
	 sendkeys(s2.getLastName(), lastName);
	 sendkeys(s2.getUsername(), userName);
	 
}

@And("The user has to fill valid {string} and {string}")
public void the_user_has_to_fill_valid_and(String password, String confirnpassword) {
    sendkeys(s2.getPasswd(), password);
    sendkeys(s2.getConfirmPasswd(), confirnpassword);
}

@And("The user has to click show password")
public void the_user_has_to_click_show_password() {
    click(s2.getShowPasswordButton());
}

@Then("The user has to click next step")
public void the_user_has_to_click_next_step() {
    click(s2.getClickNext());
}


}
