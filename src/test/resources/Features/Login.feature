@login
Feature: Login

    Scenario Template: Login with valid credentials
        Given I am on the landing page
        When I click on the login button
        And I fills the Login form with valid details "<email>""<password>"
       And I click on the login button
       Then I should be on the home page

      Examples:

          | email               | password |
          | anish.M@abcd.com    | Abc123   |