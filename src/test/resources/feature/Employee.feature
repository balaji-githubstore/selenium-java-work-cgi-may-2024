@employee
Feature: Employee
  In order to modify employee records 
  As a user
  I want to create, edit, delete the employee records

  @addemployee
  Scenario Outline: Add Valid Employee
    Given I have browser with orange hrm application
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on login
    And I click on PIM Menu
    And I click on Add Employee
    And I fill the employee details
      | firstname | middlename | lastname |
      | <fname>   | <mname>    | <lname>  |
    And I click on save
    Then I should get the profile name as "<expected_name>"

    Examples: 
      | username | password | fname | mname | lname | expected_name |
      | Admin    | admin123 | john  | w     | wick  | john wick     |
      | Admin    | admin123 | peter | k     | ken   | peter ken     |
