package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MajesticMayGoogleBase {

	public WebDriver driver; // WebDriver is an interface

	public void launchBrowser() {

		// WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

	}

	public void closeBrowser() {

		driver.close();

	}

}
