Feature: Happy path for adding items to cart
  User should be able to add items to cart

  Scenario: Navigating to website and adding items to cart with search
    Given User navigates to website
     When User clicks search bar
     Then User enter "SUNGLASSES" to search bar and click search button
      And User sees "SUNGLASSES" value at search results
      And User adds "first" product to cart