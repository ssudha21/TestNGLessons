Feature: Application Login
  I want to login to my application

  Background:
    Given user is on already exists
    When verified the DB status


 @SmokeTest
  Scenario:Login to application as admin user with valid
    Given user is on Landing page
    When user login to application with admin and admin123
    Then application Home page displayed
    And username displayed on toolbar

    Scenario Outline: Login to application as admin user with different roles
      Given user is on Landing page
      When user login with "<username>" and "<pwd>"
      Then application Home page displayed
      And username displayed on toolbar
Examples:
  | username | pwd  |
  | user1    | pwd1 |
  | user2    | pwd2 |
  | user3    | pwd3 |

  @SmokeTest
  Scenario:Enter user details
    Given user is on Landing page
    When user entered the details to register
      | Firstname |
      | Lastname  |
      | Dob       |
      | Address   |
      | phone#    |
    Then application Home page displayed
