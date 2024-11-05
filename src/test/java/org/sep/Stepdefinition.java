package org.sep;

import java.util.List;
import java.util.Map;

import org.helping.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {

//
//@Given("User Have to Open The FaceBook Application Through ChromeBrowser")
//public void user_Have_to_Open_The_FaceBook_Application_Through_ChromeBrowser() {
//
//launchURL("https://www.facebook.com/");}
//
//@When("User Have To Click the Login button")
//public void user_Have_To_Click_the_Login_button() {
//driver.findElement(By.name("login")).click();
//}
//
//@Then("User Have To Close The Chrome Browser")
//public void user_Have_To_Close_The_Chrome_Browser() {
//driver.quit();
//}
//
//
////Login2 Feature file 
//
//@Given("User Have To Open The Facebook Application Through ChromeBrowser and Maxi window")
//public void user_Have_To_Open_The_Facebook_Application_Through_ChromeBrowser_and_Maxi_window() {
//	
//	launchURL("https://www.facebook.com/");
//
//}
//
//@When("User Have To Pass The {string} and {string}")
//public void user_Have_To_Pass_The_and(String user, String pwd) {
//	driver.findElement(By.id("email")).sendKeys(user);
//	driver.findElement(By.name("pass")).sendKeys(pwd);
//
//}
//
//@When("User Have Click The Login button")
//public void user_Have_Click_The_Login_button() {
//	
//}
//
//@Then("User Have to Close Browser")
//public void user_Have_to_Close_Browser() {
//   driver.quit();
//}
//




	@Given("User Have to Open The FaceBook Application Through ChromeBrowser")
	public void user_Have_to_Open_The_FaceBook_Application_Through_ChromeBrowser() {
	   launchURL("https://www.facebook.com/");
		
	}

	@When("User Have To Pass The {string} and {string}")
	public void user_Have_To_Pass_The_and(String user, String pwd) {
	   driver.findElement(By.id("email")).sendKeys(user);
	   driver.findElement(By.name("pass")).sendKeys(pwd);
	}

	@When("User Have Click The Login button")
	public void user_Have_Click_The_Login_button() {
	   driver.findElement(By.name("login")).click();
	}


	
	@When("User Have To Click the Login button")
	public void user_Have_To_Click_the_Login_button() {
		driver.findElement(By.name("login")).click();
	}


	//WITHOUT HEADER 

	@When("User Have to pass the Valid UserName and InValid password")
	public void user_Have_to_pass_the_Valid_UserName_and_InValid_password(io.cucumber.datatable.DataTable table) {
	   //1D -List 
		Assert.assertTrue(false);
		List<String> list = table.asList();
		String user = list.get(2);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(list.get(3));
	}


	@When("User Have to pass the InValid UserName and InValid password")
	public void user_Have_to_pass_the_InValid_UserName_and_InValid_password(io.cucumber.datatable.DataTable table) {
	   //2D-List 
		List<List<String>> lists = table.asLists();
		
		List<String> info = lists.get(2);
		
		driver.findElement(By.id("email")).sendKeys(info.get(0));
		driver.findElement(By.name("pass")).sendKeys(info.get(1));	
		
	}

	// WITH HEADER 

	@When("User Have to pass the InValid UserName and Valid password")
	public void user_Have_to_pass_the_InValid_UserName_and_Valid_password(io.cucumber.datatable.DataTable table) {
	    //1D -Map 
		Map<String, String> map = table.asMap(String.class,String.class);

		driver.findElement(By.id("email")).sendKeys(map.get("username"));
		driver.findElement(By.name("pass")).sendKeys(map.get("password"));

	}


	@When("User Have to pass the Valid UserName and Valid password")
	public void user_Have_to_pass_the_Valid_UserName_and_Valid_password(io.cucumber.datatable.DataTable table) {
	    //2D- MAP
		List<Map<String, String>> maps = table.asMaps();
		Assert.assertTrue(false);
		Map<String, String> map = maps.get(1);
		driver.findElement(By.id("email")).sendKeys(map.get("username"));
		driver.findElement(By.name("pass")).sendKeys(map.get("password"));

	}


















}
