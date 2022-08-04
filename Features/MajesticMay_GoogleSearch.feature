@googleSearch @smokeTest
Feature: google search

@googleSearchSimple
Scenario Outline: simple search

Given I am on the google homepage
When I enter the search "<term>"
And I click on google search button 
Then I receive relevant results

@simpleSearchExample1
Examples:
|term								|
|Quality Assurance	|


@simpleSearchExample2
Examples:
|term								|
|Software Testing		|

