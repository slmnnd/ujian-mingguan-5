Feature: user add to Cart
  Scenario: add 2 products to cart valid
    Given user enter to product page
    When user choose 2 products
    And user click add to cart button
    Then user successfully added to cart