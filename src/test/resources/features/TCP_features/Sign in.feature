#TCPAP-1
#Author: Neha Dhuri
@0.1

Feature: To verify sign-in functionality

Scenario 1: Verify that registered user/member redirected to home page post OTP validation
Given I am a registered user/member on TCP mobile app/website
When I validated the OTP
Then I should sign in to the TCP mobile app/website
And Homepage should be displayed

#Additional scenario for migrated user
Scenario 2: Verify that migrated user/member redirects to home page post OTP validation
Given I am a migrated user/member on TCP mobile app/website
When I validated the OTP
Then I should sign in to the TCP mobile app/website
And Homepage should be displayed
