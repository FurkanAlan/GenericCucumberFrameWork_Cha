Feature: Validate Elements in Practice Page

  Scenario: Validate buttons, Checkboxes and selections
    Given I navigate to "https://letskodeit.teachable.com" url
    And I wait 5000 milliseconds
    When I click on Practice
    And I wait 5000 milliseconds
    Then I select BMW radio button
    And I select honda from dropdown
