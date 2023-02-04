Feature: User is able to send friend request
 

  @friendRequest
  Scenario: User sending friend request
    Given user goes to sprede website
    When user login on to the website
    Then user click on Friends Tab
    Then user click on find friends
    And user enter friend name in search bar
    And user click on Add Friends
    Then user verifies the friend request sent
  