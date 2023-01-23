Feature: User is able to create post

 @post
 Scenario: Creating post for the user
    Given user is on sprede website
    When user login on the website
    Then user enter text
    Then user select Target Linking
    And user select Event Linking
    #And user upload photo
    And click on Post button
    Then user verifies post on the VoxBox 