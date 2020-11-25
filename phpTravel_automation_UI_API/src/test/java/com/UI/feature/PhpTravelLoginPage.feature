Feature: PHP Travel page validation

  Scenario Outline: Php Successful Login with Valid Credentials
    Given User is on Home Page
    When  User Navigate to LogIn Page
    And   User enters "<UserName>" and "<Password>"
    Then  Message displayed Login Successfully
    Examples:
      | UserName   | Password |
      | xyz@gmail.com | xyz |
