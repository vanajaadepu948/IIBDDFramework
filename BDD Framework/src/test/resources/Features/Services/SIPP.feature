Feature: SIPP feature
  I want to use this template for my feature file

  Background: 
    Given user on homepage
    And user click on homepage Services Menu feature


  Scenario: InteractiveInvestor SIPP page tests
    And click on SIPP link
    Then SIPP Page URL should be "https://www.ii.co.uk/ii-accounts/sipp"
    And Open a SIPP button "Open a SIPP" should be displayed on SIPP
    And Transfer your pension "Transfer your pension" should be displayed on SIPP
 