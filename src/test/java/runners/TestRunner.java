package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",//this to specify the location of the feature files so cucumber can find 
		glue="@newCustomerTableList"
		)

public class TestRunner {

}
