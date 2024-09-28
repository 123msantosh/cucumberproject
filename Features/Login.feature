Feature: Login page scenario valid and in valid 

@P2
Scenario Outline: Login test with valid input for orangehrm application
Given user launch the browser
And opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter username as "<username>"
And user enters password as "<password>"
And click on login button
Then user navigates to dashboard page
Examples:
|username | password|
| admin   | admin123|
| admin   | admin@12|
| admin12 | admin123|

@P1
Scenario: Login test with invalid input for orangehrm application
Given user launch the browser
And opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter username as "admin"
And user enters password as "admin123"
And click on login button