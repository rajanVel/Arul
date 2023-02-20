package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.bclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/org/feature"},
glue = {"org.arul_stepdef"},
publish = true,
monochrome = true,
dryRun = false,
plugin = {"pretty","html:Arul/destination"}
		
		)
public class Arul_runner {
	
public static WebDriver driver;

@BeforeClass	
public static void set() {
	driver = bclass.Browserlaunch("chrome");
	
}
@AfterClass
public static void tear_down() {
	driver.close();
}

}
