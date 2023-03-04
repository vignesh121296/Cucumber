package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends Baseclass{

	
		@Before
		public void beforeScenario() {
			//Browser Launching, maximize windows,Implicit wait

		}
		
		@After
		public void afterScenario(Scenario scenaio) {
			
			if (scenaio.isFailed()==true) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
				scenaio.attach(screenshotAs, "png", "Failed Scenarios");
				
			}
			
		}
}
