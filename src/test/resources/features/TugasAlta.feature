@Web
Feature: Success Login
  Background:Login
    And user input "standard_user" and "secret_sauce"
    And user click login button
    Then user success login

  @Search
  Scenario: Search
    When user select product by value az
    And user add product to cart
    And user select product by value za
    And user add product2 to cart
    And user click button cart
    And user remove second item
    And user click continue shopping
    Then user back to shopping list


