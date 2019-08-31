package myRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Santhan\\eclipse-workspace\\cucumberTestDemo\\src\\main\\java\\Feature",glue={"stepDefinition"}
 )
 
public class TestRunner {
 
}