Feature: Verifying Facebook login page

  Scenario Outline: Verify with invalid credentials
    Given User in on the Facebook login page
    When User should enter "<username>" and "<password>"
    And User should click login button
    Then User should verify login error message "The password that you've entered is incorrect. Forgotten password?"

    Examples: 
      | username | password   |
      | vignesh  | Vignesh123 |

  Scenario Outline: Verify with valid credentials
    Given User in on the Facebook login page
    When User should enter "<username>" and "<password>"
    And User should click login button
    Then User should verify success message "Facebook Homepage"

    Examples: 
      | username | password |
      | school   | college  |
