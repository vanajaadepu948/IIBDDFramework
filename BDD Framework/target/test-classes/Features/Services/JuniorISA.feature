Feature: Junior ISA feature
  I want to use this template for my feature file

  Background: 
    Given user on homepage
    And user click on homepage Services Menu feature

  Scenario: InteractiveInvestor Junior ISA page tests
    And click on Junior ISA link
    Then Junior ISA Page URL should be "https://www.ii.co.uk/ii-accounts/isa/junior-isa" shown
    And Junior Stocks and Shares ISA text "Junior Stocks and Shares ISA" should be displayed onjunior isa page
