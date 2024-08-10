Feature: Login

    Scenario Outline: Login with valid credentials.
        Given I am on the landing page.
        When I click on the login link text.
        And I fills the Login form with valid credentials."<Email>""<Password>"
       And I click on the login button.
       Then I should be on the home page.

      Examples:

          | Email               | Password |
          | anish.M@abcd.com    | Abc123   |