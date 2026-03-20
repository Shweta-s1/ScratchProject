@sanity
Feature: Logout

  Background: 
    Given User opens a home page of application
    And User enters UserID as "mngr655644"
    And USer enters Password as "pUdupAp"
    When User clicks on Login button
    Then User will navigated to home page

  Scenario: Logout
    And user clciks on Logout link
    And user should be logged out successfully
