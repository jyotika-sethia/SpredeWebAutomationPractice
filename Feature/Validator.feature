Feature: User want to become event validator

@validator

Scenario: Sign up for event validator
	Given Login into Sprede
	When user click on validator toggle
	Then user fill the form
	Then user verify availability