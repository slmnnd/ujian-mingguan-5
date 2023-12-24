Feature: user checkout product
  Scenario: checkout valid
    Given user make sure products in Cart
    When user click checkout button
    And user fill the form
    And user click continue button
    Then user successfully checked out

  Scenario: checkout invalid without fill the form
    Given user open Cart page
    When user click checkout button
    And user click continue button
    Then user unsuccessfully checked out

  Scenario: checkout invalid without product
    Given user open Cart page
    When user click checkout button
    And user fill the form
    And user click continue button
    Then user unsuccessfully checked out