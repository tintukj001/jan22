package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	public WebDriver driver;
	public PageObjectModel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	WebElement cookie;
	public void getCookie () {
		cookie.click();
		
		
	}
	//@FindBy(xpath="//span[@class='account-username']")
	//WebElement login;
	//public void getLogin () {
	//	login.click();}
	
	//@FindBy(xpath="(//input[@class='input-field__input ellipsis'])[1]")
	//WebElement username;
	//public void getUsername() {
	//	username.sendKeys("tintukj001@gmail.com");}
		

//@FindBy(xpath="(//input[@class='input-field__input ellipsis'])[2]")
//WebElement password;
//public void getPassword() {
	//password.sendKeys("2021tintu@#A");}
	
	//@FindBy(xpath="//button[@id='login-button']")
	//WebElement loggedin;
	//public void getLoggedin() {
		//loggedin.click();}
	
	@FindBy(xpath="(//input[@name='Departure Airport'])[1]")
	WebElement from;
	public void getFrom() {
		from.sendKeys("JFK");
		}
	@FindBy(xpath="(//div[@aria-label='New York, United States John F. Kennedy International Airport JFK Operated by Emirates'])[1]")
	WebElement jfk;
	public void getJfk() {
		jfk.click();
	}
	@FindBy(xpath="(//input[@name='Arrival Airport'])[1]")
	WebElement to;
	public void getTo() {
		to.sendKeys("COK");}
	@FindBy(xpath="(//div[@aria-label='Kochi (Cochin), India Kochi International Airport COK Operated by Emirates'])[2]")
	WebElement cok;
	public void getCok() {
		cok.click();
	}
	
	@FindBy(xpath="//input[@id='search-flight-date-picker--depart']")
	WebElement departure;
	public void getDepature() {
	departure.
			
	}
	@FindBy(xpath="//a[@class='cta cta--large cta--primary js-continue-search-flight search-flight__continue--cta ']")
	WebElement search;
	public void getSearch() {
		search.click();}
		
		
	}
	
