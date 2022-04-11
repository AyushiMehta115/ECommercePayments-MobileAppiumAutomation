Feature: Validate Flipkart Payments page

  @QATest
  Scenario Outline: Validate User is able to navigate to Payments page of Flipkart application
    Given User can launch Flipkart Application on mobile
    And User selects Language as <language>
    And User clicks on Continue button
    When User clicks on Login button
    And User enters username and clicks Continue
    And User gets auto-logged in by auto-capturing and entering OTP
    Then User clicks on Search text Box and enters Search Item as <searchItem>
    And User selects item from the displayed list
    And User checks availability of product and clicks on order It button
    And User selects required size as <size> and clicks on Continue button
    And User validate payment details and click on Continue button


    Examples:
    |language|searchItem       |size|
    |English |tshirts for women|S   |


