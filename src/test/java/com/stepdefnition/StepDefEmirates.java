package com.stepdefnition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Base;
import com.pageobjectmodel.PageObjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefEmirates extends Base  {
	PageObjectModel sp;
	@Given("I am on emirates page")
	public void i_am_on_emirates_page() {
		getDriver();
		sp=PageFactory.initElements(driver, PageObjectModel.class);
		sp.getCookie();
		//sp.getLogin();
		//sp.getUsername();
		//sp.getPassword();
	    
	}

	@When("I enter user name and password")
	public void i_enter_user_name_and_password() {
		
	    
	}

	@When("I click login")
	public void i_click_login() {
		//sp.getLoggedin();
	}

	    

	@When("I successfully logged in")
	public void i_successfully_logged_in() {
	    
	}

	@When("i enter from and to along with my travelling date")
	public void i_enter_from_and_to() {
		sp.getFrom();
		sp.getTo();
		sp.getJfk();
		sp.getDepature();
	    sp.getCok();
	}

	@Then("i see the flights")
	public void i_see_the_flights() {
		Assert.assertEquals(driver.getTitle(), "search flight");
	    
	}
}
