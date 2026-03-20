@sanity
Feature: Creating a new customer

  Background: 
    Given User opens a home page of application
    And User enters UserID as "mngr655644"
    And USer enters Password as "pUdupAp"
    When User clicks on Login button
    Then User will navigated to home page

  Scenario Outline: Create New Customer with all data
    And User clicks on NewCustomer
    And User enters Customer Name as "<Customer Name>"
    And User selects Gender
    And User enters Date of Birth as "<Date of Birth>"
    And User enters Address as "<Address>"
    And User enters City as "<City>"
    And User enters State as "<State>"
    And User enters Pin as "<Pin>"
    And User enters Mobile Number as "<Mobile Number>"
    And User enters E-mail
    And User enters Password as "<Password>"
    When User Clicks on submit button
    Then new customer is created
    And user captures the customer id

    Examples: 
      | Customer Name | Date of Birth | Address | City  | State | Pin    | Mobile Number | Password |
      | Shweta Sharma | 01-09-1990    | XYZ     | Noida | UP    | 201301 |    9876543211 | qwerty   |
