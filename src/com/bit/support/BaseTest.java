package com.bit.support;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
   
	WebDriver dr;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/"
				+ "eclipse-workspace/"
				+ "PracticeSession2/chromedriver ");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://www.target.com/");

		
	}
	
    @After
	public void tearDown() {
		dr.close();
		dr.quit();
		
	}
	


}
