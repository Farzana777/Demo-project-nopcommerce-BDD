package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features//",
		glue="stepDefinitions",
		tags= "@sanity or @regression",
		plugin= {"pretty", 
	        		"html:reports/myreport.html", 
	        		"json:reports/myreport.json",
	        		"rerun:target/rerun.txt"     //Mandatory to capture failures
	        },   
		dryRun=false,
	    monochrome=true
		)
public class TestRunner {

}
