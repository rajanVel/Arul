package org.runner;

import org.Configuration.Filereader_manager;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.bclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"feature\\Arun.feature"},
glue = {"org.arul_stepdef"},publish = true,
monochrome = true,
dryRun = false)
public class Newproj_runner {
	
	public static WebDriver driver;
	
	
	public static void setUp() throws Throwable  {
		
		String browser = Filereader_manager.getintanceFR().getinstanceCR().GetBrowser();
		WebDriver driver = bclass.Browserlaunch(browser);		
		
	}
	
	

}
