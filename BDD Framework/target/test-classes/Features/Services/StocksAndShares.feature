Feature: stocks and shares feature
  I want to use this template for my feature file
Background: 
    Given user on homepage
    And user click on homepage Services Menu feature
  Scenario: InteractiveInvestor Stocks and Shares ISA page tests
    And click on Stocks and Shares ISA link
    Then Stocks and Shares ISA Page URL should be "https://www.ii.co.uk/ii-accounts/isa"
    And Open an ISA button "Open an ISA" should be displayed on SSISA page
    And Transfer an ISA button "Transfer an ISA" should be displayed on SSISA page
    And Stocks and Shares ISA text "Stocks and Shares ISA" should be displayed on SSISA page

