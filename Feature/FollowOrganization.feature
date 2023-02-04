Feature: Follow an organization
  
  @followorg
  Scenario: To follow an organization
    Given Login into Sprede
    When user is on Voxbox page
    Then user click on see all orgranization
    And user search the organization
    And user click on the organization
    Then user click on follow