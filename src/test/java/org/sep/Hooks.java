package org.sep;

import org.helping.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@After()
	public void aft() {
closeBrowser();
	}
	
	@Before
	public void bef() {
 openChrome();
 maxWindow();

 
	}
	
	
}
