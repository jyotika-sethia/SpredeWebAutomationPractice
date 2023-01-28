Feature: To Invite Freinds in Edit Target

  @Invite
  Scenario: To invite friend under Edit Target
    Given User log in into website
    When user click on target
    Then user click on view more
    And user click on Edit Target
    And user click on + icon
    Then user select friend
    Then user click on Update Target