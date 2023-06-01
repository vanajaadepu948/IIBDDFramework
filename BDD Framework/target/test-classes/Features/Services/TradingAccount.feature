Feature: Trading Account feature

  Background: 
    Given user on homepage
    And user click on homepage Services Menu feature


  Scenario: InteractiveInvestor Trading Account page tests
    And click on Trading Account link
    Then Trading Account Page URL should be "https://www.ii.co.uk/ii-accounts/trading-account"
    And Open an account button "Open an account" should be displayed on trading account page
    And Transfer to us button "Transfer to us" should be displayed on trading account page
    And Trading account text "Trading Account" should be displayed on trading account page
