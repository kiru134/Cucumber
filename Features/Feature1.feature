Feature: Insurance Company

  Scenario: Search Car and Validate result
    Given Go to Insurance Company Website Close FAQ popup
    When I Click on search
    And Enter car in search box
    And Click on Search button 
    Then Validate if Car present in first result 