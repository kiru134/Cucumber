Feature: Insurance Company
Scenario: Click on Corporate Mission and Validate result
    Given Go to Insurance Company Website Close FAQ popup
    When Mouse hover to About Us
    And Click on Corporate Mission
    Then Verify if Corporate Mission present in new page opened