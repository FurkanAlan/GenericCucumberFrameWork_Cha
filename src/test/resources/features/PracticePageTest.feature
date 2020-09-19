Feature: Validate Elements in Practice Page

  @homepage
  Scenario: Validate buttons, Checkboxes and selections
    Given I navigate to "https://letskodeit.teachable.com" url
    Then I validate enrollNow is displayed
    And I valide homepage source is "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=height:60/https://www.filepicker.io/api/file/WSundQ6BT6u2OZe2kcNA"


  @practicepag
  Scenario: Validate buttons, Checkboxes and selections
    Given I navigate to "https://letskodeit.teachable.com" url
    When I click on Practice
    And I wait 5000 milliseconds
    Then I select BMW radio button
    And I select honda from dropdown
