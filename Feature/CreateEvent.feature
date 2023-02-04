Feature: Creating an event
  

  @event
  Scenario: Creating an event for the user
    Given user is on the sprede 
    When user login 
    Then user click on event tab
    Then user click on add new event
    And user enter Event Creation detail
    And user enter Event Configuration detail
    And user enter Event Template detail
    And user click on Create Event
    Then user verifies event is created