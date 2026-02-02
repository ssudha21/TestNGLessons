Feature: Add a list of products to cart
  @AddtocartTest
  Scenario:Search and add items to cart
    Given user is on Greenkart landing page
    When user search an item by 3 letters and extracted actual name of the product
    Then user verifies the item exists in the page and add to Cart
    And User check out
