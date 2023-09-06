package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class DashboardPage {
	
	public DashboardPage() { //this is a constructor
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (linkText = " Dashboard")
	public WebElement dashboard_tab;
	
	@FindBy (xpath = "//a[text()=' customers']")
	public WebElement customers_tab;
	
	@FindBy (xpath = "//a[text()=' Items']")
	public WebElement items_tab;
	
	@FindBy (xpath = "//p[text()='Logged in successfully.']")
	public WebElement loggedInSuccess_message;
	
			

}
