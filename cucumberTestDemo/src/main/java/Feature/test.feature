@tag
Feature: Amazon.com
  I want to open Amazon.com

   
   Scenario Outline: Successful Login with Valid Credentials
	Given I open URL "https://www.amazon.com/"
	When User Navigate to signin Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |
   

 