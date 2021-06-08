Feature: Validate Login page

  Background:
    Given I navigate to the Dashboard login page

  Scenario: DA_LOGIN_TC001 - Verify that user can login specific repository successfully via Dashboard login page with correct credentials
    When I enter valid username
    And I enter valid password
    And I click on Login button
    Then The Dashboard Main page appears

  Scenario: DA_LOGIN_TC010 - Verify that the page works correctly for the case when no input entered to Password and Username field
    When I click Login button without entering data into Username and Password field
    Then A message "Please enter username" is displayed