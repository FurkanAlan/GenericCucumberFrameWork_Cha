Feature: Validate Elements in Practice Page

  Scenario: Validate buttins, Checkboxes and selections
    Given I navigate to "https://letskodeit.teachable.com" url
    When I click on Practice
    Then I select BMW radio button
    And I select Honda from dropdown
