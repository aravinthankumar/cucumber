package org.base_create_gmail_account;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before(order=1)
	public void beforeScenario1() {
		System.out.println("1");
	

	}
	@After(order=2)
	public void afterScenario2(Scenario sc) {

		System.out.println("\\\\\\\\\\\\\\\\\\   After    /////////////////////");
		if(sc.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(bt, "image/png");
		}
		
		
		System.out.println("after");
	}

}
