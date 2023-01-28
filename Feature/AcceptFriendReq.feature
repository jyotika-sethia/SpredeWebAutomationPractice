Feature: User is able to accept friend request
 
  @friendRequestRecd
  Scenario: User accept friend request
    Given user logs in
    When user click on Friend Tab
    Then user click on Friends Request Recieved 
    And user click on accept
    Then user verifies the friend in Friend List