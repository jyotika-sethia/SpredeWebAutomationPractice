Feature: Manage Participant under event

  @blockParticipant
  Scenario: To block participant of an event
    Given User logs into the website
    When user clicks on event tab
    Then user goes to View Event under My Events
    And user click on Manage Participant
    Then user block an active participant
    Then user verifies the blocked participant