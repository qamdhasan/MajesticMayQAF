package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.careerhack.common.MajesticMayGoogleBase;
import com.careerhack.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MajesticMay_GoogleSearch extends MajesticMayGoogleBase{
	

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
	   
	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
		
		//Step 1: identify (locate) the web element
		//locators (8 locators) - 1. id 2. name 3. class name 4. html tag 
		//5. link text 6. partial link text 7. xpath 8. css selector
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		
		//Step 2: perform the action
		
		//searchBox.sendKeys(string);
		
		HomePage hp = new HomePage(driver);
		hp.enterSearch(string);
	   
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		//Step 1: identify the element
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		
		//Step 2: perform action
		//searchButton.click();
		HomePage hp = new HomePage(driver);
		hp.clickSearch();
	    
	}

	@Then("I receive relevant results")
	public void i_receive_relevant_results() {
		
		//Step 1: identify the element
		//WebElement searchResult = driver.findElement(By.id("result-stats"));
		
		//Step 2: perform action
		//String numResult = searchResult.getText();
		//System.out.println("*************************************************");
		//System.out.println(numResult);
		//System.out.println("*************************************************");
		HomePage hp = new HomePage(driver);
		hp.captureResult();
		closeBrowser();
	    
	}


}
