package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	// Page Object Model - page factory
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// identifying a web element
	// WebElement searchBox = driver.findElement(By.name("q"));
	@FindBy(name = "q")
	private WebElement searchBox;

	// searchBox.sendKeys(string);
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}

	// WebElement searchButton = driver.findElement(By.name("btnK"));
	@FindBy(name = "btnK")
	WebElement searchButton;

	// searchButton.click();
	public void clickSearch() {
		searchButton.submit();
	}

	@FindBy(id = "result-stats")
	WebElement searchResult;

	public void captureResult() {
		String numResult = searchResult.getText();
		System.out.println("*************************************************");
		System.out.println(numResult);
		System.out.println("*************************************************");
	}

}
