Feature: Home Page

  @home_page
  Scenario Outline: Check Amazon Logo
    Given A user navigates to URL "<URL>"
    Then Amazon logo is displayed
    When Click on Hamburger Button
    And Click on Value "TV, Appliances, Electronics"
    And Click on Value "Televisions"
    Then Click on Checkbox Value "Samsung"
    And Click on Sorting
    Then Click on Dropdown Value "Price: High to Low"
    And Click on Item Value "2"
    Then Switch to New Window
    And Text "About this item" is present

    Examples:
      | URL |
      | https://www.amazon.in/ |