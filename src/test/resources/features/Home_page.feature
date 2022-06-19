Feature: Home Page

  @home_page
  Scenario Outline: Check Amazon Logo
    Given A user navigates to URL "<URL>"
    Then Amazon logo is displayed
    When Click on Hamburger Button
    And Click on Value "TV, Appliances, Electronics"
    And Click on Value "Televisions"

    Examples:
      | URL |
      | https://www.amazon.in/ |