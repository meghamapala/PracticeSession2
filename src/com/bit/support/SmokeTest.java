package com.bit.support;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SmokeTest extends BaseTest{
	    
	    @Test
	    public void targetTitleTest(){
		String b=dr.getTitle();
		System.out.println("Page Title is ==> "+b);
		String dd="Target : Expect More. Pay Less.";
		Assert.assertEquals(b, dd);
		Assert.assertTrue(b.contains("Target : Expect More. Pay Less."));
		System.out.println("Test completed- Title Verified ");
	}
	    
	    @Test
	    public void verifyTargetURL() {
	    	String URL = dr.getCurrentUrl();
	    	Assert.assertEquals(URL, "https://www.target.com/" );
			System.out.println("Test completed- URL Verified ");

	    }
	    
	    @Test
	    public void signIn() throws InterruptedException {
	    	dr.findElement(By.xpath("//*[@id=\"account\"]/span[4]")).click();
	    	Thread.sleep(3000);
	    	dr.findElement(By.xpath("//*[@id=\"accountNav-signIn\"]/a/div")).click();
	    	Thread.sleep(3000);
	    	String b=dr.getCurrentUrl();
	    	System.out.println(b);
	    	Thread.sleep(3000);
	    	String cc=dr.getTitle();
	    	System.out.println(cc);
	    	dr.findElement(By.cssSelector("input[name='username']")).sendKeys("qwegh@gmail.com");
	    	Thread.sleep(3000);
	    	dr.findElement(By.cssSelector("input[name='password']")).sendKeys("56ty89klo");
	    	Thread.sleep(3000);
	    	dr.findElement(By.xpath("//span[contains(text(),'Keep me signed in')]")).click();
	    	Thread.sleep(3000);
	    	dr.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	    	Thread.sleep(3000);
	    	String ss=dr.findElement(By.xpath("//div[@class='indexes__le-sc-12ry97t-1 bXGfjR']")).getAttribute("innerHTML");
	    	Thread.sleep(3000);
	    	System.out.println(ss);
	    	String kk="We can't find your account.";
	    	Assert.assertEquals(ss, kk);
	    	Thread.sleep(3000);
	    	System.out.println("Correct Error Message displayed");
	    }
	    
	    
	
	
	
	
		

		
		
		
	}


