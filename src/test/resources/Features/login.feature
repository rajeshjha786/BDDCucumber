Feature: Verify Login Page


@smoke
  Scenario Outline: Verify login Page for free crm
    Given user enters the url
    When user enters the valid "<username>" and "<password>"
    And user clicks on login button
    Then user is navigated to the homePage
    And user closes the browser

    Examples:
    |username             | password   |
    |rajeshjh64@gmail.com | People@123  |