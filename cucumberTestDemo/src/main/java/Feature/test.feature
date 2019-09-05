@tag
Feature: Amazon.com
  I want to open Amazon.com

  @tag1
  Scenario: google site sucessfull load
    Given I open the browser
    When I enter google url "https://www.google.com/"
   Then Google site opens
   When I enter UserName "test1" password "test2"
   
  @tag2
  Scenario: amazon site sucessfull load
    Given I open the browser
    When I enter Amazon url
   Then Amazon site opens 
   
   Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |
   

 