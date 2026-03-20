@sanity
Feature: Login Feature

  Scenario Outline: Validate Login Functionality with correct credentials
    
    Given User opens a home page of application
    And User enters UserID as "<UserID>"
    And USer enters Password as "<Password>"
    When User clicks on Login button
    Then User will navigated to home page

    Examples: 
      | UserID     | Password |
      | mngr655644 | pUdupAp  |

  