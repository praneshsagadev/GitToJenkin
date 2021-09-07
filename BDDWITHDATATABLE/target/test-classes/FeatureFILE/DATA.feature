Feature: LOGIN FUNCTIONALITY

Scenario: ENTERING VALID USERNAME AND PASSWORD

Given I load the "https://opensource-demo.orangehrmlive.com/" sample
Then I enter username and password into the respective field
|username|password|
|Admin|admin123|
Then I click the login buton