#TCPAP-24
#Author: Neha Dhuri
@0.2
Feature: Delete Address functionality

Scenario 1: Verify Delete Address confirmation drawer is dislplayed when user clicks Delete button
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
When I click on "Delete" button
Then I should see Delete Address confirmation drawer
And I should see "Yes" button on Delete Address confirmation drawer
And I should see "Cancel" button on Delete Address confirmation drawer


Scenario 2: Verify Address is deleted on cliking Yes button of Delete address confirmation drawer
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
When I click on "Delete" button
And I click on "Yes" button
Then address should be deleted from Address card


Scenario 3: Verify Address is not deleted on clicking Cancel button of Delete address confirmation drawer
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
When I click on "Delete" button
And I click on "Cancel" button
Then Delete confirmation drawer should be closed
And Address should not be deleted

testing in sprit 3


