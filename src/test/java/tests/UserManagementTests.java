package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

public class UserManagementTests {
	public static void main(String[] args) {
		//invalidEmailLoginTest();
		invalidPasswordLogin_test();
	}
	
	
	static BrowserUtils utils;
	static LoginPage loginpage;
	
	public static void invalidEmailLoginTest() {
		utils = new BrowserUtils();
		loginpage = new LoginPage();
	}
	// invalid email login test
	// go to crater
	   Driver.getDriver().get(TestDataReader.getProperty("appurl"));
	   Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   Driver.getDriver().manage().window().maximize();
	

	utils.waitForELementToBeVisible(loginpage.login_page_email_box);
	
	//click on login button without filling out the credential fields 
	loginpage.login_page_login_btn.click();
	
	// then verify there are 2 fields required messages display
	utils.waitForAllElementsToBeVisible(loginpage.login_page_fieldRequired_Message);
	if(loginpage.login_page_fieldRequired_Messages.size()==2) {
		System.out.println("There are 2 required field messages displayed");
	}else {
		System.out.println("something is wrong with required field messages");
	}
	
	
	//enter invalid email yummy@primetechschool.com and valid password primetech@school
		utils.sendKeysWithActionsClass(loginpage.login_page_email_box, "yummy@primetechshool.com");
	
	//loginpage.login_page_email_box.sendKeys("yummy@primetechschool.com");
		utils.sendKeysWithActionsClass(loginpage.login_page_password_box, TestDataReader.getProperty("password"));
	//loginpage.login_page_password_box.sendKeys(TestDataReader.getProperty("password"));
	
	//click login button 
	loginpage.login_page_login_btn.click();
	

	// then verify there are 2 fields required messages display
utils.waitForAllElementsToBeVisible(loginpage.login_page_fieldRequired_Messages);
if(loginpage.login_page_fieldRequired_Messages.size() == 2) {
  	System.out.println("There are 2 required field messages displayed");
    }else {
	System.out.println("something is wrong with required field messages");
	
    }

//enter invalid email yummy@primeschool.com and valid password primetech@school
utils.sendKeysWithActionsClass(loginpage.login_page_email_box, "yummy@primetechschool.com");
//login.page.login_page_email_box.sendKeys("yummy@primeschool.com");
utils.sendKeysWithActionsClass(loginpage.login_page_password_box, TestDataReader.getProperty("password")); 
//loginpage.login_page_password_box.sendkeys(TestDataReader.getProperty("password"));


//click login button
loginpage.logi_page_login_btn.Click();

// then verify that an error message "These credentials do not match our records."displays
utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
if (loginpage.login_page_invalidLogin_message.isDisplayed()) {
	System.out.println("Credential invalid Error message displayed");
}else {
	System.out.println("Credential invalid Error messae not displayed");
}
}


//invalid password login test

public static void invalidPasswordLogin_test() {
loginpage = new LoginPage();
utils = new BrowserUtils();

//go to crater
Driver.getDriver().get(TestDataReader.getProperty("appurl"));
Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Driver.getDriver().manage().window().maximize();

utils.waitForElementToBeVisible(loginpage.login_page_email_box);

//click on login button without filling out the credential fields 
loginpage.login_page_login_btn.click();

// then verify there are 2 fields required messages display
utils.waitForAllElementsToBeVisible(loginpage.login_page_fieldRequired_Messages);
if(loginpage.login_page_fieldRequired_Messages.size() == 2) {
	System.out.println("There are 2 required field messages displayed");
}else {
	System.out.println("something is wrong with required field messages");
}



//enter valid email dummy@primetechschool.com and invalid password primeschool
utils.sendKeysWithActionsClass(loginpage.login_page_email_box, TestDataReader.getProperty("email")); 

utils.sendKeysWithActionsClass(loginpage.login_page_password_box, "primeschool");

//loginpage.login_page_password_box.sendkeys(TestDataReader.getProperty("password"));

//click login button 
loginpage.login_page_login_btn.click();

//then verify that an error message "These credentials do not match our records."displays

utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
if (loginpage.login_page_invalidLogin_message.isDisplayed()) {
	System.out.println("Credential invalid Error message displayed");
}else {
	System.out.println("Credential invalid Error messae not displayed");

}
}}}





	
	
	

