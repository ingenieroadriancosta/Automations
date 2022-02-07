import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/search.feature",glue="steps")
public class RunCukesTest extends AbstractTestNGCucumberTests{
	
	
	
	
	/*
	Features examples
	1.
	 	Feature: Search
		
		Scenario: Search dresses
		
		Given the user is in the index page
		When the user enter dresses in the search bar
		And the user clicks the search button
		Then the dresses page appears
	
	
	
	2.


	 */
}
