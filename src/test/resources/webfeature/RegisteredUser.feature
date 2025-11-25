@regression
Feature: Registered user logged in
  Scenario: Registered user logs in after accepting the age restriction pop-up
    When the age restriction pop-up is displayed
    Then the user clicks on "OK" on the age restriction pop-up
    And the login page is displayed
    When the user enters valid username and password
    And the user clicks on the Login button
    Then the user should be successfully logged in
    And the user should see the home page
