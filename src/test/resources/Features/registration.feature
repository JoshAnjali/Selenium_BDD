@registration
Feature:  Registration
As a user I want to register
  Scenario Outline: Registration
    Given I am on the landing page
    When I click on the registration button
    And User fills the registration form with valid details "<gender>" "<firstname>" "<lastname>" "<DoBDay>" "<DoBMonth>" "<DoBYear>" "<email>" "<CompanyName>" "<newsletter>" "<password>" "<ConfirmPassword>"
    And I click on the registration button and continue button
    Then I should be on the home page
    Examples:
      | gender | firstname | lastname | DoBDay | DoBMonth | DoBYear | email           | CompanyName | newsletter | password | ConfirmPassword |
      | Male   | Anish     | Mehata   | 11     | 3        | 1988    |anish.M@abcd.com | ABC Limited | Yes        | Abc123   |  Abc123         |





