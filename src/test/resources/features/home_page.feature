Feature: Amazon Item Verification

  @home_page
  Scenario Outline: Check Amazon Item Text
    Given A user navigates to URL "<URL>"
    Then Amazon logo is displayed
    When Click on Hamburger Button
    And Click on Value "TV, Appliances, Electronics"
    And Click on Value "<applianceSection>"
    Then Click on Checkbox Value "<checkboxValue>"
    And Click on Sorting
    Then Click on Dropdown Value "Price: High to Low"
    And Click on Item Value "2"
    Then Switch to New Window
    And Text "<verificationText>" is present

    Examples:
      | URL                    |  applianceSection  | checkboxValue  | verificationText  |
      | https://www.amazon.in/ |  Televisions       | Samsung        | About this item   |