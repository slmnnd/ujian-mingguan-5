Feature: Admin login akun
  #scenario = test case
  Scenario: login invalid username
    Given user enter url web
    When user enter wrong username
    And user enter password
    And user click login button
    Then user unsuccessfully login

  Scenario: login invalid password
    Given user enter url web
    When user enter username
    And user enter wrong password
    And user click login button
    Then user unsuccessfully login

  Scenario: login valid
    Given user enter url web
    When user enter username
    And user enter password
    And user click login button
    Then user successfully login redirect to main page
