


@customerManagementTests
Feature: Customer management

@newCustomerBTNTest
Scenario: As a user when I navigate to the Customer Tab, I should see New Customer button 
Given As a entity user, I am logged in
When I navigate to the customer tab 
Then I should see the new Customer button displayed


@newCustomerBasicInfoFormLabel
Scenario: As a user when I navigate to the Customer Tab, I should see a New customer button
Given As a entity user, i am logged in
When I navigate to the customer tab
And I Click on the New Customer button 
Then I shoul see the basic info label is present


@newCustomerBasicInfoFields
Scenario: AS a user when I navigate to the customers Tab and click on New Customer button, I should see the Basic Info fields 
Given As an entity user, I am logged in 
When I navigate to the customer tab
And I click on the new customer button
Then I should see the Basic Info form label 
And I should see the fields Display Name, Primary Contact Name, Email, Primary Currency, Website, and Prefix


@newCustomerTableList
Scenario: As a user when I navigate to the Customers Tab, I should see the Customers Table List
Given As an entity user, I am logged in
When I navigate to the customers tab
Then I should see the Customer List Table

@newCustomerPresentTables
Scenario: As a user when I navigate to the Customers Tab, I should see the Customers Table List
Given As an entity user, I am logged in
When I navigate to the customers tab
Then I should see that are four columns presents in the table

