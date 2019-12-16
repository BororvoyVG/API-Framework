Feature: EBAY.COM

  Scenario: Log in
    Given Open home page
    When User logs in with default credentials
    Then User verifies that he is logged in
