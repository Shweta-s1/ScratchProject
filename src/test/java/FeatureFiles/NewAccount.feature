@sanity
Feature: Creating a new account

  Background: 
    Given User opens a home page of application
    And User enters UserID as "mngr655644"
    And USer enters Password as "pUdupAp"
    When User clicks on Login button
    Then User will navigated to home page

  Scenario Outline: New account Creation
    And user clicks on New Account link
    And user enters Customer id as "<CustomerID>"
    And user selects the Account type as "<AccountType>"
    And user enters the Initial deposit amount as "<InitialDeposit>"
    When user clicks on the submit button
    Then new account successfully created
    And user captures the Account number

    Examples: 
      | CustomerID | AccountType | InitialDeposit |
      |      38594 | Saving      |           1000 |
