package tests;
import pages.CustomersPage;
import pages.DashboardPage;
import pages.ItemsPage;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;
import io.cucumber.java.en.When;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class CustomerManagementSteps {
	BrowserUtils utils = new BrowserUtils();
	DashboardPage dashPage = new DashboardPage();
	CustomersPage customerPage = new CustomersPage();
	
	
	LoginPage loginpage = new LoginPage();
	DashboardPage dash_page = new DashboardPage();
	ItemsPage item_page = new ItemsPage();
	
	
	//@newCustomerBTNTest scenario start-
	@When("I navigate to the customers_Tab")
	public void i_enter_valid_usermail_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(dashPage.customers_tab);
	    dashPage.customers_tab.click();
	    utils.waitForElementToBeVisible(customerPage.customer_page_Customer_TextHeader);
	    Assert.assertTrue(customerPage.customer_page_Customer_TextHeader.isDisplayed());
	    
	}
	@Then("I should see the New Customer button displayed")
	public void i_should_see_the_new_customer_button_displayed() {
	   Assert.assertTrue(customerPage.customer_page_NewCustomerBTN.isDisplayed());
	   Driver.quitDriver();
	    
}
	//@newCustomerBTNTest scenario end-
	
	
	//@newCustomerBasicInfoFormLabel start-

	@When("I Click on the New Customer button")
	public void i_click_on_the_new_customer_button() {
	   customerPage.customer_page_NewCustomerBTN.click();
	   utils.waitForElementToBeVisible(customerPage.customer_page_NewCustomer_TextHeader);
	   Assert.assertTrue(customerPage.customer_page_Customer_TextHeader.isDisplayed());
	}
	@Then("I shoul see the basic info label is present")
	public void i_shoul_see_the_basic_info_label_is_present() {
	   utils.waitForElementToBeVisible(customerPage.customer_page_BasicInfo_form_label);
	   Assert.assertTrue(customerPage.customer_page_BasicInfo_form_label.isDisplayed());
	   Driver.quitDriver();
	}
	//@newCustomerBasicInfoFormLabel end--
	
	
	//@newCustomerBasicInfoFields start-
	@Then("I should see the fields Display Name, Primary Contact Name, Email, Primary Currency, Website, and Prefix")
	public void i_should_see_the_fields_display_name_primary_contact_name_email_primary_currency_website_and_prefix() {
		utils.waitForElementToBeVisible(customerPage.customer_page_BasicInfo_DisplayName_Field);
		if(customerPage.customer_page_BasicInfo_DisplayName_Field.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Display Name Field visible, PASS");
		} else {
			Assert.assertTrue(false);
			System.out.println("Display Name Field not visible, FAIL");
		}
		Assert.assertTrue(customerPage.customer_page_BasicInfo_DisplayName_Field.isDisplayed());
		Assert.assertTrue(customerPage.customer_page_BasicInfo_PrimaryContactName_Field.isDisplayed());
		Assert.assertTrue(customerPage.customer_page_BasicInfo_Email_Field.isDisplayed());
		Assert.assertTrue(customerPage.customer_page_BasicInfo_PrimaryCurrency_Field.isDisplayed());
		Assert.assertTrue(customerPage.customer_page_BasicInfo_Website_Field.isDisplayed());
		Assert.assertTrue(customerPage.customer_page_BasicInfo_Prefix_Field.isDisplayed());
		Driver.quitDriver();
	}
	//@newCustomerBasicInfoFields end-
	
	// @newCustomerTableList start -
		@Then("I should see the Customer List Table")
		public void i_should_see_the_customer_list_table() throws InterruptedException {
			Thread.sleep(2000);
			if (customerPage.customer_page_NoCustomersYet_text.isDisplayed()) {
				customerPage.customer_page_NewCustomerBTN.click();
				utils.waitForElementToBeVisible(customerPage.customer_page_BasicInfo_DisplayName_Field);
				customerPage.customer_page_BasicInfo_DisplayName_Field.sendKeys("Student");
				customerPage.customer_page_NewCustomerSubmit_BTN.click();
				Thread.sleep(1000);
				dashPage.customers_tab.click();
//				Thread.sleep(1000);
				utils.waitForElementToBeVisible(customerPage.customer_page_Customer_TextHeader);
				Assert.assertTrue(customerPage.customer_page_CustomerTable.isDisplayed());
			} else {
				Assert.assertTrue(customerPage.customer_page_CustomerTable.isDisplayed());
			}
//			Driver.quitDriver();
		}
		
		// @newCustomerTableList end -
	
	
	
	
	
	
	
	
}