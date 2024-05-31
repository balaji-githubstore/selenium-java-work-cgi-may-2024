@login
Feature: Login
  In order to maintain employee records
  As a user
  I would like to access the dashboard

  Background: 
    Given I have browser with orange hrm application

  @valid @smoke
  Scenario: Valid Login
    When I enter username as "Admin"
    And I enter password as "admin123"
    And I click on login
    Then I should access to dashboard with title "Quick Launch"

  @invalid
  Scenario Outline: Invalid Login
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on login
    Then I should not get access to dashboard with error "<expected_error>"

    Examples: 
      | username | password | expected_error      |
      | John     | John123  | Invalid credentials |
      | Peter    | Peter123 | Invalid credentials |
