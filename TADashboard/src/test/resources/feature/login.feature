Feature: Validate Login page

  Background:
    Given I navigate to the Dashboard login page

  Scenario: DA_LOGIN_TC001 - Verify that user can login specific repository successfully via Dashboard login page with correct credentials
    When I enter valid username
    And I enter valid password
    And I click on Login button
    Then The Dashboard Main page appears

