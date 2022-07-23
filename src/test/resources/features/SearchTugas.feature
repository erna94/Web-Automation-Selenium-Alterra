#@Web
#Feature: Search product
#
#  Background: Login
#    Given user input "standard_user" and "secret_sauce"
#    And user click login button
#    Then user success login
#
#  @Search
#  Scenario Outline: Search product by filter
#    Given user click add to cart
#    Then user can see the shopping cart added
#    Given user click dropdown sort product
#    When user select the product by value <"za">
#    Then user succsess can see the product list by value
#    And user click add to cart2
#    Then user success can see the shopping cart added
#    And user click shopping cart2
#    Then user can see page your cart
#    Examples:
#    |value         |
#    |za            |
#