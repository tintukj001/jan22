Feature: log in emirates.com
Scenario: check flights to kochi from new york
Given I am on emirates page
When I enter user name and password
And I click login
And I successfully logged in
And i enter from and to along with my travelling date
Then i see the flights
