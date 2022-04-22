package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\\\test\\\\resources\\\\failed.txt",glue="org.base_create_gmail_account")
public class TestReRunner {

}
