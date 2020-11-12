Feature: Calendar workflow
  Scenario: I want to check that when we select tomorrow day it's selected in proper way
    Given I open 'Main Page'
    And Click on current day in 'On this day' section
    When I click on the tomorrow day in calendar
    Then I check that I am on tomorrow day page