Feature: Admin logout akun
  Scenario: logout valid
    Given user enter main page
    When user click hamburger button
    And user enter logout button
    Then user successfully logout redirect to page login