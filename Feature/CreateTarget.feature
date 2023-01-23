Feature: User is able to create an Target
	
	@target
  Scenario: Creating an target for the user
    Given user is on the sprede 
    When user login 
    Then user click on target tab
    Then user click on add new target
    Then user fill the form with required details
    Then user click on Create Target
    Then user verifies target is created