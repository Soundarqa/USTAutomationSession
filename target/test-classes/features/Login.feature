Feature: Application Login

@Standard @smoke
Scenario Outline: Home Page should be displayed
Given Open the application
When User is on login page
When User login to the application with username "<username>" and password "<password>"
Then Home Page is displayed

Examples:
|username               |password    |
|standard_user          |secret_sauce|
|problem_user           |secret_sauce|
|locked_out_user        |secret_sauce|
|performance_glitch_user|secret_sauce|
