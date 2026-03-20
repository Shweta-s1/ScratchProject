@sanity
Feature: Fundtransfer

  Background: 
    Given User opens a home page of application
    And User enters UserID as "mngr655644"
    And USer enters Password as "pUdupAp"
    When User clicks on Login button
    Then User will navigated to home page

  Scenario Outline: Fund transfer from one account to another account
    And user clicks on Fund transfer link
    And user enters Payers account no as "<PayersAccNo>"
    And user enters Payees account no as "<PayeesAccNo>"
    And user enters Amount as "<Amount5>"
    And user enters Description as "<Des>"
    When user clicks on Submit5 button
    Then user navigate to fund transfer details page
   
    Examples: 
      | PayersAccNo | PayeesAccNo | Amount5 | Des      |
      |      180748 |      180750 |     100 | Birthday |
