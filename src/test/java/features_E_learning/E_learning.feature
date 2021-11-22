Feature: Login functionality 

Scenario Outline: E-learning login functionality

Given Initialize the browser with chrome
And Navigate to "http://elearningm1.upskills.in/"
When User enters <username> and <password> and login
Then Verify that login is succesful completed
And close the window

Examples: 
|username|password|
|Pavan|Pavan@123|


Scenario Outline: Signin operation

Given  Initialize the browser with chrome
And Navigate to "http://elearningm1.upskills.in/"
When User click on signup new page should open
And User should be able to enter  <newusername>, <newpassword>
Then User should be able to complete regsistration

Examples: 
|	newusername|		newpassword| 
|Pavan|		pavan12!@34#$| 





