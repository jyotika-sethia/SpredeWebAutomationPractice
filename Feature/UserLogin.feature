Feature: User is able to login sprede website using valid user name and password

 @smoke
 Scenario: Login sprede using valid user name and password
   Given user is on sprede home page
   When user clicks on login option
   Then user verifies login screen
   When user enters email
   And user enters password
   And clicks login option
   Then user verifies logged in vox page