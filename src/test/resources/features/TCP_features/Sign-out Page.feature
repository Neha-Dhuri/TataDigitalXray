#TCPAP-29
#Author: Neha Dhuri
@0.2
Feature:  Sign out page

Scenario 1: Verify that 'Sign Out' option is displayed when user signed in to the TCP on Mobile/Website
Given I am on the "Enter Mobile Number" page
When I sign-in to the TCP on Mobile/Website
Then I should see 'Sign Out' option


Scenario 2: Verify that 'Sign Out' option is not displayed when user has not signed-in to the TCP on Mobile/Website
Given I am on the "Enter Mobile Number" page
When I do not sign-in to the TCP on Mobile/Website
Then I should not see 'Sign Out' option


Scenario 3: Verify pop up warning message is displayed when user clicks on Sign Out option
Given I sign-in to the TCP on Mobile/Website
When I click on "sign-out" option in the page
Then I should see a pop up warning message
And I should see "Yes" button on a pop up warning message
And I should see "Cancel" button on a pop up warning message


Scenario 4: Verify User is signed-out on clicking Yes button of a pop up warning message
Given I sign-in to the TCP on Mobile/Website
When I click on "sign-out" option in the page
And I click on the "Yes" button
Then I should redirect to the "Enter Mobile Number" page


Scenario 5: Verify sign-out pop up warning is closed on clicking Cancel button
Given I sign-in to the TCP on Mobile/Website
When I click on "sign-out" option in the page
And I click on the "Cancel" button
Then sign-out popup warning should be closed


