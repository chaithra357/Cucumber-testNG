Feature: Test Login with valid case
@Login
Scenario:Validate successful Login with Valid Data
Given I should be on the Home screen with Login Page
When Enter valid crednetials
And I click on the Login button
Then Login Successful