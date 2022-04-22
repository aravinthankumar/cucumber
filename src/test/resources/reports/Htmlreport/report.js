$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/1stepGmail.feature");
formatter.feature({
  "name": "To validate the create account functionality gmail application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@step1"
    }
  ]
});
formatter.scenario({
  "name": "To validate the create account functionality of gmail step1 application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@step1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in google page",
  "keyword": "Given "
});
formatter.match({
  "location": "step1.the_user_should_be_in_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click searchbar and enter gmail",
  "keyword": "When "
});
formatter.match({
  "location": "step1.the_user_has_to_click_searchbar_and_enter_gmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click gmail first link",
  "keyword": "And "
});
formatter.match({
  "location": "step1.the_user_has_to_click_gmail_first_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click create an account button",
  "keyword": "Then "
});
formatter.match({
  "location": "step1.the_user_has_to_click_create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/2stepCreateYourAccount.feature");
formatter.feature({
  "name": "To validate the create your account functionality gmail application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Step2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the create your account functionality of gmail step2 application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be in create your account page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user has to fill valid \"\u003cfirstname\u003e\" \"\u003clastname\u003e\" and \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to fill valid \"\u003cpassword\u003e\" and \"\u003cconfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user has to click show password",
  "keyword": "And "
});
formatter.step({
  "name": "The user has to click next step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password",
        "confirmpassword"
      ]
    },
    {
      "cells": [
        "aravinthan",
        "arumachalam",
        "aravind25th",
        "Aravinth789654",
        "Aravinth789654"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the create your account functionality of gmail step2 application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Step2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in create your account page",
  "keyword": "Given "
});
formatter.match({
  "location": "Spep2.the_user_should_be_in_create_your_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill valid \"aravinthan\" \"arumachalam\" and \"aravind25th\"",
  "keyword": "When "
});
formatter.match({
  "location": "Spep2.the_user_has_to_fill_valid_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill valid \"Aravinth789654\" and \"Aravinth789654\"",
  "keyword": "And "
});
formatter.match({
  "location": "Spep2.the_user_has_to_fill_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click show password",
  "keyword": "And "
});
formatter.match({
  "location": "Spep2.the_user_has_to_click_show_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click next step",
  "keyword": "Then "
});
formatter.match({
  "location": "Spep2.the_user_has_to_click_next_step()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/3stepVerificationPhoneNumber.feature");
formatter.feature({
  "name": "To validate the verifying your phone number functionality of gmail application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@step3"
    }
  ]
});
formatter.scenario({
  "name": "To Validate the verifying your phone number functionality of step3 application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@step3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in verifying your phone number page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step3.the_user_should_be_in_verifying_your_phone_number_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click and select country",
  "keyword": "When "
});
formatter.match({
  "location": "Step3.the_user_has_to_click_and_select_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be enter phone number",
  "keyword": "And "
});
formatter.match({
  "location": "Step3.the_user_should_be_enter_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click next",
  "keyword": "Then "
});
formatter.match({
  "location": "Step3.the_user_has_to_click_next()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.base_create_gmail_account.Step3.the_user_has_to_click_next(Step3.java:42)\r\n\tat ✽.The user has to click next(file:src/test/resources/Features/3stepVerificationPhoneNumber.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});