package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass;
import com.pom.PageObjectModel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebooklogin extends Baseclass {
	
	@Given("User in on the Facebook login page")
	public void user_in_on_the_facebook_login_page() {
		getdriver();
		enterurl("https://www.facebook.com/login/");
		maximize();
		
	}
	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		try {
		PageObjectModel pom = new PageObjectModel();
		WebElement username = pom.getUsername();
		sendkey(username, string);
		WebElement password = pom.getPassword();
		sendkey(password, string2);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@And("User should click login button")
	public void user_should_click_login_button() {
		PageObjectModel pom = new PageObjectModel();
		WebElement login = pom.getLogin();
		click(login);
		
	}
	@Then("User should verify login error message {string}")
	public void user_should_verify_login_error_message(String string) {
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),\"password\")]"));
		String text = element.getText();
		junit.framework.Assert.assertEquals(string, text);
		
	}
	
	@Then("User should verify success message {string}")
	public void user_should_verify_success_message(String string) {
		try {
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),\"password\")]"));
		String text = element.getText();
		junit.framework.Assert.assertEquals(string, text);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
