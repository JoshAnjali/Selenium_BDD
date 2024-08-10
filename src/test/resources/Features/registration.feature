@registration
Feature:  Registrtion
  As a user i want to register.

    Scenario Outline: Registration.
    Given I am on the registration page.
    When I click on the registration button.
    And I fills the registration form with valid details."<gender>"<First Name>"<Last Name>"<DoBDay>"<DoBMonth>"<DoBYear>"<Email>"<Company Name>"<Options>"<Your Password>"<REGISTER>"
    And I click on the registration button and continue button.
    Then I should be on the home page.
        Examples:
            | gender | First Name | Last Name | DoBDay | DoBMonth | DoBYear | Email           | Company Name | Options    | Your Password | REGISTER |
            | Male   | Anish      | Mehata    | 11      | 3        | 1988   | anish.M@abcd.com| ABC Limited  | Newsletter | Abc123        |  Click   |


