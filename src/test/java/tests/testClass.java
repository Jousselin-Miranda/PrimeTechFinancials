package tests;

import java.time.Duration;

import pages.AmazonHomepage;
import utils.Driver;
import utils.TestDataReader;

public class testClass {
	
	public static void main(String [] args) {
		
		//in order to read something from the env.properties,
		//we need to 
		
		Driver.getDriver().get(TestDataReader.getProperty("amazon.com"));
		   Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   Driver.getDriver().manage().window().maximize();
		// in order to use the page objects stored in the page classes, 
		// we need to create an object of that class, then call the web element object for use.
		AmazonHomepage azpage = new AmazonHomepage();
		azpage.amazonSearchBox.sendKeys("Coffee mug");
		azpage.amazonSearchButton.click();
		
	}

}
